package com.example.demo.Service;

import com.example.demo.Model.Dados;
import com.example.demo.Model.equipamentos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DadosRepository;
import com.example.demo.Repository.equipamentosRepository;

@Service
public class DadosService {
    @Autowired
    private DadosRepository dr;

    public void addDados(Dados Dados){
        dr.save(Dados);
    }

    public Dados getDadosById(int Id){
        return dr.findById(Id).get();
    }

    public List<Dados> getTodosDados(){
        return dr.findAll();
    }

    public double calculo(Dados dados, equipamentos equip){
        double resul;

        resul = dados.getQtdNote() * equip.getPrecoMin();


        return resul;
    }

    public double calcEnergia(Dados dados, equipamentos equip1, equipamentos equip2){
        
        double r;

        r = (equip2.getMedGastoEnergia()*dados.getQtdEquip()) - (equip1.getMedGastoEnergia()*dados.getQtdNote());


        return r;
    }

    public double calcGasto(Dados dados, equipamentos equip1, equipamentos equip2){

        double r;

        r = (((equip2.getMedGastoEnergia()*dados.getQtdEquip())*0.6)*12) - ((((equip1.getMedGastoEnergia()*dados.getQtdNote())*0.6)*12) + dados.getResultCusto());

        return r;
    }

    public double calcGastoTotal(Dados dados, equipamentos equip){
        double r;

        r = (((equip.getMedGastoEnergia()*dados.getQtdNote())*0.6)*12) + dados.getResultCusto();

        return r;
    }

    public double calcEnergiaTotal(Dados dados, equipamentos equip){
        
        double r;

        r = equip.getMedGastoEnergia()*dados.getQtdNote();


        return r;
    }



}
