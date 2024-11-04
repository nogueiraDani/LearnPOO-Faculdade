package com.dani;

public class IngressoVip extends Ingresso{
    private double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    private double valorTotalIngresso(){
        return super.getValor() + adicional;
    }

    public void imprimir(){
        super.imprimir();
        System.out.printf("Taxa adicional: R$ %.2f\n", adicional);
        System.out.println("---------------------------------");
        System.out.printf("Valor total do ingresso: R$ %.2f\n%n",
                valorTotalIngresso());
    }

}
