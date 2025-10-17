package br.com.fiap.bean;

public class Quadrado {
    private float lado;

    // Construtores
    public Quadrado() {}

    public Quadrado(float lado) {
        this.lado = lado;
    }

    // Métodos Getter/Setter
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    // Métodos das classes (particulares)
    public float calcularArea() {
        return lado * lado;
    }
}
