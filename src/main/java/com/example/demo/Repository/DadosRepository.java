package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Dados;

public interface DadosRepository extends JpaRepository<Dados, Integer>{
    
}
