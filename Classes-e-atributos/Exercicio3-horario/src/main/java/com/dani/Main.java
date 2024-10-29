/**
 * Crie uma classe Horario com os atributos inteiros, hora, minuto e segundo.
 * Crie três construtores, um que recebe três parâmetros e inicia os três
 * atributos com os valores passados, outro que recebe apenas a hora e
 * outro vazio. Caso algum dos valores inicializados não esteja no intervalo
 * adequado (hora entre 0 e 23, minutos e segundos entre 0 e 59), inicialize
 * o valor em questão em zero e emita uma mensagem de erro.
 */

package com.dani;

public class Main {
    public static void main(String[] args) {
        Horario horario = new Horario();
        System.out.println(horario.toString());

        Horario horario2 = new Horario(10);
        System.out.println(horario2.toString());

        Horario horario3 = new Horario(10, 5,30);
        System.out.println(horario3.toString());

        Horario horario4 = new Horario(25,5,65);
        System.out.println(horario4.toString());
    }
}