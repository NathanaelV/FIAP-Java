package br.com.fiap.main;

// Augusto Bonomo Junior            - RM: 565155
// Nathanael Cândido Mattos Vieira  - RM: 564990

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa;
        Scanner scan;
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, mensalidadeDaAcademia, rendaFamiliarLiquida,
                totalGastos;
        int numeroDeMoradores;

        try {
            // Usar o Scanner
            scan = new Scanner(System.in);
            despesa = new DespesaFamiliar();
            System.out.print("\nDigite sua renda familiar: ");
            rendaFamiliar = scan.nextDouble();
//            rendaFamiliar = 10_000.0;

            System.out.print("Digite o número de moradores: ");
            numeroDeMoradores = scan.nextInt();
//            numeroDeMoradores = 4;

            System.out.print("Digite o gasto com Luz: ");
            gastoComLuz = scan.nextDouble();
//            gastoComLuz = 200.0;

            System.out.print("Digite o gasto com Água: ");
            gastoComAgua = scan.nextDouble();
//            gastoComAgua = 100.0;

            System.out.print("Digite o gasto com Internet: ");
            gastoComInternet = scan.nextDouble();
//            gastoComInternet = 100.0;

            System.out.print("Digite o valor da Mensalidade da Academia: ");
            mensalidadeDaAcademia = scan.nextDouble();
//            mensalidadeDaAcademia = 100.0;

            despesa.rendaFamiliar = rendaFamiliar;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeDaAcademia = mensalidadeDaAcademia;

            rendaFamiliarLiquida = despesa.calcularRendaFamiliarLiquida();
            totalGastos = despesa.calcularTotalDeDespesas();

            System.out.println();

            System.out.printf("Balanço familiar:\nRenda da Família: R$ %.3f\nTotal de gastos: R$ %.3f\nRenda familiar líquida: R$ %.3f\n", despesa.rendaFamiliar, totalGastos, rendaFamiliarLiquida);

        } catch (Exception e) {
            System.out.println("Valores incorretos!");
        }
    }
}
