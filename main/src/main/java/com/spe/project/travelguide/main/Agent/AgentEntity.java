package com.spe.project.travelguide.main.Agent;

import com.spe.project.travelguide.main.Agency.AgencyEntity;
import com.spe.project.travelguide.main.Package.PackageEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="agent")
public class AgentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phoneNumber;

    private String email;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    private List<PackageEntity> packages;

    @ManyToOne
    @JoinColumn(name="agency_id")
    private AgencyEntity agency;

}
