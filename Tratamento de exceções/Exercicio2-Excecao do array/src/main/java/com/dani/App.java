package com.dani;

public class App {

    public static int[] instanciarArray(int n) {
        return new int[n];
    }

    public static void main(String[] args) {

        int tam = 10;

        try {
            int arr[] = instanciarArray(tam);
            for (int i = 0; i < tam; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (NegativeArraySizeException e){
            System.out.println("Valor inválido");
            System.out.println(e.getMessage());
        }
    }
}
