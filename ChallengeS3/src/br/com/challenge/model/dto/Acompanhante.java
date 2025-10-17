package br.com.challenge.model.dto;

import java.time.LocalDate;

public class Acompanhante extends Pessoa {
    private String grauParentesco;

    public Acompanhante() {}

    public Acompanhante(String nome, LocalDate dataNascimento, String documento, Endereco endereco, Contato contato, String grauParentesco) {
        super(nome, dataNascimento, documento, endereco, contato);
        this.grauParentesco = grauParentesco;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
}