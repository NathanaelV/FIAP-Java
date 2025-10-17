package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;

    // Construtor
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Método de Classe
    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque. Saldo: R$ " + saldo);
        }
        saldo -= quantia;
    }
}
