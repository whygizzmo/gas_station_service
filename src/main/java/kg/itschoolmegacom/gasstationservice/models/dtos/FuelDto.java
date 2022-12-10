package kg.itschoolmegacom.gasstationservice.models.dtos;

import kg.itschoolmegacom.gasstationservice.mappers.FuelMapper;
import kg.itschoolmegacom.gasstationservice.repository.FuelRepo;
import kg.itschoolmegacom.gasstationservice.service.FuelService;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FuelDto {
    Long id;
    String name;
    double pricePerLiter;



}
