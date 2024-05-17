package com.mytech.equipement;

import org.springframework.stereotype.Service;

@Service
public record EquipementService(EquipementRepository equipementRepository) {
    public void enregistrerEquipement(EnregistrementEquipementRequest equipRequest) {
        Equipement equipement = Equipement.builder()
                .name(equipRequest.name())
                .type(equipRequest.type())
                .build();
        equipementRepository.save(equipement);

    }
}
