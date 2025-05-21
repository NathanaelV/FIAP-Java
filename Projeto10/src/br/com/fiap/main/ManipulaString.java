package br.com.fiap.main;

import javax.swing.*;

public class ManipulaString {
    public static void main(String[] args) {
        String frase, fraseUpper, fraseLower, text, fraseReplaced;
        int fraseLength;

        frase = "O rato roeu a roupa do rei de Roma";
        fraseUpper = frase.toUpperCase();
        fraseLower = frase.toLowerCase();
        fraseLength = frase.length();
        fraseReplaced = frase.replace("roupa", "parede");


        text = """
                A frase: %s
                Usando .toUpperCase(): %s
                Usando .toLowerCase(): %s
                Comprimento da frase: %d
                Usando substring(30,34): %s
                Replace: %s
                """.formatted(frase, fraseUpper, fraseLower, fraseLength, frase.substring(30,34), fraseReplaced);

        JOptionPane.showMessageDialog(null, text);
    }
}
