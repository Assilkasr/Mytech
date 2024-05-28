package com.example.equipement;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipRepository  extends CrudRepository<Equipement, Long>{
}
