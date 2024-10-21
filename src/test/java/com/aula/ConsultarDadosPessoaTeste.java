package com.aula;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConsultarDadosPessoaTeste {
    //execucao unica no inicio e no fim da classe de teste
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
       
    }
    //várias execuções ao longo dos testes
    @BeforeEach
    void insereDadosTeste(){
        BancoDeDados.insereDados(new Pessoa("Leticia",LocalDateTime.of(1999, 3, 21, 14, 0,0)));
    }
    
    @AfterEach
    void removeDadosTeste(){
        BancoDeDados.removeDados(new Pessoa("Leticia",LocalDateTime.of(1999, 3, 21, 14, 0,0)));
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
       
    }
}
