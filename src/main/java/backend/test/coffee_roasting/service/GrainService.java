package backend.test.coffee_roasting.service;

import backend.test.coffee_roasting.data.mapper.GrainMapper;
import backend.test.coffee_roasting.data.repository.GrainIntakeRepository;
import backend.test.coffee_roasting.data.message.GrainMessage;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GrainService {
    private GrainIntakeRepository grainIntakeRepository;
    private GrainMapper grainMapper;

    @KafkaListener(topics = "grain-intake", groupId = "grain-consumers", containerFactory = "grainListenerContainerFactory")
    public void consumeGrainIntake(GrainMessage grainMessage) {
        grainIntakeRepository.save(grainMapper.messageToEntity(grainMessage));
    }
}
