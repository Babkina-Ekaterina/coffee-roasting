package backend.test.coffee_roasting.data.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GrainMessage {
    private String countryOfOrigin;
    private String grainType;
    private double robustaPercentage;
    private double arabicaPercentage;
    private int numberOfBags;
}
