package kg.itschoolmegacom.gasstationservice.controllers;

import kg.itschoolmegacom.gasstationservice.models.dtos.HistoryClientFuelDto;
import kg.itschoolmegacom.gasstationservice.models.entity.HistoryClientFuel;
import kg.itschoolmegacom.gasstationservice.service.HistoryClientFuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/history")
public class HistoryClientFuelController {
    @Autowired
    private HistoryClientFuelService historyClientFuelService;

    @PostMapping("/save")
    public ResponseEntity<?> saveHistory(@RequestBody
                                         HistoryClientFuelDto historyClientFuelDto){
        return historyClientFuelService.save(historyClientFuelDto);
    }
}
