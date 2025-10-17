package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Pessoa pessoa1;
        Scanner scan;
        String nome;
        int anoNascimento, idadePessoa1;

        try {

            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e ano de nascimento.");
            nome = scan.nextLine();
            anoNascimento = scan.nextInt();

            pessoa1 = new Pessoa(nome, anoNascimento);
            idadePessoa1 = pessoa1.calcularIdade(2025);

            System.out.printf("Pessoa 1:\nNome: %s\nIdade: %d anos", pessoa1.getNome(), idadePessoa1);

        } catch (Exception e) {
            System.out.println("Nome e/ou ano de nascimento inválidos!");
        }
    }
}
