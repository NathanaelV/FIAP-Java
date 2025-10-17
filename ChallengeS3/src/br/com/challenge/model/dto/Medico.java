package br.com.challenge.model.dto;

import java.time.LocalDate;

public class Medico extends Pessoa {
    private String codigoCRM;
    private boolean disponibilidadeOnline;
    private String especialidade;

    public Medico() {}

    public Medico(String nome, LocalDate dataNascimento, String documento, Endereco endereco, Contato contato, String codigoCRM, boolean disponibilidadeOnline, String especialidade) {
        super(nome, dataNascimento, documento, endereco, contato);
        this.codigoCRM = codigoCRM;
        this.disponibilidadeOnline = disponibilidadeOnline;
        this.especialidade = especialidade;
    }

    // Getter e Setter
    public String getCodigoCRM() {
        return codigoCRM;
    }

    public void setCodigoCRM(String codigoCRM) {
        this.codigoCRM = codigoCRM;
    }

    public boolean isDisponibilidadeOnline() {
        return disponibilidadeOnline;
    }

    public void setDisponibilidadeOnline(boolean disponibilidadeOnline) {
        this.disponibilidadeOnline = disponibilidadeOnline;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
