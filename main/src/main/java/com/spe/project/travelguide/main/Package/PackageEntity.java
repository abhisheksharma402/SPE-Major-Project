package com.spe.project.travelguide.main.Package;


import com.spe.project.travelguide.main.Agency.AgencyEntity;
import com.spe.project.travelguide.main.Agent.AgentEntity;
import com.spe.project.travelguide.main.Itinerary.ItineraryItemEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="package")
public class PackageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int numberOfDays;

    private int numberOfNights;

    private String placesToVisit;

    private String description;

    @OneToMany(mappedBy = "packageEntity", cascade = CascadeType.ALL)
    private List<ItineraryItemEntity> itinerary;

    @ManyToOne
    @JoinColumn(name="agency_id")
    private AgencyEntity agency;

    @ManyToOne
    @JoinColumn(name="agent_id")
    private AgentEntity agent;


}
