package backend.test.coffee_roasting.controller;

import backend.test.coffee_roasting.service.GrainStockService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/grain_stock")
@Tag(name = "Grain stock", description = "Endpoints for grain stock information")
public class GrainStockController {
    private GrainStockService grainStockService;

    @GetMapping("/available")
    public ResponseEntity<Double> getAvailableWeightGrams(
            @Parameter(description = "Origin country for coffee")
            @RequestParam(value = "originCountry", required = false) String originCountry,

            @Parameter(description = "Coffee grain type")
            @RequestParam(value = "grainType", required = false) String grainType) {
        return ResponseEntity.ok(grainStockService.getAvailableWeightGrams(originCountry, grainType));
    }
}
