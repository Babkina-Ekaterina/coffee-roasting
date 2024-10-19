package backend.test.coffee_roasting;

import backend.test.coffee_roasting.data.entity.GrainStock;
import backend.test.coffee_roasting.data.entity.RoastingOuttake;
import backend.test.coffee_roasting.data.mapper.RoastingOuttakeMapper;
import backend.test.coffee_roasting.data.repository.GrainStockRepository;
import backend.test.coffee_roasting.data.repository.RoastingOuttakeRepository;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeRequest;
import backend.test.coffee_roasting.grpc.roasting_outtake.RoastingOuttakeResponse;
import backend.test.coffee_roasting.service.RoastingOuttakeServiceImpl;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RoastingOuttakeServiceImplTest {
    @Mock
    private RoastingOuttakeRepository roastingOuttakeRepository;

    @Mock
    private GrainStockRepository grainStockRepository;

    @Mock
    private RoastingOuttakeMapper roastingOuttakeMapper;

    @InjectMocks
    private RoastingOuttakeServiceImpl roastingOuttakeService;

    @Mock
    private StreamObserver<RoastingOuttakeResponse> responseObserver;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void givenValidRequest_whenAddRoastingOuttake_thenSavesOuttakeAndUpdatesStock() {
        // given
        RoastingOuttakeRequest request = RoastingOuttakeRequest.newBuilder()
                .setGrainType("Arabica")
                .setOriginCountry("Brazil")
                .setInputWeightGrams(500.0)
                .build();

        GrainStock grainStock = new GrainStock();
        grainStock.setAvailableWeightGrams(1000.0);

        when(grainStockRepository.findByOriginCountryAndGrainType("Brazil", "Arabica"))
                .thenReturn(List.of(grainStock));
        when(roastingOuttakeMapper.requestToEntity(request)).thenReturn(new RoastingOuttake());

        ArgumentCaptor<RoastingOuttakeResponse> responseCaptor = ArgumentCaptor.forClass(RoastingOuttakeResponse.class);

        // when
        roastingOuttakeService.addRoastingOuttake(request, responseObserver);

        // then
        verify(grainStockRepository).save(grainStock);
        verify(roastingOuttakeRepository).save(any(RoastingOuttake.class));
        verify(responseObserver).onNext(responseCaptor.capture());
        verify(responseObserver).onCompleted();

        RoastingOuttakeResponse response = responseCaptor.getValue();
        assertEquals("Roasting outtake information received successfully.", response.getMessage());
        assertEquals(500.0, grainStock.getAvailableWeightGrams());
    }

    @Test
    public void givenInsufficientStock_whenAddRoastingOuttake_thenReturnsError() {
        // given
        RoastingOuttakeRequest request = RoastingOuttakeRequest.newBuilder()
                .setGrainType("Arabica")
                .setOriginCountry("Brazil")
                .setInputWeightGrams(1500.0)
                .build();

        GrainStock grainStock = new GrainStock();
        grainStock.setAvailableWeightGrams(1000.0);

        when(grainStockRepository.findByOriginCountryAndGrainType("Brazil", "Arabica"))
                .thenReturn(List.of(grainStock));

        ArgumentCaptor<Throwable> errorCaptor = ArgumentCaptor.forClass(Throwable.class);

        // when
        roastingOuttakeService.addRoastingOuttake(request, responseObserver);

        // then
        verify(responseObserver).onError(errorCaptor.capture());
        StatusRuntimeException exception = (StatusRuntimeException) errorCaptor.getValue();
        assertEquals("Not enough grain available for roasting.", exception.getStatus().getDescription());
    }

    @Test
    public void givenNoStock_whenAddRoastingOuttake_thenReturnsError() {
        // given
        RoastingOuttakeRequest request = RoastingOuttakeRequest.newBuilder()
                .setGrainType("Robusta")
                .setOriginCountry("Vietnam")
                .setInputWeightGrams(500.0)
                .build();

        when(grainStockRepository.findByOriginCountryAndGrainType("Vietnam", "Robusta"))
                .thenReturn(Collections.emptyList());

        ArgumentCaptor<Throwable> errorCaptor = ArgumentCaptor.forClass(Throwable.class);

        // when
        roastingOuttakeService.addRoastingOuttake(request, responseObserver);

        // then
        verify(responseObserver).onError(errorCaptor.capture());
        StatusRuntimeException exception = (StatusRuntimeException) errorCaptor.getValue();
        assertEquals("No stock available for specified grain type and origin country.", exception.getStatus().getDescription());
    }
}
