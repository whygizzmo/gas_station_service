package kg.itschoolmegacom.gasstationservice.service.impl;

import kg.itschoolmegacom.gasstationservice.mappers.FuelMapper;
import kg.itschoolmegacom.gasstationservice.models.dtos.FuelDto;
import kg.itschoolmegacom.gasstationservice.models.dtos.HistoryClientFuelDto;
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
    public ResponseEntity<?> calculate(FuelCalculateRequest fuelCalculateRequest) {
        Fuel fuel;
        fuel = fuelRepo.findById(fuelCalculateRequest.getFuelId()).get();
        FuelDto fuelDto = FuelMapper.INSTANCE.toFuelDto(fuel);

        double resultPrice = fuelDto.getPricePerLiter()*fuelCalculateRequest.getVolume();




        return ResponseEntity.ok(null);//HistoryClientFuelDto
    }

    @Override
    public List<Fuel> getFuel() {
       return fuelRepo.findAll();

    }

    @Override
    public Fuel getOne(Long id) {
        Fuel fuel = fuelRepo.findById(id).get();
        return fuel;
    }
}
