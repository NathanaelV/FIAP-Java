package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    public static void main(String[] args) {
        String nome, idSecreta;
        int qtdPoderes, qtdFraquezas;
        String[] poderes, fraquezas;
        SuperHeroi superHeroi;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do Herói");
                idSecreta = JOptionPane.showInputDialog("Digite o nome da Identidade Secreta do Herói");

                qtdPoderes = Integer.parseInt(JOptionPane.showInputDialog("Quantos poderes esse herói tem?"));
                qtdFraquezas = Integer.parseInt(JOptionPane.showInputDialog("Quantas fraquezas esse herói tem?"));

                poderes = new String[qtdPoderes];
                for (int i = 0; i < qtdPoderes; i ++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Digite o %dº poder", i + 1));
                }

                fraquezas = new String[qtdFraquezas];
                for (int i = 0; i < qtdFraquezas; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Digite a %dª fraqueza", i + 1));
                }

                superHeroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);

                superHeroi.listarHeroi();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Deu ruim. Tente novamente");
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Deseja Continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
