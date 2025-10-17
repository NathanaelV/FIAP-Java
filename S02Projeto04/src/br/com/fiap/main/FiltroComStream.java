package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Capitão América", "Homem Elástico", "Pantera Negra",
                        "Viúva Negra", "Mulher Maravilha", "Homem de Ferro", "Miss Marvel", "Mulher Invisível", "Ciclope",
                        "Super Homem"));

        List<String> heroisComH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .collect(Collectors.toList());

        String texto = "Herois que começam com a letra H\n" + heroisComH;
        JOptionPane.showMessageDialog(null, texto, "Heróis com H", JOptionPane.WARNING_MESSAGE);
    }
}
