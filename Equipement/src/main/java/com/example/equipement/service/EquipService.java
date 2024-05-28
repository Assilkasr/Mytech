package com.example.equipement.service;


import com.example.equipement.EquipRepository;
import com.example.equipement.Equipement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EquipService {

    private final EquipRepository equipmentRepository;

    public Equipement registerEquip(String name, String status, String client) {
        Equipement newEquipment = new Equipement(name,status,client);
        return equipmentRepository.save(newEquipment);
    }
}
