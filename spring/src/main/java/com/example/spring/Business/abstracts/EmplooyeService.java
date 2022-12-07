package com.example.spring.Business.abstracts;

import com.example.spring.entity.EmplooyeDto;
import com.example.spring.entity.EmplooyeEntitty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmplooyeService {

    void add(EmplooyeEntitty emplooyeEntitty);
    List<EmplooyeEntitty> getAll();
    void deleteById(int id);

    void updateEmplooye(int id, EmplooyeDto emplooyeDto);

}
