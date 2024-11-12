package com.dani;

public class Euro extends Moeda {

    public Euro() {
        this.cotacao = 0;
    }

    @Override
    public String getNome() {
        return "Euro";
    }

    @Override
    public String info() {
        return String.format("Euro:      %.2f €", getSaldo());
    }

    @Override
    public double converter() {
        return 0;
    }
}
