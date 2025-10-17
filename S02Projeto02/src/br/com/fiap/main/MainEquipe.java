package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainEquipe {
    public static void main(String[] args) {
        String nomeEquipe, integrante;
        ArrayList<String> integrantes;

        do {
            try {
                nomeEquipe = JOptionPane.showInputDialog("Digite o nome da equipe");
                integrantes = new ArrayList<String>();

                do {
                    integrante = JOptionPane.showInputDialog("Digite o nome do integrate");
                    if (!integrante.equalsIgnoreCase("fim")) {
                        integrantes.add(integrante);
                    }
                } while (!integrante.equalsIgnoreCase("fim"));

                Equipe equipe = new Equipe(nomeEquipe, integrantes);
                equipe.listarEquipe();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null,
                "Deseja Continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null,
                "Até a próxima!",
                "Adeus",
                JOptionPane.WARNING_MESSAGE);
    }
}
