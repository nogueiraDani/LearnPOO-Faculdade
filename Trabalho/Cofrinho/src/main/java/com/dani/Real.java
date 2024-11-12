package com.dani;

public class Real extends Moeda {

    public Real() {
        this.cotacao = 0;
    }

    @Override
    public String getNome() {
        return "Real";
    }

    @Override
    public String info() {
        return String.format("Real:   R$ %.2f",getSaldo());
    }


    @Override
    public double converter() {
        return saldo;
    }
}
