package backend.test.coffee_roasting.data.repository;

import backend.test.coffee_roasting.data.entity.GrainIntake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface GrainIntakeRepository extends JpaRepository<GrainIntake, Long> {
}
