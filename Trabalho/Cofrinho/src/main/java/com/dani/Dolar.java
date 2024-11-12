package com.dani;


public class Dolar extends Moeda {

    public Dolar() {
        this.cotacao = 0;
    }

    @Override
    public String getNome() {
        return "Dolar";
    }

    @Override
    public String info() {
        return String.format("Dolar: US$ %.2f", getSaldo());
    }

    @Override
    public double converter() {
        return (saldo * cotacao);
    }

}
