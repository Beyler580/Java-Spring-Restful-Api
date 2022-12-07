package com.example.spring.Business.concretes;

import com.example.spring.Business.abstracts.EmplooyeService;
import com.example.spring.dataaccess.EmplooyeDao;
import com.example.spring.entity.EmplooyeDto;
import com.example.spring.entity.EmplooyeEntitty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmplooyeManager implements EmplooyeService {

    private EmplooyeDao emplooyeDao;
    @Autowired
    public EmplooyeManager(EmplooyeDao emplooyeDao){

        this.emplooyeDao = emplooyeDao;

    }


    public void add(EmplooyeEntitty emplooyeEntitty) {

        emplooyeDao.save(emplooyeEntitty);

    }

    public List<EmplooyeEntitty> getAll() {
        return emplooyeDao.findAll();
    }

    @Override
    public void deleteById(int id ) {
        emplooyeDao.deleteById(id);


    }

    @Override
    public void updateEmplooye(int id, EmplooyeDto emplooyeDto) {
        EmplooyeEntitty updatedEmplooye = emplooyeDao.findById(id);
        if(emplooyeDto.getName()==null){
            updatedEmplooye.setName(updatedEmplooye.getName());

        }else{
            updatedEmplooye.setName(emplooyeDto.getName());
        }if(emplooyeDto.getSurName()==null) {
            updatedEmplooye.setSurname(updatedEmplooye.getSurname());
        }else{
            updatedEmplooye.setSurname(emplooyeDto.getSurName());
        }if(emplooyeDto.getAdress()==null){
            updatedEmplooye.setAdress(updatedEmplooye.getAdress());
        }else{
            updatedEmplooye.setAdress(emplooyeDto.getAdress());
        }

          emplooyeDao.save(updatedEmplooye);






    }

}

