package com.mytech.equipement;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("ALL")
@Slf4j
@RestController
@RequestMapping("api/v1/gestionEquip")
public record EquipementController(EquipementService equipementService) {

    private static final Logger log = LoggerFactory.getLogger(EquipementController.class);

    @PostMapping
    public void registerEquip(@RequestBody EnregistrementEquipementRequest equipRequest){
        log.info("enregistrement d'un nouvel equipement {} ", equipRequest);
        equipementService.enregistrerEquipement(equipRequest);
    }
}
