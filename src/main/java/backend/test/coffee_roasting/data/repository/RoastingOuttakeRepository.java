package backend.test.coffee_roasting.data.repository;

import backend.test.coffee_roasting.data.entity.RoastingOuttake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface RoastingOuttakeRepository extends JpaRepository<RoastingOuttake, Long> {
}
