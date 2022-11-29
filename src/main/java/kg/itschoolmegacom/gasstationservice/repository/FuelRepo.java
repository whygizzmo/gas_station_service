package kg.itschoolmegacom.gasstationservice.repository;

import kg.itschoolmegacom.gasstationservice.models.entity.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepo extends JpaRepository<Fuel,Long> {
}
