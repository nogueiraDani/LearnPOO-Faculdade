package com.dani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- Menu -------");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moeda");
        System.out.println("4 - Exibir saldo total em Reais");
        System.out.println("0 - Sair");

        return scanner.nextInt();
    }

    public static int mostrarMenuMoedas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Escolher moeda --");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");

        return scanner.nextInt();
    }

    public static double pedirValorParaEditar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("Digite o valor:");

        return scanner.nextDouble();
    }



    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean verMenu = true;
        int tipoMoeda;
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.adicionar(new Real());
        cofrinho.adicionar(new Dolar());
        cofrinho.adicionar(new Euro());
        double valor;

        System.out.println("----- Cofrinho -----");
        System.out.println("--------------------");
        while (verMenu) {
            try {
                opcao = mostrarMenuPrincipal();
                //TODO refatorar a validação da
                // opçao para dentro da funçao
                if (opcao >= 0 && opcao <= 4) {
                    switch (opcao) {
                        case 0:
                            verMenu = false;
                            break;
                        case 1:
                            tipoMoeda = mostrarMenuMoedas();
                            valor = pedirValorParaEditar();
                            switch (tipoMoeda) {
                                case 1:
                                    cofrinho.getListaMoedas().get(0).adicionarValor(valor);
                                    break;
                                case 2:
                                    cofrinho.getListaMoedas().get(1).adicionarValor(valor);
                                    break;
                                case 3:
                                    cofrinho.getListaMoedas().get(2).adicionarValor(valor);
                                    break;
                            }
                            break;
                        case 2:
                            tipoMoeda = mostrarMenuMoedas();
                            valor = pedirValorParaEditar();
                            switch (tipoMoeda) {
                                case 1:
                                    cofrinho.getListaMoedas().get(0).removerValor(valor);
                                    break;
                                case 2:
                                    cofrinho.getListaMoedas().get(1).removerValor(valor);
                                    break;
                                case 3:
                                    cofrinho.getListaMoedas().get(2).removerValor(valor);
                                    break;
                            }
                            break;
                        case 3:
                            cofrinho.listarMoedas();
                            break;
                        case 4:
                            cofrinho.exibirTotalConvertido();
                            break;
                    }
                } else {
                    System.out.println("Opção inválida, escolha " + "entre 0 e 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida.");
            }

        }
    }




}
