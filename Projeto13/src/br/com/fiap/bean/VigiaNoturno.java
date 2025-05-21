package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario {
    private float adicionalNoturno;

    public VigiaNoturno() {}

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        super(nome, valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }

    // Getter / Setter
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    // Métodos da classe (particulares)
    public float calcularSalario() {
        return super.calcularSalario() + adicionalNoturno;
    }
}
