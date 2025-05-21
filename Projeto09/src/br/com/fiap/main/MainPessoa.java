package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Berisvaldo", 1980);

        pessoa1.setNome("Astrogildo");
        pessoa1.setAnoNascimento(1998);
        int idadePessoa1 = pessoa1.calcularIdade(2025);

        System.out.printf("Pessoa 1:\nNome: %s\nIdade: %d anos\n\nPessoa 2:\nNome: %s\nIdade %d anos\n", pessoa1.getNome(),
                idadePessoa1, pessoa2.getNome(), pessoa2.calcularIdade(2025));

    }

}
