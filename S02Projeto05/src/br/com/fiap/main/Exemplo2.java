package br.com.fiap.main;

import javax.swing.*;
import java.awt.*;

public class Exemplo2 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 a 50"));
            if (num1 < 1 || num1 > 50) {
                throw new Exception("Valor informado fora da faixa permitida. [1; 50]");
            }

            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro qualquer"));

            JOptionPane.showMessageDialog(null, "Soma: " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração: " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação: " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão: " + (num1 / num2));

        // A sequência
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de formato numérico: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Sei que será um erro de divisão por zero, pois é o único problema que posso ter nas operações aritméticas acima
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null, "Fim de Programa!!!");
        }
    }
}
