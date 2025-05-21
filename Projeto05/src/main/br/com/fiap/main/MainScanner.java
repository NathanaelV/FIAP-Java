package main.br.com.fiap.main;

import main.br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scan;
        FolhaDePagamento pagamento = new FolhaDePagamento();
        double salBruto, descINSS, planoSaude;
        int dependentes;

        try {
            scan = new Scanner(System.in);

            System.out.print("Qual seu salário bruto: ");
            salBruto = scan.nextDouble();
            pagamento.salarioBruto = salBruto;

            System.out.print("Qual número de dependentes: ");
            dependentes = scan.nextInt();
            pagamento.numeroDeDependentes = dependentes;

            System.out.print("Desconto do INSS: ");
            descINSS = scan.nextDouble();
            pagamento.descontoINSS = descINSS;

            System.out.print("Valor do Plano de saúde: ");
            planoSaude = scan.nextDouble();
            pagamento.valorPlanoDeSaude = planoSaude;

            System.out.printf("Salário líquido: %.2f", pagamento.calcularSalarioLiquido());

        } catch (Exception e) {
            System.out.println("Digite os valores corretos!");
            throw new RuntimeException(e);
        }
    }
}
