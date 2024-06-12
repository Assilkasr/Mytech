package com.example.equipement.service;

import com.example.equipement.Intervention;
import com.example.equipement.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionService {
    @Autowired
    private InterventionRepository interventionRepository;

    public List<Intervention> getAllInterventions() {
        return interventionRepository.findAll();
    }

    public Intervention getInterventionById(Long id) {
        return interventionRepository.findById(id).orElse(null);
    }

    public Intervention saveIntervention(Intervention intervention) {
        return interventionRepository.save(intervention);
    }

    public void deleteIntervention(Long id) {
        interventionRepository.deleteById(id);
    }
}
