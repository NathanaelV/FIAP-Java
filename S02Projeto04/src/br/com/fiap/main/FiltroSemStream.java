package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FiltroSemStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Capitão América", "Homem Elástico", "Pantera Negra",
                        "Viúva Negra", "Mulher Maravilha", "Homem de Ferro", "Miss Marvel", "Mulher Invisível", "Ciclope",
                        "Super Homem"));

        ArrayList<String> heroisComH = new ArrayList<>();

        for (String heroi : herois) {
//            String primeiraLetra = heroi.substring(0, 1);
//            if (primeiraLetra.equals("H")) {
//                heroisComH.add(heroi);
//            }

            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }

        String apresentacao = "Heróis que começam com a letra H\n" + heroisComH;
        JOptionPane.showMessageDialog(null, apresentacao, "Heróis com H", JOptionPane.WARNING_MESSAGE);
    }
}