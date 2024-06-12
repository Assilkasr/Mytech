package com.example.equipement.controller;

import com.example.equipement.Intervention;
import com.example.equipement.service.InterventionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping
@AllArgsConstructor

public class InterventionController{
    @Autowired
    private InterventionService interventionService;

    @GetMapping("/inter")
    public String equip() {return "cet equipement a eu une intervention";}

    @GetMapping("/list")
    public List<Intervention> getAllInterventions() {
        return interventionService.getAllInterventions();
    }

}
