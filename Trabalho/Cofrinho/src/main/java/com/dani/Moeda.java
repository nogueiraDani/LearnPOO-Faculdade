package com.dani;

import java.util.Scanner;

public abstract class Moeda {

    private double cotacao = 0;
    private double valorSaldo = 0;
    private boolean cotacaoDefinida = false;
    private final Scanner scanner = new Scanner(System.in);

    public Moeda() {
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) throws Exception {
        /*
         * função para editar o valor da cotação, não podendo ser 0 ou
         * negativa.
         */
        if (cotacao > 0) {
            this.cotacao = cotacao;
        } else {
            throw new Exception();
        }
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        if (valorSaldo >= 0) {
            this.valorSaldo = valorSaldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }

    // funções abstratas que serao implementadas nas classes filhas

    public abstract String info();

    public abstract String getNome();

    public abstract double converter();


    // funções da classe, que as classes filhas herdam

    public void adicionarValor(double valor) {
        /*
         * função para add valor no saldo da moeda escolhida.
         * validando o valor a add sendo sempre positivo e exibe mensagem de
         * conclusao da operação
         */
        if (valor > 0) {
            valorSaldo += valor;
            System.out.printf("%s adicionado com sucesso: %.2f.\n", getNome(), valor);
        } else {
            System.out.println("O valor para adicionar deve ser maior que " + "zero");
        }
    }

    public void removerValor(double valor) {
        /*
         * função para remover o valor da moeda selecionada
         * o valor é conferido e nao pode ser negativo
         */

        if (valor > 0) {
            valorSaldo -= valor;
            System.out.printf("%s removido com sucesso: %.2f.\n", getNome(), valor);
        } else {
            System.out.println("Ação inválida: o valor do saldo é " + "insuficiente ou o valor digitado é inválido.");
        }
    }

    public void pedirDefinicaoCotacao() {
        /*
         * funação para pedir definicao da  cotação, aqui optei por quando
         * for a 1ª vez q for add um valor em moedas diferentes do Real
         * programa peça para o usuario definir a cotação.
         * quando a cotação já estiver definida, o programa pergunta se deseja
         * editar a cotação
         */
        if (!cotacaoDefinida) {
            System.out.printf("Por favor defina a cotação do %s\n", getNome());
            try {
                editarCotacao();
                cotacaoDefinida = true;
            } catch (Exception e) {
                pedirDefinicaoCotacao();
            }
        } else {
            System.out.printf("Deseja alterar cotação do %s? (S / N)", getNome());
            String resposta = scanner.nextLine().trim();

            if (resposta.equalsIgnoreCase("s")) {
                editarCotacao();
            }
        }
    }

    public void editarCotacao() {

        /*
         * função para editar a cotação, o valor passado é verificado e nao
         * pode ser negativo.
         */
        System.out.printf("A cotação atual do %s é: %.2f\n", getNome(), getCotacao());
        System.out.println("Digite a nova cotação:");

        try {
            double novaCotacao = scanner.nextDouble();
            setCotacao(novaCotacao);
            System.out.printf("A nova cotação de %s é: %.2f\n", getNome(), getCotacao());
        } catch (Exception e) {
            System.out.println("Valor inválido. Digite novamente.");
            scanner.nextLine();
            editarCotacao();
        }
    }
}
