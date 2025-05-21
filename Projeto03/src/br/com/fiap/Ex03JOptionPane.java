package br.com.fiap;

import javax.swing.*;

public class Ex03JOptionPane {
    public static void main(String[] args) {
        double radius, area;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite o valor do raio.");
            radius = Float.parseFloat(aux);

            area = Math.PI * Math.pow(radius, 2);

            JOptionPane.showMessageDialog(null, "A área do circulo é " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um valor de raio válido!");
        }
    }
}
