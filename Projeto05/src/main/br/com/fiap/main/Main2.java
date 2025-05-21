package main.br.com.fiap.main;

import main.br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan;
        Televisor tv = new Televisor();
        int canal, volume;

        try {
            scan = new Scanner(System.in);
            System.out.print("Escolha um canal: ");
            canal = scan.nextInt();

            System.out.print("Escolha o volume: ");
            volume = scan.nextInt();

            tv.canal = canal;
            tv.volume = volume;

            System.out.printf("\nDados do Televisor:\nCanal escolhido: %d\nVolume escolhido: %d\n", tv.canal, tv.volume);
        } catch (Exception e) {
            System.out.println("Formato incorreto de número!");
        }

    }
}
