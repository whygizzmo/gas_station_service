package kg.itschoolmegacom.gasstationservice.models.dtos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FuelDto {
    Long id;
    String name;
    double pricePerLiter;
}
