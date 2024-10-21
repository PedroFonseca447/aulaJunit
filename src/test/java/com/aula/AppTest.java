package com.aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    void deveCalcularIdadeCorretamente(){
       Pessoa p1 = new Pessoa("Pedro", LocalDateTime.of(2000,5, 21, 15 , 0 ,0)); 
       assertEquals(24, p1.getIdade());
    }
}
