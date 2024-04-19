package com.spe.project.travelguide.main.Payment;

import com.spe.project.travelguide.main.FlightBooking.FlightBookingEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private LocalDateTime paymentDate;
    private String transactionId;

    // Define relationships with different types of bookings
    @ManyToOne
    @JoinColumn(name = "flight_booking_id")
    private FlightBookingEntity flightBooking;

}
