package br.com.fiap.bean;

public class Triangulo extends Quadrado {
    private float altura;

    // Construtores
    public Triangulo() {}

    public Triangulo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    // Getter / Setter
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Métodos da classe (particulares)
    public float calcularArea() {
        return altura * super.getLado() / 2;
    }
}
