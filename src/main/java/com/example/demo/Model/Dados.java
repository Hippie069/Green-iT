package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dados {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    private int qtdEquip;
    private int qtdNote;
    private double resultCusto;
    private double resultEnergia;
    private double resultPreco;
    private double precoTotal;
    private double energiaTotal;

    /*private List<Double> resultPreco;
    private List<Double> resultEnergia;
    private List<Double> resultCusto;
    private double result251;
    private double result252;
    private double result501;
    private double result502;
    private double result751;
    private double result752;
    private double result1001;
    private double result1002;*/
    


    public Dados() {
    }

    public Dados(int ID, int qtdEquip, int qtdNote) {
        this.ID = ID;
        this.qtdEquip = qtdEquip;
        this.qtdNote = qtdNote;
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQtdEquip() {
        return this.qtdEquip;
    }

    public void setQtdEquip(int qtdEquip) {
        this.qtdEquip = qtdEquip;
    }

    public int getQtdNote() {
        return this.qtdNote;
    }

    public void setQtdNote(int qtdNote) {
        this.qtdNote = qtdNote;
    }


    public double getResultCusto() {
        return this.resultCusto;
    }

    public void setResultCusto(double resultCusto) {
        this.resultCusto = resultCusto;
    }


    public double getResultEnergia() {
        return this.resultEnergia;
    }

    public void setResultEnergia(double resultEnergia) {
        this.resultEnergia = resultEnergia;
    }

    public double getResultPreco() {
        return this.resultPreco;
    }

    public void setResultPreco(double resultPreco) {
        this.resultPreco = resultPreco;
    }
    

    public double getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getEnergiaTotal() {
        return this.energiaTotal;
    }

    public void setEnergiaTotal(double energiaTotal) {
        this.energiaTotal = energiaTotal;
    }


}
