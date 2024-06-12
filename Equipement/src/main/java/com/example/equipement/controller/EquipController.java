package com.example.equipement.controller;

import com.example.equipement.Equipement;
import com.example.equipement.service.EquipService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@AllArgsConstructor

public class EquipController {

    @GetMapping("/equip")
    public String equip(){
        return "test1";
    }


    private final EquipService equipService;

    @PostMapping("/register")
    public Equipement registerEquipment(@RequestParam("name") String name, @RequestParam("status") String status) {
        return equipService.registerEquip(name, status);
    }

    @GetMapping("/list")
    public List<Equipement> getAllEquipements() {
        return equipService.getAllEquipements();
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipService.getEquipementById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipService.deleteEquipement(id);
    }
}
