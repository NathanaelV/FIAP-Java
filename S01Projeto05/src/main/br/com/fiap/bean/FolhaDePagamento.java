package main.br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido() {
        return salarioBruto - totalDescontoINSS() - valorTotalPlanoDeSaude();
    }

    private double valorTotalPlanoDeSaude() {
        return valorPlanoDeSaude * (numeroDeDependentes + 1);
    }

    private double totalDescontoINSS() {
        return salarioBruto * descontoINSS / 100;
    }
}
