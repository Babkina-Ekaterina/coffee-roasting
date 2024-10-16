package backend.test.coffee_roasting.data.mapper;

import backend.test.coffee_roasting.data.entity.RoastingOuttake;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeRequest;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RoastingOuttakeMapper {
    public RoastingOuttake requestToEntity(RoastingOuttakeRequest roastingOuttakeRequest) {
        RoastingOuttake roastingOuttake = new RoastingOuttake();
        double inputWeightGrams = roastingOuttakeRequest.getInputWeightGrams();
        double outputWeightGrams = roastingOuttakeRequest.getOutputWeightGrams();

        roastingOuttake.setGrainType(roastingOuttakeRequest.getGrainType());
        roastingOuttake.setOriginCountry(roastingOuttakeRequest.getOriginCountry());
        roastingOuttake.setInputWeightGrams(inputWeightGrams);
        roastingOuttake.setOutputWeightGrams(outputWeightGrams);

        UUID brigadeId = UUID.fromString(roastingOuttakeRequest.getBrigadeId());
        roastingOuttake.setBrigadeId(brigadeId);

        double lossPercentage = (inputWeightGrams - outputWeightGrams) / inputWeightGrams * 100;
        roastingOuttake.setLossPercentage(lossPercentage);

        return roastingOuttake;
    }
}
