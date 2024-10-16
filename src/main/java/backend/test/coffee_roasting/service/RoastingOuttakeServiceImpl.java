package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.mapper.RoastingOuttakeMapper;
import backend.test.coffee_roasting.data.repository.RoastingOuttakeRepository;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeRequest;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeResponse;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@AllArgsConstructor
public class RoastingOuttakeServiceImpl extends RoastingServiceGrpc.RoastingServiceImplBase {
    private RoastingOuttakeRepository roastingOuttakeRepository;
    private RoastingOuttakeMapper roastingOuttakeMapper;

    @Override
    public void addRoastingOuttake(RoastingOuttakeRequest roastingOuttakeRequest,
                                   StreamObserver<RoastingOuttakeResponse> responseObserver) {
        log.info("Received Roasting Outtake request: {}", roastingOuttakeRequest);
        roastingOuttakeRepository.save(roastingOuttakeMapper.requestToEntity(roastingOuttakeRequest));

        RoastingOuttakeResponse roastingOuttakeResponse = RoastingOuttakeResponse.newBuilder()
                .setMessage("Roasting outtake information saved successfully.")
                .build();

        responseObserver.onNext(roastingOuttakeResponse);
        responseObserver.onCompleted();
    }
}

