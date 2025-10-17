package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>(
                Arrays.asList("Volvo", "BMW", "Ford", "Mazda")
        );

        System.out.println(carros);
        carros.set(1, "Volkswagem");    // Substitui o item especificado.
        System.out.println(carros);
        carros.remove(2);         // Remove um item específico
        System.out.println(carros);
        carros.clear();                 // Limpa todos os elementos do Array
        System.out.println(carros);
    }
}
