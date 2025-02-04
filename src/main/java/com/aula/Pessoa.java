package com.aula;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    
    public String nome;
    public LocalDateTime nascimento;


    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }


    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento,LocalDateTime.now());
    }


    public boolean ehMaiorDeIdade(){
        return getIdade() >=18;
    }
    

}
