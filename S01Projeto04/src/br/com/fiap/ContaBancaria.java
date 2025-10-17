package br.com.fiap;

public class ContaBancaria {
    private String agencia;
    private String conta;
    private double saldo;
    private Person proprietario;

    public ContaBancaria(String conta, String agencia, Person proprietario) {
        this.conta = conta;
        this.agencia = agencia;
        this.proprietario = proprietario;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        mostrarSaldo();
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            mostrarSaldo();
        } else {
            saldo -= valor;
            mostrarSaldo();
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                ", proprietário=" + proprietario +
                '}';
    }
}
