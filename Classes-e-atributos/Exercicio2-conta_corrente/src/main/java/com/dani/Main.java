/**
 * Crie uma classe Conta, para administrar contas correntes de um banco
 * com os seguintes atributos:
 * String correntista;
 * float saldo;
 * float limiteSaque;
 * E os métodos:
 * void sacar( float valor)
 * void depositar( float valor)
 * void info()
 * transfererir(Conta destino, float valor);
 */
package com.dani;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Dani", 1000f, 800f);
        Conta conta2 = new Conta("Poupanca", 200f, 100f);

        conta1.sacar(800f);
        conta1.transferir(conta2, 150f);

        conta1.info();
        conta2.info();
    }
}