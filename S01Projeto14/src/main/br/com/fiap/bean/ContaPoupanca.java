package main.br.com.fiap.bean;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBacaria{
    // Atributos
    private int diaDeRendimento;

    // Construtor
    public ContaPoupanca() {}

    // Getter e Setter
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    // Métodos da classe (particulares)
    public float novoSaldo(float rendimento) {
        int dia = LocalDate.now().getDayOfMonth();
        if (diaDeRendimento <= dia) {
            setSaldo(getSaldo() * (1 + rendimento/100));
        }
        return getSaldo();
    }
}
