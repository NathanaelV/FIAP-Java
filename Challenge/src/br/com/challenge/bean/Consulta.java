package br.com.challenge.bean;

import java.time.LocalDate;

public class Consulta {
    private LocalDate dataHora;
    private Paciente paciente;
    private Medico medico;
    private String local;
    private Prontuario prontuario;
    private Tratamento tratamento;

    public Consulta() {}

    public Consulta(LocalDate dataHora, Paciente paciente, String local, Tratamento tratamento) {
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.local = local;
        this.tratamento = tratamento;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }
}
