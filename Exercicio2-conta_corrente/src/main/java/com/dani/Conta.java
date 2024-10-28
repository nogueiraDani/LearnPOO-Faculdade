package com.dani;

public class Conta {
    String correntista;
    Float saldo;
    Float limiteSaque;

    public Conta(String correntista, Float saldo, Float limiteSaque) {
        this.correntista = correntista;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void sacar(Float valor) {
        this.saldo -= valor;
    }

    public void depositar(Float valor) {
        this.saldo += valor;
    }

    public String info() {
        return "Conta{" + "correntista='" + correntista + '\'' + ", saldo=" + saldo + ", limiteSaque=" + limiteSaque + '}';
    }

    public void transferir(Conta destino, Float valor){
        this.sacar(valor);
        destino.depositar(valor);
    }
}
