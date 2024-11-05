package com.dani;

public class Desktop extends Computador{
    private final double acessorios;

    public Desktop(double acessorios, int gbMemoria, int numProcessadores) {
        super(gbMemoria, numProcessadores);
        this.acessorios = acessorios;
    }

    @Override
    public double calcularValor() {
        return 200 * gbMemoria + 400 * numProcessadores + acessorios;
    }
}
