package backend.test.coffee_roasting.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "grain_intake")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GrainIntake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "origin_country")
    private String originCountry;
    @Column(name = "grain_type")
    private String grainType;
    @Column(name = "arabica_percentage")
    private double arabicaPercentage;
    @Column(name = "robusta-percentage")
    private double robustaPercentage;
    @Column(name = "weight_grams")
    private double weightGrams;
}
