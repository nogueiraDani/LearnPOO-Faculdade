package com.dani;

import java.util.ArrayList;
import java.util.Locale;

public class Cofrinho {

	public Cofrinho() {
	}
	
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	

	public void adicionar(Moeda moeda) {
		moedas.add(moeda);		
	}


	public String calcularTotal() {
		double saldo = 0;
		for (Moeda moeda : moedas) {
			saldo += moeda.getValor();
		}		
		return String.format(Locale.US, "Saldo: %.2f", saldo);
	}
	
	
	
	
	
	
	

}
