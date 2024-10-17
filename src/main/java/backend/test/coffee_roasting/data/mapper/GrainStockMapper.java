package backend.test.coffee_roasting.data.mapper;

import backend.test.coffee_roasting.data.entity.GrainIntake;
import backend.test.coffee_roasting.data.entity.GrainStock;
import org.springframework.stereotype.Component;

@Component
public class GrainStockMapper {
    public GrainStock grainIntakeToGrainStock(GrainIntake grainIntake) {
        GrainStock grainStock = new GrainStock();

        grainStock.setGrainType(grainIntake.getGrainType());
        grainStock.setOriginCountry(grainIntake.getOriginCountry());
        grainStock.setAvailableWeightGrams(grainIntake.getWeightGrams());

        return grainStock;
    }
}
