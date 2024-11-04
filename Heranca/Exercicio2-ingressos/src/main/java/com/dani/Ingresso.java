package com.dani;

public class Ingresso {

    private String nomeEvento;
    private double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("---------------------------------");
        System.out.println("Ingresso");
        System.out.println("---------------------------------");
        System.out.println("Evento: " + nomeEvento);
        System.out.printf("Valor do ingresso: R$ %.2f\n", valor);
    }
}
