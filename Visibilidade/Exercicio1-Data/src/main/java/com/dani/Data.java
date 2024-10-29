package com.dani;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ((dia < 1) || (dia > 30)) {
            System.out.println("valor inválido para dia");
            this.dia = 1;
            return;
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if ((mes < 1) || (mes > 12)) {
            System.out.println("valor inválido para mês");
            this.mes = 1;
            return;
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 0){
            System.out.println("valor inválido para ano");
            this.ano = 0;
            return;
        }
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
