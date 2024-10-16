package backend.test.coffee_roasting.data.mapper;

import backend.test.coffee_roasting.data.entity.GrainIntake;
import backend.test.coffee_roasting.data.message.GrainIntakeMessage;
import org.springframework.stereotype.Component;

@Component
public class GrainIntakeMapper {
    private static final double BAG_WEIGHT_KILOGRAMS = 60;

    public GrainIntake messageToEntity(GrainIntakeMessage grainIntakeMessage) {
        GrainIntake grainIntake = new GrainIntake();

        double weightGrams = grainIntakeMessage.getNumberOfBags() * BAG_WEIGHT_KILOGRAMS * 1000;
        grainIntake.setOriginCountry(grainIntakeMessage.getCountryOfOrigin());
        grainIntake.setGrainType(grainIntakeMessage.getGrainType());
        grainIntake.setRobustaPercentage(grainIntakeMessage.getRobustaPercentage());
        grainIntake.setArabicaPercentage(grainIntakeMessage.getArabicaPercentage());
        grainIntake.setWeightGrams(weightGrams);

        return grainIntake;
    }
}
