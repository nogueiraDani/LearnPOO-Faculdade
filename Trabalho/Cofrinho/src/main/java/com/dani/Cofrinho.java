package com.dani;

import java.util.ArrayList;
import java.util.Arrays;

public class Cofrinho {

    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public Cofrinho() {
    }

    public void adicionar(Moeda... moedas) {
    /*
     * aqui optei por passar como parametro 1 ou mais moedas.
     */
        listaMoedas.addAll(Arrays.asList(moedas));
    }

    public void remover(Moeda moeda){
        listaMoedas.remove(moeda);
    }

    public void listarMoedas() {
        for (Moeda m : listaMoedas){
            System.out.println(m.info());
        }
    }

    public void exibirTotalConvertido() {
        /*
         * função para exibir o total dos valores das contas convertidos em
         * Real.
         */
        double saldoEmReais = 0;
        for (Moeda m : listaMoedas){
            saldoEmReais += m.converter();
        }
        System.out.printf("Saldo total em Reais: R$ %.2f\n",saldoEmReais);
    }

    public ArrayList<Moeda> getListaMoedas() {
        /*
         *  função para no main poder buscar o objeto
         * referente a opção
         */
        return listaMoedas;
    }
}
