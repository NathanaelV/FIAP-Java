package br.com.fiap.bean;

import javax.swing.*;

public class Geometria {
    private float lado;
    private double raio;
    private float altura;

    // Construtores
    public Geometria() {}

    // Getters e Setters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Métodos da classe (particulares)
    public void calcularArea(float lado) {
        // Caso tenha alguma lógica de negócio, usar o setLado
        setLado(lado);
        // Usar os valores do atributo
        float area = this.lado * this.lado;
        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %.2f", area));
    }

    public void calcularArea(float lado, float altura) {
        // Caso tenha alguma lógica de negócio, usar o setLado
        setLado(lado);
        setAltura(altura);
        // Usar os valores do atributo
        float area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, String.format("Área do retângulo: %.2f", area));
    }

    public void calcularArea(double raio) {
        // Caso tenha alguma lógica de negócio, usar o setLado
        setRaio(raio);
        // Usar os valores do atributo
        double area = Math.PI * Math.pow(this.raio, 2);
        JOptionPane.showMessageDialog(null, String.format("Área do círculo: %.2f", area));
    }
}
