/**
 * Crie uma classe Nota, com três atributos reais chamados: nota1, nota2,
 * nota3. E crie também dois métodos, cada um para calcular e retornar
 * diferentes tipos de média. Média Aritmética; e Média ponderada (pesos 2,
 * 3 e 4 respectivamente).
 */

package com.dani;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1º nota:");
        Float nota1 = scan.nextFloat();
        System.out.println("Digite a 2º nota:");
        Float nota2 = scan.nextFloat();
        System.out.println("Digite a 3º nota:");
        Float nota3 = scan.nextFloat();

        Nota nota = new Nota(nota1, nota2, nota3);
        System.out.printf("Média aritmetica = %.2f%n",nota.mediaAritmetica());
        System.out.printf("Média ponderada = %.2f%n",nota.mediaPonderada());
    }
}