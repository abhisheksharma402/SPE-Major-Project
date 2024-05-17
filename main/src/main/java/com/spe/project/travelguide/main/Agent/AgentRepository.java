package com.spe.project.travelguide.main.Agent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgentRepository extends JpaRepository<AgentEntity, Integer> {
    Optional<AgentEntity> findByEmail(String email);
}
