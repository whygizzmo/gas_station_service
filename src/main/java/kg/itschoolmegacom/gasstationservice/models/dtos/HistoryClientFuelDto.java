package kg.itschoolmegacom.gasstationservice.models.dtos;

import kg.itschoolmegacom.gasstationservice.models.entity.Client;
import kg.itschoolmegacom.gasstationservice.models.entity.Fuel;
import kg.itschoolmegacom.gasstationservice.models.enums.PayStatus;
import kg.itschoolmegacom.gasstationservice.service.FuelService;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HistoryClientFuelDto {
    long id;
    Fuel fuel;
    Client client;
    double volume;
    double amount;
    double change;
    String PlateNumber;
    Date CreateData;
    PayStatus payStatus;

    public HistoryClientFuelDto(long fuel, Client client,
                                double volume, double amount, double change, String plateNumber,
                                Date createData, PayStatus payStatus) {

        Fuel fuelTransform = new Fuel(fuel);




        this.fuel = fuelTransform;
        this.client = client;
        this.volume = volume;
        this.amount = amount;
        this.change = change;
        PlateNumber = plateNumber;

    }
}
