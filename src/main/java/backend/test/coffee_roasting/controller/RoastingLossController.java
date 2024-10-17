package backend.test.coffee_roasting.controller;

import backend.test.coffee_roasting.service.RoastingLossService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/roasting_loss")
@Tag(name = "Roasting loss", description = "Endpoints for roasting loss information")
public class RoastingLossController {
    private RoastingLossService roastingLossService;

    @GetMapping
    public ResponseEntity<Double> getLossPercentage(
            @Parameter(description = "Unique identifier of brigade")
            @RequestParam(value = "brigadeId", required = false) UUID brigadeId,

            @Parameter(description = "Origin country for coffee")
            @RequestParam(value = "originCountry", required = false) String originCountry) {
        return ResponseEntity.ok(roastingLossService.getLossPercentage(brigadeId, originCountry));
    }
}
