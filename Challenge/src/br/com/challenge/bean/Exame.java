package br.com.challenge.bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exame {
    private String nome;
    private String observacoes;
    private LocalDate dataHora;
    private Paciente paciente;

    public Exame() {}

    public Exame(String nome, String observacoes, LocalDate dataHora, Paciente paciente) {
        this.nome = nome;
        this.observacoes = observacoes;
        this.dataHora = dataHora;
        this.paciente = paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // Métodos de classe
    public String dataFormatada() {
        return dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
