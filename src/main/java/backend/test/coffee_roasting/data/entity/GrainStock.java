package backend.test.coffee_roasting.data.entity;

import backend.test.coffee_roasting.data.entity.pk.GrainStockPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "grain_stock")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@IdClass(GrainStockPK.class)
public class GrainStock {
    @Id
    @Column(name = "grain_type", nullable = false)
    private String grainType;
    @Id
    @Column(name = "origin_country", nullable = false)
    private String originCountry;
    @Column(name = "available_weight_grams")
    private double availableWeightGrams;
}
