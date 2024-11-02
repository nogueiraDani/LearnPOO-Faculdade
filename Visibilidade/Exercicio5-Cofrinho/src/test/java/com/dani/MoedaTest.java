package com.dani;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoedaTest {

	@Test
	@DisplayName("calcular total cofrinho")
	void test() {
		Cofrinho cofrinho = new Cofrinho();
		cofrinho.adicionar(new Moeda("Euro", 0.50));
		cofrinho.adicionar(new Moeda("Euro", 1.00));
		cofrinho.adicionar(new Moeda("Euro", 0.25));
		cofrinho.adicionar(new Moeda("Euro", 0.10));
		cofrinho.adicionar(new Moeda("Euro", 0.05));
		
		assertEquals("Saldo: 1.90", cofrinho.calcularTotal());
		
	}

}
