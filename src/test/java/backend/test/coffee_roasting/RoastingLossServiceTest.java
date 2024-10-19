package backend.test.coffee_roasting;

import backend.test.coffee_roasting.data.entity.RoastingOuttake;
import backend.test.coffee_roasting.data.repository.RoastingOuttakeRepository;
import backend.test.coffee_roasting.service.RoastingLossService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RoastingLossServiceTest {
    @Mock
    private RoastingOuttakeRepository roastingOuttakeRepository;

    @InjectMocks
    private RoastingLossService roastingLossService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void givenBrigadeIdAndOriginCountry_whenGetLossPercentage_thenReturnsCorrectSum() {
        // given
        UUID brigadeId = UUID.randomUUID();
        String originCountry = "Brazil";

        List<RoastingOuttake> roastingOuttakes = List.of(
                new RoastingOuttake(1L, brigadeId, "Brazil", "Arabica", 1000.0, 950.0, 5.0),
                new RoastingOuttake(2L, brigadeId, "Brazil", "Robusta", 1000.0, 920.0, 8.0)
        );

        when(roastingOuttakeRepository.findByOriginCountryAndBrigadeId(originCountry, brigadeId))
                .thenReturn(roastingOuttakes);

        // when
        Double result = roastingLossService.getLossPercentage(brigadeId, originCountry);

        // then
        assertEquals(13.0, result);
        verify(roastingOuttakeRepository).findByOriginCountryAndBrigadeId(originCountry, brigadeId);
    }

    @Test
    public void givenOnlyOriginCountry_whenGetLossPercentage_thenReturnsCorrectSum() {
        // given
        String originCountry = "Vietnam";

        List<RoastingOuttake> roastingOuttakes = List.of(
                new RoastingOuttake(3L, UUID.randomUUID(), "Vietnam", "Arabica", 800.0, 760.0, 5.0),
                new RoastingOuttake(4L, UUID.randomUUID(), "Vietnam", "Robusta", 900.0, 860.0, 4.5)
        );

        when(roastingOuttakeRepository.findByOriginCountry(originCountry))
                .thenReturn(roastingOuttakes);

        // when
        Double result = roastingLossService.getLossPercentage(null, originCountry);

        // then
        assertEquals(9.5, result);
        verify(roastingOuttakeRepository).findByOriginCountry(originCountry);
    }

    @Test
    public void givenOnlyBrigadeId_whenGetLossPercentage_thenReturnsCorrectSum() {
        // given
        UUID brigadeId = UUID.randomUUID();

        List<RoastingOuttake> roastingOuttakes = List.of(
                new RoastingOuttake(5L, brigadeId, "Colombia", "Arabica", 1000.0, 970.0, 3.0),
                new RoastingOuttake(6L, brigadeId, "Brazil", "Robusta", 1200.0, 1140.0, 5.0)
        );

        when(roastingOuttakeRepository.findByBrigadeId(brigadeId))
                .thenReturn(roastingOuttakes);

        // when
        Double result = roastingLossService.getLossPercentage(brigadeId, null);

        // then
        assertEquals(8.0, result);
        verify(roastingOuttakeRepository).findByBrigadeId(brigadeId);
    }

    @Test
    public void givenNoFilters_whenGetLossPercentage_thenReturnsCorrectSum() {
        // given
        List<RoastingOuttake> roastingOuttakes = List.of(
                new RoastingOuttake(7L, UUID.randomUUID(), "Brazil", "Arabica", 1500.0, 1400.0, 6.67),
                new RoastingOuttake(8L, UUID.randomUUID(), "Colombia", "Robusta", 1000.0, 950.0, 5.0),
                new RoastingOuttake(9L, UUID.randomUUID(), "Vietnam", "Arabica", 2000.0, 1950.0, 2.5)
        );

        when(roastingOuttakeRepository.findAll()).thenReturn(roastingOuttakes);

        // when
        Double result = roastingLossService.getLossPercentage(null, null);

        // then
        assertEquals(14.17, result, 0.01);
        verify(roastingOuttakeRepository).findAll();
    }

    @Test
    public void givenNoRoastingOuttakes_whenGetLossPercentage_thenReturnsZero() {
        // given
        when(roastingOuttakeRepository.findAll()).thenReturn(List.of());

        // when
        Double result = roastingLossService.getLossPercentage(null, null);

        // then
        assertEquals(0.0, result);
        verify(roastingOuttakeRepository).findAll();
    }
}
