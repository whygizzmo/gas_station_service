package kg.itschoolmegacom.gasstationservice.models.entity;

import kg.itschoolmegacom.gasstationservice.mappers.FuelMapper;
import kg.itschoolmegacom.gasstationservice.models.dtos.FuelDto;
import kg.itschoolmegacom.gasstationservice.repository.FuelRepo;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "fuels")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fuel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fuel_seq")
    @SequenceGenerator(name = "fuel_seq",sequenceName = "fuel_sequence")
    long id;
    String name;
    double pricePerLiter;

    @Autowired
    private FuelRepo fuelRepo;

    public Fuel(Long id) {
        Fuel fuelForTransform = fuelRepo.findById(id).get();
                //fuelMapper.toFuelDto(fuelRepo.findById(id).get());
        this.id = fuelForTransform.getId();
        this.name = fuelForTransform.getName();
        this.pricePerLiter = fuelForTransform.getPricePerLiter();
        


}
}
