package com.example.equipement;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String name;
    public String status;


    public Equipement(String name, String status) {
        this.name = name;
        this.status = status;
    }
}

