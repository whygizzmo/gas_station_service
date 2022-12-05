package kg.itschoolmegacom.gasstationservice.service.impl;

import kg.itschoolmegacom.gasstationservice.mappers.FuelMapper;
import kg.itschoolmegacom.gasstationservice.models.dtos.FuelDto;
import kg.itschoolmegacom.gasstationservice.models.dtos.request.FuelCalculateRequest;
import kg.itschoolmegacom.gasstationservice.models.entity.Fuel;
import kg.itschoolmegacom.gasstationservice.service.FuelService;
import kg.itschoolmegacom.gasstationservice.repository.FuelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelServiceImpl implements FuelService {


//   private Optional<Fuel> fuel = Optional.of(new Fuel());
    @Autowired
    private FuelRepo fuelRepo;

    @Autowired
    public FuelServiceImpl(FuelRepo fuelRepo) {

        this.fuelRepo = fuelRepo;
    }

    @Override
    public ResponseEntity<?> save(FuelDto fuelDto) {
        Fuel fuel = FuelMapper.INSTANCE.toFuel(fuelDto);
        fuel = fuelRepo.save(fuel);

        fuelDto = FuelMapper.INSTANCE.toFuelDto(fuel);

        return ResponseEntity.ok(fuelDto);
    }

    @Override
    public FuelDto calculate(FuelCalculateRequest fuelCalculateRequest) {
        Fuel fuel;
        fuel = fuelRepo.findByFuelId(fuelCalculateRequest.getFuelId());
        System.out.println(fuel.toString());
        //FuelDto fuelDto = FuelMapper.INSTANCE.toFuelDto;
          FuelDto fuelDto = FuelMapper.INSTANCE.toFuelDto(fuel);
        System.err.println(fuelDto.toString());
        return fuelDto;
    }

    @Override
    public List<Fuel> getFuel() {
        return fuelRepo.findAll();
    }
}
