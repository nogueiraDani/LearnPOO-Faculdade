package com.dani;

public class Conta {

    public String nome;
    public double saldo;

    public Conta(String nome, double saldo) {
        setNome(nome);
        setSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //deixando a Exception para ser tratado quando a funcção for chamada
    public void depositar(double valor) throws Exception {
        if(valor < 0) {
            throw new Exception("Valor inválido para deposito");
        }
        setSaldo(saldo + valor);
    }

    //tratando o RuntimeException aqui na função
    public void sacar(double valor) {
        if( valor > saldo) {
            throw new RuntimeException("Saldo insuficiente.");
        }
        if(valor < 0) {
            throw new RuntimeException("Valor inválido para saque.");
        }
        setSaldo(saldo - valor);
    }

    public void transferir(double valor, Conta destino) {
        if (valor > this.getSaldo()) {
            throw new RuntimeException("Valor insuficiente para transaferência");
        }
        if(valor < 0 ){
            throw new RuntimeException("Valor inválido para transferência");
        }


        this.setSaldo(this.saldo - valor);

        try {
            destino.depositar(valor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
