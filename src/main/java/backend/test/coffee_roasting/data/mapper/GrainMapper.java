package backend.test.coffee_roasting.data.mapper;

import backend.test.coffee_roasting.data.entity.GrainIntake;
import backend.test.coffee_roasting.data.message.GrainMessage;
import org.springframework.stereotype.Component;

@Component
public class GrainMapper {
    private static final double BAG_WEIGHT_KILOGRAMS = 60;

    public GrainIntake messageToEntity(GrainMessage grainMessage) {
        GrainIntake grainIntake = new GrainIntake();

        double weightGrams = grainMessage.getNumberOfBags() * BAG_WEIGHT_KILOGRAMS * 1000;
        grainIntake.setOriginCountry(grainMessage.getCountryOfOrigin());
        grainIntake.setGrainType(grainMessage.getGrainType());
        grainIntake.setRobustaPercentage(grainMessage.getRobustaPercentage());
        grainIntake.setArabicaPercentage(grainMessage.getArabicaPercentage());
        grainIntake.setWeightGrams(weightGrams);

        return grainIntake;
    }
}
