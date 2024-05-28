package com.example.equipement.controller;

import com.example.equipement.Equipement;
import com.example.equipement.service.EquipService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    public Equipement registerEquipment(@RequestParam String name, @RequestParam String status, @RequestParam String client) {
        return equipService.registerEquip(name, status, client);
    }
}
