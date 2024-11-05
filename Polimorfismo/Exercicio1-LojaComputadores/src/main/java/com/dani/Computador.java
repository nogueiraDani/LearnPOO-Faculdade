package com.dani;

public abstract class Computador {
    int gbMemoria;
    int numProcessadores;

    public Computador(int gbMemoria, int numProcessadores) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
    }

    public abstract double calcularValor();
}
