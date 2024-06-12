package com.example.equipement;

import org.apache.hc.core5.reactor.Command;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadEquipData {
    @Bean
    CommandLineRunner initDatabase(EquipRepository repository) {
        return args -> {
            repository.save(new Equipement("Telephone1", "In Progress"));
            repository.save(new Equipement("Telephone2", "Repaired"));
            repository.save(new Equipement("Ordinateur", "Not Repaired"));
        };
    }
}
