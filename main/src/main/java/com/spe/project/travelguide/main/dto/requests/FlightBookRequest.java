package com.spe.project.travelguide.main.dto.requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FlightBookRequest {

    private int email;
    private int flightNumber;
    private String seatNumber;
    private String meals;

}
