package com.dani;

public abstract class Moeda {

    double valor; //pq tem q ter o valor aqui?

    public Moeda(){
        //iniciar com saldo 0
    }

    public abstract void adicionarValor(double valor);

    public abstract void removerValor(double valor);

    public abstract String info();

    public abstract double converter();
}
