package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.exception.SaldoInsuficienteException;

public class UsaContaBancaria {
    public static void main(String[] args) {
        try {
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial da conta"));

            ContaBancaria conta = new ContaBancaria(saldo);

            double quantia = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia do saque"));

            conta.sacar(quantia);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro genérico: " + e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null, "Volte sempre");
        }
    }
}
