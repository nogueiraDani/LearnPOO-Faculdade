package com.dani;

public class Dolar extends Moeda{
    private double cotacao;
    private double saldo;

    public Dolar() {
    }

    @Override
    public void adicionarValor(double valor) {
        setSaldo(saldo += valor);
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void removerValor(double valor) {
        setSaldo(saldo -= valor);
    }

    @Override
    public String info() {
        return String.format("Dolar: US$ %.2f",getSaldo());
    }

    @Override
    public double converter() {
        return 0;
    }
}
