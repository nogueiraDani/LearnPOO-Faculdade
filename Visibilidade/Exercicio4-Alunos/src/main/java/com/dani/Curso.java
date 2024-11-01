package com.dani;

import java.util.Locale;

public class Curso {

	private String nome;
	private double mensalidade;

	public Curso(String nome, double mensalidade) {
		// super();
		this.nome = nome;
		setMensalidade(mensalidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		if(mensalidade < 0) {
			throw new IllegalArgumentException(
					"Valor da mensalidade não pode ser negativo.");
		} else {
		this.mensalidade = mensalidade;
		}
	}

	public String infoCurso() {
		return String.format(Locale.US, "Curso: %s. Mensalidade: R$ %.2f", this.nome, this.mensalidade);
	}

}
