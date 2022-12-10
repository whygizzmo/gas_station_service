package kg.itschoolmegacom.gasstationservice.models.entity;

import kg.itschoolmegacom.gasstationservice.models.enums.PayStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client_fuel_history")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HistoryClientFuel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "history_seq")
            @SequenceGenerator(name = "history_seq",sequenceName = "history_sequence")
    long id;
    @ManyToOne
    @JoinColumn(name = "fuel_id")
    Fuel fuel;
    @ManyToOne

    @JoinColumn(name = "client_id")
    Client client;
    double volume;
    double amount;
    double change;
    String PlateNumber;

    @CreationTimestamp
    Date CreatedData;

    @Enumerated(value = EnumType.ORDINAL)
    PayStatus payStatus;




}
