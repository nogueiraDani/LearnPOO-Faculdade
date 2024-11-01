package com.dani;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	@DisplayName("novo curso com valor positivo")
	void infoCurso() {
		Curso curso = new Curso("Engenharia", 500.00);
		assertEquals("Curso: Engenharia. Mensalidade: R$ 500.00", 
				curso.infoCurso());
	}
	
	@Test
	@DisplayName("novo curso com valor negativo")
	void infoCurso2() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Curso("Engenharia", -100.00);
		});
	}

}
