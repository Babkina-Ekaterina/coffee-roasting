package backend.test.coffee_roasting.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "roasting_outtake")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoastingOuttake {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "brigade_id")
    private UUID brigadeId;
    @Column(name = "origin_country")
    private String originCountry;
    @Column(name = "grain_type")
    private String grainType;
    @Column(name = "input_weight_grams")
    private double inputWeightGrams;
    @Column(name = "output_weight_grams")
    private double outputWeightGrams;
    @Column(name = "loss_percentage")
    private double lossPercentage;
}
