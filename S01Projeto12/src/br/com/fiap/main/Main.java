package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

//        i = 8;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);

        Geometria geo = new Geometria();
        String auxiliar, escolha = "sim";
        int op;
        float lado, altura;
        double raio;

        while (escolha.equalsIgnoreCase("sim")) {
            // Tratamento de Erros
            // Trata o erro a cada repetição
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular?\n(1) Quadrado\n(2) Retângulo\n(3) Círculo");
                op = Integer.parseInt(auxiliar);

                switch (op) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado");
                        lado = Float.parseFloat(auxiliar);
                        geo.calcularArea(lado);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado");
                        lado = Float.parseFloat(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite a altura");
                        altura = Float.parseFloat(auxiliar);

                        geo.calcularArea(lado, altura);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do raio");
                        raio = Double.parseDouble(auxiliar);
                        geo.calcularArea(raio);
                        break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }

                escolha = JOptionPane.showInputDialog("Deseja continuar? (sim/não)");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }


        }

        JOptionPane.showMessageDialog(null, "Fim de Programa. Volte sempre!");
    }
}
