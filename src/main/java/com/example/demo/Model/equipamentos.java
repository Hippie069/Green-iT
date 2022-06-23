package com.example.demo.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class equipamentos implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    private String nome;
    private double precoMin;
    private double precoMax;
    private double medGastoEnergia;

    public equipamentos() {
    }

    public equipamentos(String nome, double precoMin, double precoMax, double medGastoEnergia) {
        this.nome = nome;
        this.precoMin = precoMin;
        this.precoMax = precoMax;
        this.medGastoEnergia = medGastoEnergia;
    }
    

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoMin() {
        return this.precoMin;
    }

    public void setPrecoMin(double precoMin) {
        this.precoMin = precoMin;
    }

    public double getPrecoMax() {
        return this.precoMax;
    }

    public void setPrecoMax(double precoMax) {
        this.precoMax = precoMax;
    }

    public double getMedGastoEnergia() {
        return this.medGastoEnergia;
    }

    public void setMedGastoEnergia(double medGastoEnergia) {
        this.medGastoEnergia = medGastoEnergia;
    }


}