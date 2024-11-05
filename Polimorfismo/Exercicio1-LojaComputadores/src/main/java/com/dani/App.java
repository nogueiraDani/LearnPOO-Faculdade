package com.dani;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Computador> computadores = new ArrayList<>();
        computadores.add(new Desktop(100.5, 256, 2));
        computadores.add(new Notebook(20, 512, 1));


        for(Computador c : computadores){
            System.out.printf("R$ %.2f%n", c.calcularValor());
        }

    }
}
