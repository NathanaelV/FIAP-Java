package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        float lado, altura, area;
        int op;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                // Escolhe a figura para calcular a área
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular?\n(1) Quadrado\n(2) Retângulo\n(3) Triângulo");
                op = Integer.parseInt(auxiliar);

                switch (op) {
                    // Quadrado
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Qual o lado do quadrado?");
                        lado = Float.parseFloat(auxiliar);

                        Quadrado quad = new Quadrado(lado);
                        area = quad.calcularArea();

                        JOptionPane.showMessageDialog(null, String.format("Área do quadrado é %.2f", area));
                        break;

                    // Retângulo
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado do retângulo");
                        lado = Float.parseFloat(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite a altura do retângulo");
                        altura = Float.parseFloat(auxiliar);

                        Retangulo ret = new Retangulo(lado, altura);
                        area = ret.calcularArea();

                        JOptionPane.showMessageDialog(null, String.format("Área do Retângulo é %.2f", area));
                        break;

                    // Triângulo
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado do triângulo");
                        lado = Float.parseFloat(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite a altura do triângulo");
                        altura = Float.parseFloat(auxiliar);

                        ret = new Retangulo(lado, altura);
                        area = ret.calcularArea();

                        JOptionPane.showMessageDialog(null, String.format("Área do Triângulo é %.2f", area));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
                }

                escolha = JOptionPane.showInputDialog("Deseja continuar? (sim/não)");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa. Volte sempre.");

    }
}
