package com.mytech.equipement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class GestionEquip {
    public static void main(String[] args){
        SpringApplication.run(GestionEquip.class, args);
    }
}
