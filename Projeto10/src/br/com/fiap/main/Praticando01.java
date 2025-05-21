package br.com.fiap.main;

import javax.swing.*;

public class Praticando01 {
    public static void main(String[] args) {
        String frase, texto, primeiraPalavra, segundaPalavra, fraseSubstituida;

        try {
            frase = JOptionPane.showInputDialog("Digite uma frase");
            primeiraPalavra = JOptionPane.showInputDialog("Digite uma da frase que deseja substituir");
            segundaPalavra = JOptionPane.showInputDialog("Digite a palavra substituta.");

            fraseSubstituida = frase.replace(primeiraPalavra, segundaPalavra);

            texto = """
                    %s
                    A frase tem %d caracteres.
                    Frase maiúscula: %s
                    Frase substituída: %s
                    A nova frase tem %d caracteres.
                    """.formatted(frase, frase.length(),
                        frase.toUpperCase(),
                        fraseSubstituida,
                        fraseSubstituida.length());

            JOptionPane.showMessageDialog(null, texto);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
