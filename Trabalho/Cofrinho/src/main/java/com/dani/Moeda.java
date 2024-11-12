package com.dani;

import java.util.Scanner;

public abstract class Moeda {

    protected double cotacao = 0;
    protected double saldo = 0;
    private boolean cotacaoDefinida = false;
    private final Scanner scanner = new Scanner(System.in);

    public Moeda() {
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        if (cotacao > 0) {
            this.cotacao = cotacao;
        } else {
            System.out.println("Valor inválido, a cotação deve ser maior que zero.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }

    public abstract String info();

    public abstract String getNome();

    public abstract double converter();

    public void adicionarValor(double valor) {
        if(!cotacaoDefinida){
            System.out.printf("Por favor defina a cotação do %s", getNome());
            editarCotacao();
            cotacaoDefinida = true;
        } else {
            System.out.printf("Deseja alterar cotação do %s? (S / N)", getNome());
            String resposta = scanner.nextLine().trim();

            if(resposta.equalsIgnoreCase("s")){
                editarCotacao();
            }
        }

        if (valor > 0) {
            saldo += valor;
            System.out.printf("%s adicionado com sucesso: %.2f.\n",
                    getNome(),
                    valor);
        } else {
            System.out.println("O valor para adicionar deve ser postivo.");
        }
    }

    public void removerValor(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("%s removido com sucesso: %.2f.\n", getNome(), valor);
        } else {
            System.out.println("Ação inválida: o valor do saldo é " + "insuficiente ou o valor digitado é inválido.");
        }
    }

    public void editarCotacao() {

        System.out.printf("A cotação atual do %s é: %.2f\n", getNome(),
                getCotacao());
        System.out.println("Digite a nova cotação:");

        try {
            double novaCotacao = scanner.nextDouble();
            setCotacao(novaCotacao);
            System.out.printf("A nova cotação de %s é: %.2f\n", getNome(),
                    getCotacao());
        } catch (Exception e ){
            System.out.println("Valor inválido. Digite novamente.");
            scanner.nextLine();
            editarCotacao();
        }
    }
}
