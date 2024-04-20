package com.spe.project.travelguide.main.Agency;


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

    @Column(unique = true)
    private String email;

    private Long phoneNumber;

    private String address;

    private String licenseNumber;

    private Boolean isVerified;

    private String emailDomain;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
    private List<PackageEntity> packages;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL)
    private List<AgentEntity> agents;


}
