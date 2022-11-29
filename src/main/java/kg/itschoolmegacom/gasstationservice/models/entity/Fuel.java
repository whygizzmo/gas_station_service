package kg.itschoolmegacom.gasstationservice.models.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "fuels")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fuel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fuel_seq")
    @SequenceGenerator(name = "fuel_seq",sequenceName = "fuel_sequence")
    long id;
    String name;
    double pricePerLiter;
}
