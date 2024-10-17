package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.entity.GrainStock;
import backend.test.coffee_roasting.data.repository.GrainStockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GrainStockService {
    private GrainStockRepository grainStockRepository;

    public Double getAvailableWeightGrams(String originCountry, String grainType) {
        List<GrainStock> grainStocks;

        if (originCountry != null && grainType != null) {
            grainStocks = grainStockRepository.findByOriginCountryAndGrainType(originCountry, grainType);
        } else if (originCountry != null) {
            grainStocks = grainStockRepository.findByOriginCountry(originCountry);
        } else if (grainType != null) {
            grainStocks = grainStockRepository.findByGrainType(grainType);
        } else {
            grainStocks = grainStockRepository.findAll();
        }

        return grainStocks.stream()
                .mapToDouble(GrainStock::getAvailableWeightGrams)
                .sum();
    }
}
