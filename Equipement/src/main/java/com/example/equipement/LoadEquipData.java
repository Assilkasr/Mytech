package com.example.equipement;

import org.apache.hc.core5.reactor.Command;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configurable
public class LoadEquipData {
    @Bean
    CommandLineRunner initDatabase(EquipRepository repository) {
        return args -> {
            repository.save(new Equipement("Telephone1", "In Progress", "Client A"));
            repository.save(new Equipement("Telephone2", "Repaired", "Client B"));
            repository.save(new Equipement("Ordinateur", "Not Repaired", "Client C"));
        };
    }
}
