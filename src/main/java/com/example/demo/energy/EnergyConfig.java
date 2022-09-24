package com.example.demo.energy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EnergyConfig {

    @Bean
    CommandLineRunner commandLineRunner(EnergyRepository repository) {
        return args -> {
            Energy energy1 = new Energy(
                    "12%",
                    "34%",
                    "100",
                    false,
                    "10",
                    "30 kb"
            );

            Energy energy2 = new Energy(
                    "10%",
                    "30%",
                    "10",
                    true,
                    "20",
                    "50 kb"
            );

            repository.saveAll(
                    List.of(energy1, energy2)
            );
        };
    }
}
