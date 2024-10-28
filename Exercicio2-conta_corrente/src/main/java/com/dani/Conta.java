package com.dani;

import org.w3c.dom.ls.LSOutput;

public class Conta {
    private final String correntista;
    private Float saldo;
    private final Float limiteSaque;

    public Conta(String correntista, Float saldo, Float limiteSaque) {
        this.correntista = correntista;
        this.saldo = saldo >= 0 ? saldo : 0;
        this.limiteSaque = limiteSaque >= 0 ? limiteSaque : 0;
    }

    public void sacar(Float valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que 0.");
            return;
        }

        if (valor > this.limiteSaque) {
            System.out.println("Saque não permitido, verifique o valor do limite.");
            return;
        }

        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }

        this.saldo -= valor;
        System.out.printf("Saque realizado com sucesso. Saldo atual da conta" + " %s agora é R$ %.2f\n", this.correntista, this.saldo);
    }


    public void depositar(Float valor) {
        if (valor < 0) {
            System.out.println("O valor para depósito deve ser maior que 0.");
            return;
        }
        this.saldo += valor;
        System.out.println("Deposito feito com sucesso.");
    }

    public void info() {
        System.out.printf(String.format("Conta{correntista='%s', saldo=%.2f," +
                " " + "limiteSaque=%.2f}\n", correntista, saldo, limiteSaque));
    }

    public void transferir(Conta destino, Float valor) {
        if (valor <= 0) {
            System.out.println("O valor para transferência deve ser maior que zero.");
            return;
        }

        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }

        if (valor > this.limiteSaque) {
            System.out.println("Transferência não permitida, valor acima do limite de saque.");
            return;
        }

        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferencia realizada com sucesso");
    }
}

