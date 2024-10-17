package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.entity.GrainIntake;
import backend.test.coffee_roasting.data.entity.GrainStock;
import backend.test.coffee_roasting.data.mapper.GrainIntakeMapper;
import backend.test.coffee_roasting.data.mapper.GrainStockMapper;
import backend.test.coffee_roasting.data.repository.GrainIntakeRepository;
import backend.test.coffee_roasting.data.message.GrainIntakeMessage;
import backend.test.coffee_roasting.data.repository.GrainStockRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GrainIntakeService {
    private GrainIntakeRepository grainIntakeRepository;
    private GrainStockRepository grainStockRepository;
    private GrainIntakeMapper grainIntakeMapper;
    private GrainStockMapper grainStockMapper;

    @KafkaListener(topics = "grain-intake", groupId = "grain-consumers",
            containerFactory = "grainListenerContainerFactory")
    public void addGrainIntake(GrainIntakeMessage grainIntakeMessage) {
        log.info("Received Grain Intake message: {}", grainIntakeMessage);
        GrainIntake grainIntake = grainIntakeMapper.messageToEntity(grainIntakeMessage);
        grainIntakeRepository.save(grainIntake);

        List<GrainStock> existingStock = grainStockRepository.findByOriginCountryAndGrainType(
                grainIntake.getOriginCountry(),
                grainIntake.getGrainType());

        if (existingStock!= null && !existingStock.isEmpty() && existingStock.get(0) != null) {
            GrainStock grainStock = existingStock.get(0);
            grainStock.setAvailableWeightGrams(grainStock.getAvailableWeightGrams() + grainIntake.getWeightGrams());
            grainStockRepository.save(grainStock);
        } else {
            grainStockRepository.save(grainStockMapper.grainIntakeToGrainStock(grainIntake));
        }
    }
}
