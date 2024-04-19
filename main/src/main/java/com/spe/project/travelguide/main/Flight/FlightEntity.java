package com.spe.project.travelguide.main.Flight;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="flight")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true)
    private String flightNumber;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivateDateTime;
    private String originAirportCode;
    private String destAirportCode;
    private int availableSeats;

}
