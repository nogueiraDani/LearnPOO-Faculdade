package dani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static int mostrarMenuPrincipal() {
        /*
         * função para exibir o menu principal, validando a resposta de acordo
         *  com as opçoes do menu.
         * return: numero inteiro representando a opçao escolhida.
         */

        System.out.println("------- Menu -------");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moeda");
        System.out.println("4 - Exibir saldo total em Reais");
        System.out.println("0 - Sair");
        System.out.println("Digite a sua opção:");

        //validação da respota
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Opção inválida. Digite uma opção válida:");
            return -1;
        }
    }

    public static int mostrarMenuMoedas() {
        /*
         * função para exibir o menu das opçoes de moedas, validando a resposta
         * de acordo com as opções disponiveis
         * return: numero inteiro representando a opção escolhida
         */

        System.out.println("-- Escolher moeda --");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.println("4 - Voltar ao menu principal");
        System.out.println("Digite a sua opção:");

        //validação da respota
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Opção inválida. Digite uma opção válida:");
            return -1;
        }
    }

    public static double pedirValorParaEditar() {

        /*
         * função para pedir um valor, podendo ser usado para adicionar na
         * moeda, como para remover.
         * return: double do valor positivo.
         */
        System.out.println("--------------------");
        System.out.println("Digite o valor:");

        // validação do valor para editar, o mesmo nao pode ser negativo.
        try {
            double valor = scanner.nextDouble();
            if (valor < 0) {
                System.out.println("Valor inválido, o valor não pode ser negativo.");
                return pedirValorParaEditar();
            }
            return valor;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Valor inválido.");
            return pedirValorParaEditar();
        }
    }

    public static void main(String[] args) {

        /* inicia o cofrinho e add as moedas definidas para o app.
         * aqui pensei em criar uma lista com 3 tipos de moeda e sempre
         * add ou remover valor de cada tipo, sem necessidade de encher a
         * lista com varias instancias do mesmo tipo.
         */
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionar(new Real(), new Dolar(), new Euro());

        int tipoMoeda;
        boolean verMenu = true;
        double valor;

        System.out.println("----- dani.Cofrinho -----");
        System.out.println("--------------------");

        // loop do menu principal
        while (verMenu) {

            int opcao = mostrarMenuPrincipal();

            switch (opcao) {
                case 0:
                    verMenu = false;
                    System.out.println("Programa encerrado.");
                    break;

                case 1:
                    tipoMoeda = mostrarMenuMoedas();
                    // add o valor na instancia correspondente a opção
                    // desejada.
                    if (tipoMoeda == 4) {
                        continue;
                    } else {
                        valor = pedirValorParaEditar();
                        Moeda moedaEscolhida = cofrinho.getListaMoedas().get(tipoMoeda - 1);
                        switch (tipoMoeda) {
                            case 1:
                                moedaEscolhida.adicionarValor(valor);
                                break;
                            case 2:
                            case 3:
                                moedaEscolhida.pedirDefinicaoCotacao();
                                moedaEscolhida.adicionarValor(valor);
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                        break;
                    }
                case 2:
                    tipoMoeda = mostrarMenuMoedas();
                    valor = pedirValorParaEditar();
                    // remove o valor na instancia correspondente a opção
                    // desejada.
                    if (tipoMoeda >= 1 && tipoMoeda <= 3) {
                        cofrinho.getListaMoedas().get(tipoMoeda - 1).removerValor(valor);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    cofrinho.exibirTotalConvertido();
                    break;

                default:
                    System.out.println("Opção inválida, escolha entre 0 e 4");
            }
        }

    }
}




