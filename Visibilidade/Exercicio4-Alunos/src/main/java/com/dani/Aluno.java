package com.dani;

import java.util.Locale;

public class Aluno {

	private String nome;
	private int matricula;
	private double desconto;
	private Curso curso;

	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		// super();
		this.nome = nome;
		this.matricula = matricula;
		setDesconto(desconto);
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		if (desconto > 0 && desconto < 1) {
			this.desconto = desconto;
		}else {
			throw new IllegalArgumentException("Valor para o desconto não pode ser negativo");
		}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String infoMensalidade() {
		double valorDesconto = this.curso.getMensalidade() * this.desconto;
		return String.format(Locale.US, "Valor da mensalidade: R$ %.2f", (this.curso.getMensalidade() - valorDesconto));
	}

	public String infoAluno() {
		return String.format("Nome: %s. Matricula: %d. Curso: %s. %s", 
				this.nome, this.matricula, this.curso.getNome(), this.infoMensalidade());
	}

}
