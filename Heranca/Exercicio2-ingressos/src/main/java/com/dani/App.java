package com.dani;

public class App 
{
    public static void main( String[] args )
    {
        Ingresso ingresso = new Ingresso("Show", 100);
        ingresso.imprimir();

        IngressoVip ingressoVip = new IngressoVip("Palestra", 200, 50);
        ingressoVip.imprimir();

    }
}
