/**
 * desenvolva uma calculadora de notas e mostre o resultado conforma media e
 * quantidade de faltas
 *
 */

package com.dani;

public class Main {
    public static void main(String[] args) {
        Nota mario = new Nota();

        mario.setNota1(9);
        mario.setNota2(10);
        mario.setFaltas(3);

        mario.resultado();

        Nota dani = new Nota();
        dani.setNota1(3);
        dani.setNota2(4);
        dani.setFaltas(5);

        dani.resultado();

        Nota yasmim = new Nota();
        yasmim.setNota1(5);
        yasmim.setNota2(6);
        yasmim.setFaltas(4);

        yasmim.resultado();

        Nota tadeu = new Nota(10, 8, 8);
        tadeu.resultado();
    }
}