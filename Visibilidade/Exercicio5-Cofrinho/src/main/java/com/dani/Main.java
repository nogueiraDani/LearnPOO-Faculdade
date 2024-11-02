package com.dani;

public class Main {
	public static void main(String[] args) {

		Cofrinho cofrinho = new Cofrinho();
		cofrinho.adicionar(new Moeda("Euro", 0.50));
		cofrinho.adicionar(new Moeda("Euro", 1.00));
		cofrinho.adicionar(new Moeda("Euro", 0.25));
		cofrinho.adicionar(new Moeda("Euro", 0.10));
		cofrinho.adicionar(new Moeda("Euro", 0.05));

		System.out.println(cofrinho.calcularTotal());
	}
}
