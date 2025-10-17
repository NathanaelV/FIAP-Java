package br.com.fiap.bean;

public class Retangulo extends Quadrado{
    private float altura;

    // Construtores
    public Retangulo() {}

    public Retangulo(float lado, float altura) {
        super(lado);            // super.setLado(lado);
        this.altura = altura;
    }

    // Setter e Getter
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        // Busca o lado do pai
        return altura * super.getLado();
    }
}
