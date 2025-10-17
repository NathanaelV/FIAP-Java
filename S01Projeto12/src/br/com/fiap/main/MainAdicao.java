package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;
import java.awt.*;
import java.rmi.server.ExportException;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao add = new Adicao();
        String auxiliar, escolha;
        int op, n1, n2, intResp;
        double num1, num2, doubleResp;

        do {
            try {
                auxiliar = JOptionPane.showInputDialog(null, "Qual soma deseja realizar?\n(1) Números Inteiros\n(2) Números decimais");
                op = Integer.parseInt(auxiliar);

                switch (op) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro Número Inteiro");
                        n1 = Integer.parseInt(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro Número Inteiro");
                        n2 = Integer.parseInt(auxiliar);

                        intResp = add.somar(n1, n2);

                        JOptionPane.showMessageDialog(null, String.format("A soma será: %d", intResp));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro Número Inteiro");
                        num1 = Double.parseDouble(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro Número Inteiro");
                        num2 = Double.parseDouble(auxiliar);

                        doubleResp = add.somar(num1, num2);

                        JOptionPane.showMessageDialog(null, String.format("A soma será: %.2f", doubleResp));

                        break;
                    default:
                        throw new Exception("Digite uma opção válida");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            escolha = JOptionPane.showInputDialog("Deseja continuar? (sim/não)");

        } while (escolha.equalsIgnoreCase("sim"));
    }
}
