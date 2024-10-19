package backend.test.coffee_roasting;

import backend.test.coffee_roasting.data.entity.GrainIntake;
import backend.test.coffee_roasting.data.entity.GrainStock;
import backend.test.coffee_roasting.data.mapper.GrainIntakeMapper;
import backend.test.coffee_roasting.data.mapper.GrainStockMapper;
import backend.test.coffee_roasting.data.message.GrainIntakeMessage;
import backend.test.coffee_roasting.data.repository.GrainIntakeRepository;
import backend.test.coffee_roasting.data.repository.GrainStockRepository;
import backend.test.coffee_roasting.service.GrainIntakeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GrainIntakeServiceTest {
    @Mock
    private GrainIntakeRepository grainIntakeRepository;

    @Mock
    private GrainStockRepository grainStockRepository;

    @Mock
    private GrainIntakeMapper grainIntakeMapper;

    @Mock
    private GrainStockMapper grainStockMapper;

    @InjectMocks
    private GrainIntakeService grainIntakeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void givenValidGrainIntakeMessage_whenAddGrainIntake_thenGrainIsSavedToRepository() {
        // given
        GrainIntakeMessage message = new GrainIntakeMessage("Brazil", "Arabica", 70, 30, 10);
        GrainIntake grainIntake = new GrainIntake();
        grainIntake.setOriginCountry("Brazil");
        grainIntake.setGrainType("Arabica");
        grainIntake.setRobustaPercentage(70);
        grainIntake.setArabicaPercentage(30);
        grainIntake.setWeightGrams(60000);

        when(grainIntakeMapper.messageToEntity(message)).thenReturn(grainIntake);

        GrainStock grainStock = new GrainStock();

        when(grainStockRepository.findByOriginCountryAndGrainType("Brazil", "Arabica"))
                .thenReturn(List.of(grainStock));
        when(grainStockMapper.grainIntakeToGrainStock(grainIntake)).thenReturn(grainStock);

        // when
        grainIntakeService.addGrainIntake(message);

        // then
        verify(grainIntakeRepository, times(1)).save(grainIntake);
        verify(grainStockRepository, times(1)).save(grainStock);
        assertEquals(60000, grainStock.getAvailableWeightGrams());
    }

    @Test
    void givenNoExistingStock_whenAddGrainIntake_thenCreateNewStock() {
        // given
        GrainIntakeMessage message = new GrainIntakeMessage("Ethiopia", "Arabica", 0, 100, 20);
        GrainIntake grainIntake = new GrainIntake();
        grainIntake.setOriginCountry("Ethiopia");
        grainIntake.setGrainType("Arabica");
        grainIntake.setWeightGrams(120000);

        when(grainIntakeMapper.messageToEntity(message)).thenReturn(grainIntake);
        when(grainStockRepository.findByOriginCountryAndGrainType("Brazil", "Arabica"))
                .thenReturn(Collections.emptyList());

        GrainStock newStock = new GrainStock();

        when(grainStockMapper.grainIntakeToGrainStock(grainIntake)).thenReturn(newStock);

        // when
        grainIntakeService.addGrainIntake(message);

        // then
        verify(grainStockRepository, times(1)).save(newStock);
    }

    @Test
    void givenExistingStock_whenAddGrainIntake_thenUpdateStock() {
        // given
        GrainIntakeMessage message = new GrainIntakeMessage("Colombia", "Robusta", 100, 0, 5);
        GrainIntake grainIntake = new GrainIntake();
        grainIntake.setOriginCountry("Colombia");
        grainIntake.setGrainType("Robusta");
        grainIntake.setWeightGrams(30000);

        when(grainIntakeMapper.messageToEntity(message)).thenReturn(grainIntake);

        GrainStock existingStock = new GrainStock();

        when(grainStockRepository.findByOriginCountryAndGrainType("Colombia", "Robusta"))
                .thenReturn(List.of(existingStock));

        // when
        grainIntakeService.addGrainIntake(message);

        // then
        verify(grainStockRepository, times(1)).save(existingStock);
        assertEquals(30000, existingStock.getAvailableWeightGrams());
    }
}
