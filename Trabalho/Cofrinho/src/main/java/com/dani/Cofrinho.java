package com.dani;

import java.util.ArrayList;

public class Cofrinho {

    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public Cofrinho() {
    }


    public void adicionar(Moeda moeda) {
        //TODO falta fazer as validações com valores negativos
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda, double valor) {
        //TODO falta fazer as validações com valores negativos
        moeda.removerValor(valor);

    }

    public void listarMoedas() {
        for (Moeda m : listaMoedas){
            System.out.println(m.info());
        }
    }



    public void exibirTotalConvertido() {
        //TODO falta fazer essa aqui
        System.out.println("Falta fazer");
    }

    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }
}
