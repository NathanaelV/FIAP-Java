package main.br.com.fiap.bean;

public class ContaEspecial {
    // Atributos
    private float limite;

    // Construtor
    public ContaEspecial() {}

    // Getter e Setter
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    // Método da classe (particulares)
    public float sacar(float valor) {
        return valor;
    }
}

