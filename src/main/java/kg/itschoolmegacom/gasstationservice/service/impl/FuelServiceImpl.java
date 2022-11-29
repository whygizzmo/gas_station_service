package kg.itschoolmegacom.gasstationservice.service.impl;

import kg.itschoolmegacom.gasstationservice.mappers.FuelMapper;
import kg.itschoolmegacom.gasstationservice.models.dtos.FuelDto;
import kg.itschoolmegacom.gasstationservice.models.entity.Fuel;
import kg.itschoolmegacom.gasstationservice.service.FuelService;
import kg.itschoolmegacom.gasstationservice.repository.FuelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FuelServiceImpl implements FuelService {

    private  FuelRepo fuelRepo;

    @Autowired
    public FuelServiceImpl(FuelRepo fuelRepo){

        this.fuelRepo = fuelRepo;
    }
    @Override
    public ResponseEntity<?> save(FuelDto fuelDto) {
        Fuel fuel = FuelMapper.INSTANCE.toFuel(fuelDto);
        fuel = fuelRepo.save(fuel);

        fuelDto = FuelMapper.INSTANCE.toFuelDto(fuel);

        return ResponseEntity.ok(fuelDto);
    }
}
