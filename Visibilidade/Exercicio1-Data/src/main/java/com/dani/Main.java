/**
 * desenvolva uma classe Data, com atributos, dia, mês e ano
 * encapsulados com get/set. Para simplificar, assuma que todo mês pode seja
 * composto por 30 dias.
 */

package com.dani;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(2, 13, 1989);
        System.out.println(data.toString());;

        data.setMes(12);
        System.out.println(data.toString());;

    }
}