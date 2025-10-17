package main.br.com.fiap.main;

import main.br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento pagamento = new FolhaDePagamento();
        String aux, stringFolhaPagamento;

        try {
            aux = JOptionPane.showInputDialog("Digite seu salário bruto: ");
            pagamento.salarioBruto = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite o número de dependentes: ");
            pagamento.numeroDeDependentes = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Desconto do INSS (%): ");
            pagamento.descontoINSS = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Valor do plano de Saúde: ");
            pagamento.valorPlanoDeSaude = Double.parseDouble(aux);

            stringFolhaPagamento = "\nSalário bruto: %.3f".formatted(pagamento.salarioBruto);

            JOptionPane.showMessageDialog(null, stringFolhaPagamento);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
