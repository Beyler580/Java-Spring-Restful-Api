package com.example.spring.dataaccess;

import com.example.spring.entity.EmplooyeEntitty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplooyeDao extends JpaRepository<EmplooyeEntitty,Integer> {

    void  deleteById(int id );
    EmplooyeEntitty findById(int id);



}
