package br.com.fiap;

import javax.swing.*;

public class Ex01JOptionPane {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, media;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite a nota da Prova 1");
            prova1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a nota da Prova 2");
            prova2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a nota da Prova 3");
            prova3 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a nota da Prova 4");
            prova4 = Float.parseFloat(aux);

            media = (prova1 + prova2 + prova3 + prova4) / 4;

            JOptionPane.showMessageDialog(null, "A média foi: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato do número inválido! " + e);
        }
    }
}
