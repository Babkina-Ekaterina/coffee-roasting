package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.mapper.GrainIntakeMapper;
import backend.test.coffee_roasting.data.repository.GrainIntakeRepository;
import backend.test.coffee_roasting.data.message.GrainIntakeMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GrainIntakeService {
    private GrainIntakeRepository grainIntakeRepository;
    private GrainIntakeMapper grainIntakeMapper;

    @KafkaListener(topics = "grain-intake", groupId = "grain-consumers",
            containerFactory = "grainListenerContainerFactory")
    public void addGrainIntake(GrainIntakeMessage grainIntakeMessage) {
        log.info("Received Grain Intake message: {}", grainIntakeMessage);
        grainIntakeRepository.save(grainIntakeMapper.messageToEntity(grainIntakeMessage));
    }
}
