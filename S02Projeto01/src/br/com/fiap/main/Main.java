package br.com.fiap.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(carros));

        int[] numeros = new int[4];
        System.out.println(Arrays.toString(numeros));

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;

        System.out.println(Arrays.toString(numeros));

        System.out.println("\nComprimento do Array (length):");
        System.out.println("Carros: " + carros.length);
        System.out.println("Números: " + numeros.length);

        // Mostrar todos os valores do Array

        System.out.println("\nMostrar todos os valores do Array");

        for (String carro : carros) {
            System.out.println(carro);
        }

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
