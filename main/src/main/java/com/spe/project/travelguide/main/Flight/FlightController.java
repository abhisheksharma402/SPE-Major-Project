package com.spe.project.travelguide.main.Flight;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flight")
@RequiredArgsConstructor
@Tag(name="Flight")
public class FlightController {

    private final FlightRepository flightRepository;

    @PostMapping("/add")
    ResponseEntity<FlightEntity> addFlight(@RequestBody FlightEntity flightEntity){
        flightRepository.save(flightEntity);
        return ResponseEntity.ok(flightEntity);
    }



}
