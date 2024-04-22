package com.spe.project.travelguide.main.Agent;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    @JsonManagedReference (value = "agent-package")
    private List<PackageEntity> packages;

    @ManyToOne
    @JoinColumn(name="agency_id")
    @JsonBackReference(value = "agency-agent")
    private AgencyEntity agency;

}
