package backend.test.coffee_roasting.data.entity.pk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GrainStockPK implements Serializable {
    private String grainType;
    private String originCountry;
}
