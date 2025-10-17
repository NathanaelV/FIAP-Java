package br.com.fiap;

public class Person {
    private String nome;
    private String cpf;

    public Person(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
