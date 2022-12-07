package com.example.spring.api;

import com.example.spring.dataaccess.EmplooyeDao;
import com.example.spring.Business.abstracts.EmplooyeService;
import com.example.spring.entity.EmplooyeDto;
import com.example.spring.entity.EmplooyeEntitty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
@RequestMapping("/emplooye")
@RestController


public class EmplooyeController {

    private final EmplooyeDao emplooyeDao;

    private final EmplooyeService emplooyeService;
    @Autowired
    public EmplooyeController(EmplooyeDao emplooyeDao, EmplooyeService emplooyeService){
        this.emplooyeDao = emplooyeDao;
        this.emplooyeService =emplooyeService;
    }

    @GetMapping("/getAll")
    public List<EmplooyeEntitty> getAll(){
        return emplooyeService.getAll();

    }
    @PostMapping("/add")
    public void addData(@RequestBody EmplooyeEntitty emplooyeEntitty){

        emplooyeService.add(emplooyeEntitty);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable(value = "id") int id ){
        emplooyeService.deleteById(id);


    }
    @PutMapping("/update/{id}")
    public void updateEmplooye(@PathVariable int id,@Valid @RequestBody EmplooyeDto emplooyeDto){

        emplooyeService.updateEmplooye(id,emplooyeDto);



    }


}
