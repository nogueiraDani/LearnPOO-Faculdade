package com.dani;

public class Notebook extends Computador{

    private final int polegadasTela;

    public Notebook(int polegadasTela, int gbMemoria, int numProcessadores) {
        super(gbMemoria, numProcessadores);
        this.polegadasTela = polegadasTela;
    }

    @Override
    public double calcularValor() {
        return 250 * gbMemoria + 500 * numProcessadores + polegadasTela * 100;
    }
}
