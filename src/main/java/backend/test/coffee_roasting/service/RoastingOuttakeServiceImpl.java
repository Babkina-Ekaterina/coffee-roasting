package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.entity.GrainStock;
import backend.test.coffee_roasting.data.mapper.RoastingOuttakeMapper;
import backend.test.coffee_roasting.data.repository.GrainStockRepository;
import backend.test.coffee_roasting.data.repository.RoastingOuttakeRepository;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeRequest;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeResponse;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingServiceGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@Slf4j
@GrpcService
@AllArgsConstructor
public class RoastingOuttakeServiceImpl extends RoastingServiceGrpc.RoastingServiceImplBase {
    private RoastingOuttakeRepository roastingOuttakeRepository;
    private GrainStockRepository grainStockRepository;
    private RoastingOuttakeMapper roastingOuttakeMapper;

    @Override
    public void addRoastingOuttake(RoastingOuttakeRequest roastingOuttakeRequest,
                                   StreamObserver<RoastingOuttakeResponse> responseObserver) {
        log.info("Received Roasting Outtake request: {}", roastingOuttakeRequest);

        String grainType = roastingOuttakeRequest.getGrainType();
        String originCountry = roastingOuttakeRequest.getOriginCountry();
        double inputWeightGrams = roastingOuttakeRequest.getInputWeightGrams();

        List<GrainStock> existingStock = grainStockRepository.findByOriginCountryAndGrainType(originCountry, grainType);

        if (existingStock == null || existingStock.isEmpty() || existingStock.get(0) == null) {
            StatusRuntimeException exception = Status.INVALID_ARGUMENT
                    .withDescription("No stock available for specified grain type and origin country.")
                    .asRuntimeException();
            responseObserver.onError(exception);
            return;
        }

        GrainStock grainStock = existingStock.get(0);

        if (grainStock.getAvailableWeightGrams() < inputWeightGrams) {
            StatusRuntimeException exception = Status.INVALID_ARGUMENT
                    .withDescription("Not enough grain available for roasting.")
                    .asRuntimeException();
            responseObserver.onError(exception);
            return;
        }

        grainStock.setAvailableWeightGrams(grainStock.getAvailableWeightGrams() - inputWeightGrams);
        grainStockRepository.save(grainStock);

        roastingOuttakeRepository.save(roastingOuttakeMapper.requestToEntity(roastingOuttakeRequest));

        RoastingOuttakeResponse roastingOuttakeResponse = RoastingOuttakeResponse.newBuilder()
                .setMessage("Roasting outtake information received successfully.")
                .build();

        responseObserver.onNext(roastingOuttakeResponse);
        responseObserver.onCompleted();
    }
}

