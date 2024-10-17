package backend.test.coffee_roasting.data.repository;

import backend.test.coffee_roasting.data.entity.RoastingOuttake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@EnableJpaRepositories
@Repository
public interface RoastingOuttakeRepository extends JpaRepository<RoastingOuttake, Long> {
    List<RoastingOuttake> findByOriginCountryAndBrigadeId(String originCountry, UUID brigadeId);
    List<RoastingOuttake> findByOriginCountry(String originCountry);
    List<RoastingOuttake> findByBrigadeId(UUID brigadeId);
}
