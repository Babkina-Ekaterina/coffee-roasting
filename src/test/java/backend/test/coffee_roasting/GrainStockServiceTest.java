package backend.test.coffee_roasting;

import backend.test.coffee_roasting.data.entity.GrainStock;
import backend.test.coffee_roasting.data.repository.GrainStockRepository;
import backend.test.coffee_roasting.service.GrainStockService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GrainStockServiceTest {
    @Mock
    private GrainStockRepository grainStockRepository;

    @InjectMocks
    private GrainStockService grainStockService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void givenOriginCountryAndGrainType_whenGetAvailableWeightGrams_thenReturnsCorrectSum() {
        // given
        String originCountry = "Brazil";
        String grainType = "Arabica";

        List<GrainStock> grainStocks = List.of(
                new GrainStock("Arabica", "Brazil", 500.0),
                new GrainStock("Arabica", "Brazil", 300.0)
        );

        when(grainStockRepository.findByOriginCountryAndGrainType(originCountry, grainType))
                .thenReturn(grainStocks);

        // when
        Double result = grainStockService.getAvailableWeightGrams(originCountry, grainType);

        // then
        assertEquals(800.0, result);
        verify(grainStockRepository).findByOriginCountryAndGrainType(originCountry, grainType);
    }

    @Test
    public void givenOnlyOriginCountry_whenGetAvailableWeightGrams_thenReturnsCorrectSum() {
        // given
        String originCountry = "Vietnam";

        List<GrainStock> grainStocks = List.of(
                new GrainStock("Robusta", "Vietnam", 200.0),
                new GrainStock("Arabica", "Vietnam", 150.0)
        );

        when(grainStockRepository.findByOriginCountry(originCountry))
                .thenReturn(grainStocks);

        // when
        Double result = grainStockService.getAvailableWeightGrams(originCountry, null);

        // then
        assertEquals(350.0, result);
        verify(grainStockRepository).findByOriginCountry(originCountry);
    }

    @Test
    public void givenOnlyGrainType_whenGetAvailableWeightGrams_thenReturnsCorrectSum() {
        // given
        String grainType = "Robusta";

        List<GrainStock> grainStocks = List.of(
                new GrainStock("Robusta", "Colombia", 400.0),
                new GrainStock("Robusta", "Vietnam", 600.0)
        );

        when(grainStockRepository.findByGrainType(grainType))
                .thenReturn(grainStocks);

        // when
        Double result = grainStockService.getAvailableWeightGrams(null, grainType);

        // then
        assertEquals(1000.0, result);
        verify(grainStockRepository).findByGrainType(grainType);
    }

    @Test
    public void givenNoFilters_whenGetAvailableWeightGrams_thenReturnsCorrectSum() {
        // given
        List<GrainStock> grainStocks = List.of(
                new GrainStock("Arabica", "Brazil", 500.0),
                new GrainStock("Robusta", "Colombia", 200.0),
                new GrainStock("Arabica", "Vietnam", 300.0)
        );

        when(grainStockRepository.findAll()).thenReturn(grainStocks);

        // when
        Double result = grainStockService.getAvailableWeightGrams(null, null);

        // then
        assertEquals(1000.0, result);
        verify(grainStockRepository).findAll();
    }

    @Test
    public void givenNoStocks_whenGetAvailableWeightGrams_thenReturnsZero() {
        // given
        when(grainStockRepository.findAll()).thenReturn(List.of());

        // when
        Double result = grainStockService.getAvailableWeightGrams(null, null);

        // then
        assertEquals(0.0, result);
        verify(grainStockRepository).findAll();
    }
}
