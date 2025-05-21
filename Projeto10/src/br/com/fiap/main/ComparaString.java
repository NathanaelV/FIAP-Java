package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha;

        senha = JOptionPane.showInputDialog("Digite sua senha");

        // Comparando Strings? comparando se são idênticos
        if (senha.equals("P4ss0rD")) {
            JOptionPane.showMessageDialog(null, "Acesso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acessado negado");
        }

        // Comparando Strings? comparando se são iguais
        if (senha.equalsIgnoreCase("P4ss0rD")) {
            JOptionPane.showMessageDialog(null, "Permitido acesso");
        } else {
            JOptionPane.showMessageDialog(null, "Proibido acesso");
        }
    }
}
