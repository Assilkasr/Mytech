package com.example.equipement.service;


import com.example.equipement.EquipRepository;
import com.example.equipement.Equipement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipService {

    private final EquipRepository equipmentRepository;

    public Equipement registerEquip(String name, String status) {
        Equipement newEquipment = new Equipement(name,status);
        return equipmentRepository.save(newEquipment);
    }

    public List<Equipement> getAllEquipements() {
        return equipmentRepository.findAll();
    }

    public Equipement getEquipementById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    public Equipement saveEquipement(Equipement equipement) {
        return equipmentRepository.save(equipement);
    }

    public void deleteEquipement(Long id) {
        equipmentRepository.deleteById(id);
    }
}
