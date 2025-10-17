package br.com.fiap;

import java.util.Scanner;

public class Ex02Scanner {
    public static void main(String[] args) {
        short birthDate, currentYear;
        byte age;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.print("Digite seu ano de nascimento: ");
            birthDate = scan.nextShort();

            System.out.print("Digite o ano atual: ");
            currentYear = scan.nextShort();

            age = (byte) (currentYear - birthDate);

            System.out.println("Sua idade nesse até é (ou será) " + age + " anos.");
        } catch (Exception e) {
            System.out.println("Digite um número válido para o ano!");
        }
    }
}
