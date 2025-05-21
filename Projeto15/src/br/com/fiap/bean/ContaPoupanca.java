package br.com.fiap.bean;

/**
 * Classe para criar objetos de Conta Bancária
 * @author Fulano daSilva Sauro
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {
    // Atributos
    private int numConta;
    private float saldo;

    // Construtores
    public ContaPoupanca() {}

    // Getter e Setter
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

    // Métodos da classe (particularidades)

    /**
     * Método sacar que permite sacar um valor informado.
     * Valor informado deve ser inferior ou igual ao saldo atual.
     * @author Fulano da Silava Saura
     * @param valor - Indica valor a ser sacado
     * @return float - valor do saldo (atualizado)
     */
    public float sacar(float valor) {
        try {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                throw new Exception("Saldo Insuficiente!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Método depositar que deposita o valor informado.
     * @author Ciclano de Souza
     * @param valor valor a ser depositado
     * @return valor do saldo (atualizado)
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}
