package main.br.com.fiap.bean;

import javax.swing.*;

public class ContaBacaria {
    // Atributos
    private String cliente;
    private int numConta;
    private float saldo;

    // Construtor
    public ContaBacaria() {}

    // Getter e Setter

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Métodos da classe (particulares)
    public float sacar(float valor) {
        if (valor > saldo) {
            String texto = String.format("Saldo insuficiente! Seu saldo é de R$%.2f", saldo);
            JOptionPane.showMessageDialog(null, texto);
        } else {
            saldo -= valor;
        }
        return saldo;
    }

    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}
