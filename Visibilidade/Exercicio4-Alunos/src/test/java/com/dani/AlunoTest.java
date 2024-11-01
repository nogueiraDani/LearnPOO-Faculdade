package com.dani;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AlunoTest{

	
	@Test
	@DisplayName("desconto de 10%")
	void infoPagamento() {
		Aluno aluno = new Aluno("Maria", 100, 0.1, new Curso("Engenharia", 500.0));
		assertEquals("Valor da mensalidade: R$ 450.00", aluno.infoMensalidade());
	}
	
	@Test
	@DisplayName("desconto de 50%")
	void infoPagamento2() {
		Aluno aluno = new Aluno("José", 100, 0.5, new Curso("ADS", 1500.0));
		assertEquals("Valor da mensalidade: R$ 750.00", aluno.infoMensalidade());
	}
	
	@Test
	@DisplayName("desconto de 99%")
	void infoPagamento3() {
		Aluno aluno = new Aluno("José", 100, 0.99, new Curso("ADS", 1500.0));
		assertEquals("Valor da mensalidade: R$ 15.00",
				aluno.infoMensalidade());
	}
	
	@Test
	@DisplayName("desconto negativo")
	void infoPagamento4() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Aluno("José", 100, -1, new Curso("ADS", 1500.0));
		});
	}
	
	@Test
	@DisplayName("desconto maior que 100")
	void infoPagamento5() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Aluno("José", 100, 1.1, new Curso("ADS", 1500.0));
		});
	}
	
	@Test
	@DisplayName("descrever aluno e suas informações")
	void infoAluno() {
		Aluno aluno = new Aluno("José", 100, 0.5, new Curso("ADS", 1500.0));
		assertEquals("Nome: José. Matricula: 100. Curso: ADS. Valor da mensalidade: R$ 750.00", 
				aluno.infoAluno());
	}
	
	

}
