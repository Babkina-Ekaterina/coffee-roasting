package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.entity.RoastingOuttake;
import backend.test.coffee_roasting.data.repository.RoastingOuttakeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoastingLossService {
    private RoastingOuttakeRepository roastingOuttakeRepository;

    public Double getLossPercentage(UUID brigadeId, String originCountry) {
        List<RoastingOuttake> grainStocks;

        if (originCountry != null && brigadeId != null) {
            grainStocks = roastingOuttakeRepository.findByOriginCountryAndBrigadeId(originCountry, brigadeId);
        } else if (originCountry != null) {
            grainStocks = roastingOuttakeRepository.findByOriginCountry(originCountry);
        } else if (brigadeId != null) {
            grainStocks = roastingOuttakeRepository.findByBrigadeId(brigadeId);
        } else {
            grainStocks = roastingOuttakeRepository.findAll();
        }

        return grainStocks.stream()
                .mapToDouble(RoastingOuttake::getLossPercentage)
                .sum();
    }
}
