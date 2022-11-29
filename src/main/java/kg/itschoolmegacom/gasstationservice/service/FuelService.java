package kg.itschoolmegacom.gasstationservice.service;

import kg.itschoolmegacom.gasstationservice.models.dtos.FuelDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface FuelService {
    ResponseEntity<?> save(FuelDto fuelDto);
}
