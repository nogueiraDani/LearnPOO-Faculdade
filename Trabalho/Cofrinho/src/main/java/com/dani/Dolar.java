package com.dani;


public class Dolar extends Moeda {

    /*
     * classe Dolar que herda Moeda, implementa metodos da classe mae
     */

    public Dolar() {
    }

    @Override
    public String getNome() {
        return "Dolar";
    }

    @Override
    public String info() {
        return String.format("Dolar: US$ %.2f", getValorSaldo());
    }

    @Override
    public double converter() {
        return (getValorSaldo() * getCotacao());
    }

}
