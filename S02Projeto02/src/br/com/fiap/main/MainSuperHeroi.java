package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;
import java.util.ArrayList;

public class MainSuperHeroi {
    public static void main(String[] args) {
        String nome, idSecreta, poder, fraqueza;
        ArrayList<String> poderes, fraquezas;

        do {
            try {
                nome = JOptionPane.showInputDialog("Qual o nome do Super Herói?");
                idSecreta = JOptionPane.showInputDialog("Qual a identidade secreta do Super Herói?");
                poderes = new ArrayList<>();
                fraquezas = new ArrayList<>();

                do {
                    poder = JOptionPane.showInputDialog("Qual o Poder do Super Herói");
                    if (!poder.equalsIgnoreCase("fim")) {
                        poderes.add(poder);
                    }
                } while (!poder.equalsIgnoreCase("fim"));

                do {
                    fraqueza = JOptionPane.showInputDialog("Qual a Fraqueza do Super Herói");
                    if (!fraqueza.equalsIgnoreCase("fim")) {
                        fraquezas.add(fraqueza);
                    }
                } while (!fraqueza.equalsIgnoreCase("fim"));

                SuperHeroi superHeroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                superHeroi.listarHeroi();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null,
                "Deseja continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Até a próxima.");
    }
}
