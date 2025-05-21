package br.com.fiap.bean;

// Augusto Bonomo Junior            - RM: 565155
// Nathanael Cândido Mattos Vieira  - RM: 564990

public class DespesaFamiliar {
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    public double calcularTotalDeDespesas() {
        double total = 0.0;
        total += gastoComLuz;
        total += gastoComAgua;
        total += gastoComInternet;
        total += valorMensalidadeDaAcademia * numeroDeMoradores;

        return total;
    }

    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}
