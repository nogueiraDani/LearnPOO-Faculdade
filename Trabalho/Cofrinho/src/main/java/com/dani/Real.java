package com.dani;

public class Real extends Moeda {
    private double saldo;

    public Real() {
    }

    @Override
    public void adicionarValor(double valor) {
        setSaldo(saldo += valor);
    }

    @Override
    public void removerValor(double valor) {
        setSaldo(saldo -= valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String info() {
        return String.format("Real:   R$ %.2f",getSaldo());
    }

    @Override
    public double converter() {
        return 0;
    }
}
