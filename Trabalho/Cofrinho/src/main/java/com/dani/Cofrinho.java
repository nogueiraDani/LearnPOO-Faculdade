package com.dani;

import java.util.ArrayList;
import java.util.Arrays;

public class Cofrinho {

    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public Cofrinho() {
    }

    public void adicionar(Moeda... moedas) {
        listaMoedas.addAll(Arrays.asList(moedas));
    }

    public void listarMoedas() {
        for (Moeda m : listaMoedas){
            System.out.println(m.info());
        }
    }

    public void exibirTotalConvertido() {
        double saldoEmReais = 0;
        for (Moeda m : listaMoedas){
            saldoEmReais += m.converter();
        }
        System.out.printf("Saldo total em Reais: R$ %.2f",saldoEmReais);
    }

    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }
}
