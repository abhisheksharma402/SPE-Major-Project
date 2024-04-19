package com.spe.project.travelguide.main.FlightBooking;


import com.spe.project.travelguide.main.Flight.FlightEntity;
import com.spe.project.travelguide.main.User.UserEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="flight_booking_entity")
public class FlightBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="flight_id")
    private FlightEntity flight;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

    private String seatNumber;

    private String meals;

}
