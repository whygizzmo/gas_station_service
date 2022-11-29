package kg.itschoolmegacom.gasstationservice.controllers;

import kg.itschoolmegacom.gasstationservice.models.dtos.FuelDto;
import kg.itschoolmegacom.gasstationservice.models.dtos.request.FuelCalculateRequest;
import kg.itschoolmegacom.gasstationservice.service.FuelService;
import kg.itschoolmegacom.gasstationservice.service.impl.FuelServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/fuel")
public class FuelController {

    private FuelService fuelService;

     @PostMapping("/calculate")
    public ResponseEntity<?> calculateFuel(@RequestBody FuelCalculateRequest fuelCalculateRequest){
     return ResponseEntity.ok(fuelCalculateRequest);
     }

     @PostMapping("/save")
    public ResponseEntity<?> saveFuel(@RequestBody FuelDto fuelDto){
         return fuelService.save(fuelDto);

     }
}
