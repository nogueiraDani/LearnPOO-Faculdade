package com.dani;

public class Nota {

    private double nota1;
    private double nota2;
    private int faltas;

    public Nota(double nota1, double nota2, int faltas) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
    }

    public Nota() {
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void resultado() {
        double resultado = (nota1 + nota2) / 2;

        if (resultado < 0) {
            System.out.println("Nota inválida");
        } else if (resultado < 4) {
            System.out.println("Média: " + resultado);
            System.out.println("Reprovado");
        } else if (resultado < 7) {
            System.out.println("Média: " + resultado);
            System.out.println("Exame final");
        } else {
            if (faltas < 7) {
                System.out.println("Média: " + resultado);
                System.out.println("Aprovado");
            } else {
                System.out.println("Média: " + resultado);
                System.out.println("Reprovado, motivo " + faltas + " faltas.");
            }
        }
        System.out.println("------------------------");
    }
}
