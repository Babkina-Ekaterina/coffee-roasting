package backend.test.coffee_roasting.data.message;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GrainIntakeMessage {
    private String originCountry;
    private String grainType;
    private double robustaPercentage;
    private double arabicaPercentage;
    private int numberOfBags;
}
