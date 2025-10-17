package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.util.Arrays;

public class MainEquipe {
    public static void main(String[] args) {
        String[] integrantes;
        String nomeEquipe, aux;
        int numMembros;

        do {

            try {

                Equipe equipe = new Equipe();

                aux = JOptionPane.showInputDialog("Digite o nome da equipe");
                equipe.setNome(aux);

                aux = JOptionPane.showInputDialog("Quantos integrantes tem na equipe?");
                numMembros = Integer.parseInt(aux);
                String[] membros = new String[numMembros];

                for (int i = 0; i < numMembros; i++) {
                    membros[i] = JOptionPane.showInputDialog(String.format("Digite o nome do %dº membro", i+1));
                }

                equipe.setIntegrantes(membros);

                equipe.listarEquipe();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Insira um valor válido.");
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Até a próxima!");
    }
}
