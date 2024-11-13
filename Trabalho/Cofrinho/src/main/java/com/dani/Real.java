package com.dani;

public class Real extends Moeda {

    /*
     * classe Real que herda Moeda, implementa metodos da classe mae
     */

    public Real() {
    }

    @Override
    public String getNome() {
        return "Real";
    }

    @Override
    public String info() {
        return String.format("Real:   R$ %.2f", getValorSaldo());
    }

    @Override
    public double converter() {
        /*
         * aqui a função converter nao precisa fazer nenhum calculo, pois o
         * Real é a moeda base para o sistema.
         */
        return getValorSaldo();
    }
}
