package br.com.fiap.main;

import javax.swing.*;
import java.util.*;

public class SorteioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();

        do {
            JOptionPane.showMessageDialog(null,
                    "Confira a seguir o resultados do sorteio da Loteria da Sorte Premiada!",
                    "Loteria",
                    JOptionPane.INFORMATION_MESSAGE);

            while (numerosSorteados.size() < 6) {
                int numero = random.nextInt(59) + 1;
                numerosSorteados.add(numero);
            }

            ArrayList<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null, "Os números sorteados são:\n" + resultadoDoSorteio);
            numerosSorteados.clear();

        } while (JOptionPane.showConfirmDialog(null,
                "Deseja continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
