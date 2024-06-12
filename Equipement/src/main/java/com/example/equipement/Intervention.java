package com.example.equipement;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Intervention{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date dateIntervention;
    private String description;

    @ManyToOne
    @JoinColumn(name = "equipement_id")
    private Equipement equipement;


}
