package com.spe.project.travelguide.main.dto.response;

import com.spe.project.travelguide.main.Flight.FlightEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FlightBookResponse {

    private int bookingStatus;
    private String seatNumber;
    private FlightEntity flightEntity;

}
