package com.dani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static int mostrarMenuPrincipal() {

        System.out.println("------- Menu -------");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moeda");
        System.out.println("4 - Exibir saldo total em Reais");
        System.out.println("0 - Sair");
        System.out.println("Digite a sua opção:");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Opção inválida. Digite uma opção válida:");
            return -1;
        }
    }

    public static int mostrarMenuMoedas() {

        System.out.println("-- Escolher moeda --");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.println("Digite a sua opção:");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Opção inválida. Digite uma opção válida:");
            return -1;
        }
    }

    public static double pedirValorParaEditar() {

        System.out.println("--------------------");
        System.out.println("Digite o valor:");

        try {
            double valor = scanner.nextDouble();
            if (valor < 0) {
                System.out.println("Valor inválido, o valor não pode ser " + "negativo.");
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

        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionar(new Real(), new Euro(), new Dolar());

        int tipoMoeda;
        boolean verMenu = true;
        double valor;

        System.out.println("----- Cofrinho -----");
        System.out.println("--------------------");

        while (verMenu) {

            int opcao = mostrarMenuPrincipal();

            switch (opcao) {
                case 0:
                    verMenu = false;
                    System.out.println("Programa encerrado.");
                    break;

                case 1:
                    tipoMoeda = mostrarMenuMoedas();
                    valor = pedirValorParaEditar();
                    if (tipoMoeda >= 1 && tipoMoeda <= 3) {
                        cofrinho.getListaMoedas().get(tipoMoeda - 1).adicionarValor(valor);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    tipoMoeda = mostrarMenuMoedas();
                    valor = pedirValorParaEditar();
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




