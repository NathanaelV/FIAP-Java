package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

import javax.swing.*;

public class UsaCalculadora {
    public static void main(String[] args) {
        int num1, num2, op;
        String menu, resposta;
        Calculadora calculadora;

        do {
            try {
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

                calculadora = new Calculadora();
                calculadora.setNumero1(num1);
                calculadora.setNumero2(num2);

                menu = "Qual operação deseja realizar:\n" +
                    "1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicação\n" +
                    "4 - Divisão\n";

                op = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (op) {
                    case 1:
                        resposta = String.format("%.2f + %.2f = %.2f ", calculadora.getNumero1(), calculadora.getNumero2(), calculadora.adicao());
                        JOptionPane.showMessageDialog(null, resposta);
                    case 2:
                        resposta = String.format("%.2f - %f = %f ", calculadora.getNumero1(), calculadora.getNumero2(), calculadora.adicao());
                        JOptionPane.showMessageDialog(null, resposta);
                    case 3:
                        resposta = String.format("%f x %f = %f ", calculadora.getNumero1(), calculadora.getNumero2(), calculadora.adicao());
                        JOptionPane.showMessageDialog(null, resposta);
                    case 4:
                        resposta = String.format("%f / %f = %f ", calculadora.getNumero1(), calculadora.getNumero2(), calculadora.adicao());
                        JOptionPane.showMessageDialog(null, resposta);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de formato numérico: " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro Aritmético: " + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
            
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        
        JOptionPane.showMessageDialog(null, "Até a próxima!");
    }
}
