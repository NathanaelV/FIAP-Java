package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String nome, aux;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");

                ArrayList<String> integrantes = new ArrayList<String>();
                String membros = "continua";
                while (membros.equalsIgnoreCase("continua")) {
                    aux = JOptionPane.showInputDialog("Digite um integrante desta equipe ou digite \"fim\" para encerrar");

                    if (aux.equalsIgnoreCase("fim")) {
                        membros = "fim";
                    } else {
                        integrantes.add(aux);
                    }
                }

                grupo = new Equipe(nome, integrantes);
                grupo.listarEquipe();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
