package kg.itschoolmegacom.gasstationservice.repository;

import kg.itschoolmegacom.gasstationservice.models.entity.HistoryClientFuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryClientFuelRepo extends JpaRepository<HistoryClientFuel,Long> {
}
