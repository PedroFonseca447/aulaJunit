package com.aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
    

    @Test
    void validarLancamentos(){
        int [] primeiroLancamento = {10 , 20, 30, 40, 50};
        int [] segundoLancamento = {-1 , 25, 3, 10, 16};

        Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
    }


    @Test

    void validarSeObjetoEstaNulo(){
        Pessoa p1 = null;

        Assertions.assertNull(p1);

        
    }
}
