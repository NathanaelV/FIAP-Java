package br.com.fiap;

import java.util.Scanner;

public class Ex03Scanner {
    public static void main(String[] args) {
        float radius, area;
        final float PI = 3.14159f;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.print("\nDigite o valor do raio para o cálculo da circunferência: ");
            radius = scan.nextFloat();

            area = radius * radius * PI;

            System.out.println("O valor da área é " + area);
        } catch (Exception e) {
            System.out.println("Digite um valor de raio válido!");
        }
    }
}
