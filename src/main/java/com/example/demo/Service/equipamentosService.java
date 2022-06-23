package com.example.demo.Service;

import com.example.demo.Model.equipamentos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.equipamentosRepository;

@Service
public class equipamentosService {
    @Autowired
    private equipamentosRepository er;

    public List<equipamentos> geteEquipamentos(){
        if(er.count() == 0){

            er.save(new equipamentos("Notebook", 8500.00, 10000.00, 93.60));
            er.save(new equipamentos("Desktop", 8500.00, 10000.00, 46.80));
         }
        return er.findAll();
    }


    public equipamentos getEquipamentosById(Integer id) {
        return er.findById(id).get();
    }  
}
