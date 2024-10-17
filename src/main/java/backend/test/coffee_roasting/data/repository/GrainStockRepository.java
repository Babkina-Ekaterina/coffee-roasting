package backend.test.coffee_roasting.data.repository;

import backend.test.coffee_roasting.data.entity.GrainStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface GrainStockRepository extends JpaRepository<GrainStock, Long> {
    List<GrainStock> findByOriginCountryAndGrainType(String originCountry, String grainType);
    List<GrainStock> findByOriginCountry(String originCountry);
    List<GrainStock> findByGrainType(String grainType);
}
