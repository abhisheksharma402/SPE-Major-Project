package com.spe.project.travelguide.main.Agency;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.spe.project.travelguide.main.Agent.AgentEntity;
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
@Table(name="agency")
public class AgencyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private Long phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String licenseNumber;

    @Column(nullable = false)
    private Boolean isVerified;

    @Column(nullable = false)
    private String emailDomain;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
    @JsonManagedReference (value = "agency-package")
    private List<PackageEntity> packages;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "agency-agent")
    private List<AgentEntity> agents;


}
