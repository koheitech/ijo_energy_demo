package com.example.demo.energy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnergyRepository extends JpaRepository<Energy, Long> {
    Optional<Energy> findEnergyById(Long id);
}
