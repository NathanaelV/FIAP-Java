package br.com.challenge.bean;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String documento;
    private Endereco endereco;
    private Contato contato;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento, String documento, Endereco endereco, Contato contato) {
        this.nome = nome;
        setDataNascimento(dataNascimento);
        this.documento = documento;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        // Adicionar o Less one day
        LocalDate inicio = LocalDate.of(1900, 1, 1).minusDays(1);
        // Adicionar o more one day
        LocalDate fim = LocalDate.now().plusDays(1);

        try {
            if (dataNascimento.isAfter(inicio) || dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Digite uma data de nascimento válida!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}