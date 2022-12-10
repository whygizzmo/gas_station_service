package kg.itschoolmegacom.gasstationservice.service.impl;

import kg.itschoolmegacom.gasstationservice.mappers.HistoryClientFuelMapper;
import kg.itschoolmegacom.gasstationservice.models.dtos.HistoryClientFuelDto;
import kg.itschoolmegacom.gasstationservice.models.entity.HistoryClientFuel;
import kg.itschoolmegacom.gasstationservice.repository.HistoryClientFuelRepo;
import kg.itschoolmegacom.gasstationservice.service.HistoryClientFuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HistoryClientFuelServiceImpl implements HistoryClientFuelService {


    @Autowired
    private HistoryClientFuelRepo historyClientFuelRepo;

    @Autowired
    public HistoryClientFuelServiceImpl(HistoryClientFuelRepo historyClientFuelRepo) {

        this.historyClientFuelRepo = historyClientFuelRepo;
    }

    @Override
    public ResponseEntity<?> save(HistoryClientFuelDto historyClientFuelDto) {
        HistoryClientFuel historyClientFuel = HistoryClientFuelMapper.INSTANCE.toHistory(historyClientFuelDto);
        historyClientFuel = historyClientFuelRepo.save(historyClientFuel);

        historyClientFuelDto = HistoryClientFuelMapper.INSTANCE.toHistoryDto(historyClientFuel);

        return ResponseEntity.ok(historyClientFuelDto);
    }

}
