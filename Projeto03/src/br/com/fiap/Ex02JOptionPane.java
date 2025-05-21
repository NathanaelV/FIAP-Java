package br.com.fiap;

import javax.swing.*;

public class Ex02JOptionPane {
    public static void main(String[] args) {
        int birthDate, currentYear, age;
        String aux, stringAge;

        try {
            aux = JOptionPane.showInputDialog("Digite o seu ano de nascimento.");
            birthDate = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite o ano atual.");
            currentYear = Integer.parseInt(aux);

            age = currentYear - birthDate;

            JOptionPane.showMessageDialog(null, "Sua idade esse ano é (ou será) " + age + " anos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um ano válido!");
        }
    }
}
