package com.dani;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class ContaTest {

    private final Conta conta = new Conta("teste", 100);
    private final Conta conta2 = new Conta("teste2", 0);

    //depositar
    @Test
    @DisplayName("Depositar valor negativo")
    void depositarValorNegativo(){
        assertThrows(Exception.class, () ->{
           conta.depositar(-100);
        });
    }

    @Test
    @DisplayName("Depositar positivo")
    void depositarPositivo() throws Exception {
        try {
            conta.depositar(200);
        } catch (Exception e) {
            throw new Exception(e);
        }
        assertEquals(300, conta.getSaldo());
    }

    //sacar
    @Test
    @DisplayName("Saque com valor negativo")
    void sacarValorNegativo(){
        assertThrows(RuntimeException.class, ()-> {
            conta.sacar(-100);
        });
    }

    @Test
    @DisplayName("Saque com valor maior que saldo")
    void sacarValorMaiorQueSaldo(){
        assertThrows(RuntimeException.class, () -> {
            conta.sacar(200);
        });
    }

    @Test
    @DisplayName("Saque com valor compativel")
    void sacarValor(){
        conta.sacar(50);
        assertEquals(50, conta.getSaldo());
    }

    //transferir
    @Test
    @DisplayName("Transferir valor negativo")
    void transferirValorNegativo(){
        assertThrows(RuntimeException.class, () -> {
        conta.transferir(-100, conta2);
        });
    }

    @Test
    @DisplayName("Transferir valor maior que saldo")
    void transferirValorMaiorQueSaldo(){
        assertThrows(RuntimeException.class, () -> {
            conta.transferir(200, conta2);
        });
    }

    @Test
    @DisplayName("Transferir valor compativel")
    void transferirValorCompativel(){
        conta.transferir(100, conta2);
        assertEquals(100, conta2.getSaldo());
        assertEquals(0, conta.getSaldo());
    }
}
