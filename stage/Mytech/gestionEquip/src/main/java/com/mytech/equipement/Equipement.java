package com.mytech.equipement;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipement {
    @Id
    @SequenceGenerator(
            name = "id_nom_equipement",
            sequenceName = "id_sequence_equipement"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_sequence_equipement"
    )
    private int id;
    private String name;
    private String type;
}
