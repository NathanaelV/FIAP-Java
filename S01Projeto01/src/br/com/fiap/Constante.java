package br.com.fiap;

public class Constante {
    public static void main(String[] args) {
        // final é o que transforma uma variável em uma constante
        // O Java não tem constante, porém faz uma variável se comportar como constante.
        final double PI = 3.1415;
        final float GRAVIDADE_TERRESTRE = 9.8f;

        // Sequência de Escape: \n (pula de linha)
        System.out.printf("Valor de PI é: %f\nGravidade da terra: %f", PI, GRAVIDADE_TERRESTRE);
    }
}
