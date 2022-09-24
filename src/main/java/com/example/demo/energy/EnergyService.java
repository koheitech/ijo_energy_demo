package com.example.demo.energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyService {
    private final EnergyRepository energyRepository;

    @Autowired
    public EnergyService(EnergyRepository energyRepository) {
        this.energyRepository = energyRepository;
    }

    public List<Energy> getEnergies() {
        return energyRepository.findAll();
    }

    public void addNewEnergy(Energy energy) {
        energyRepository.save(energy);
    }
}
