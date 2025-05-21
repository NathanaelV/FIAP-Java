package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;

public class MainConta {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int numConta, op;
        float valor, saldo;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Digite número da conta");
                numConta = Integer.parseInt(auxiliar);

                auxiliar = JOptionPane.showInputDialog("Digite o valor do saldo");
                saldo = Float.parseFloat(auxiliar);

                ContaPoupanca cp = new ContaPoupanca();
                cp.setNumConta(numConta);
                cp.setSaldo(saldo);

                auxiliar = JOptionPane.showInputDialog("Escoha Operação:\n(1) Saque\n(2) Depósito");
                op = Integer.parseInt(auxiliar);

                switch (op) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor a ser sacado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format(
                                "Dados da Conta\nNúmero da Conta: %d\nSaldo Atual: R$ %.2f",
                                cp.getNumConta(),
                                cp.sacar(valor)
                        ));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor a ser depositado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format(
                                "Dados da Conta\nNúmero da Conta: %d\nSaldo Atual: R$ %.2f",
                                cp.getNumConta(),
                                cp.depositar(valor)
                        ));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha uma opção válida!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            escolha = JOptionPane.showInputDialog("Deseja continuar? (sim/não)");
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}
