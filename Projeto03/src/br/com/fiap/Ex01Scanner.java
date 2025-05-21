package br.com.fiap;

import java.util.Scanner;

public class Ex01Scanner {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4, media;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.print("\nDigite o valor da Prova 1: ");
            prova1 = scan.nextFloat();

            System.out.print("Digite o valor da Prova 2: ");
            prova2 = scan.nextFloat();

            System.out.print("Digite o valor da Prova 3: ");
            prova3 = scan.nextFloat();

            System.out.print("Digite o valor da Prova 4: ");
            prova4 = scan.nextFloat();

            media = (prova1 + prova2 + prova3 + prova4) / 4;

            System.out.println("Média das provas será: " + media);
        } catch (Exception e) {
            System.out.println("Digite um valor apropriado para nota da prova.");
        }
    }
}
