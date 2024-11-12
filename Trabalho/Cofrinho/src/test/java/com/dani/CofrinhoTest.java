package com.dani;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CofrinhoTest {

    Cofrinho cofrinho = new Cofrinho();

    @Test
    @DisplayName("Add Dolar")
    void adicionarDolar() {
        Dolar dolar = new Dolar();
        cofrinho.adicionar(dolar);

        List<Moeda> moedas = cofrinho.getListaMoedas();

        assertEquals(1, moedas.size());
        assertTrue(moedas.contains(dolar));
    }

    @Test
    @DisplayName("Add Euro")
    void adicionarEuro() {
        Euro euro = new Euro();
        cofrinho.adicionar(euro);

        List<Moeda> moedas = cofrinho.getListaMoedas();

        assertEquals(1, moedas.size());
        assertTrue(moedas.contains(euro));
    }

    @Test
    @DisplayName("Add Real")
    void adicionarReal() {
        Real real = new Real();
        cofrinho.adicionar(real);

        List<Moeda> moedas = cofrinho.getListaMoedas();

        assertEquals(1, moedas.size());
        assertTrue(moedas.contains(real));
    }

    @Test
    @DisplayName("Listar moedas")
    void listarMoedas() {
        cofrinho.adicionar(new Real(), new Euro(), new Dolar());
        assertEquals(3, cofrinho.getListaMoedas().size());
    }
}
