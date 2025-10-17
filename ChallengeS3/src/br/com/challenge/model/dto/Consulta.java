package br.com.challenge.model.dto;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDate dataHora;
    private Paciente paciente;
    private Medico medico;
    private String local;
    private Prontuario prontuario;
    private Tratamento tratamento;

    public Consulta() {}

    public Consulta(LocalDate dataHora, Paciente paciente, String local, Tratamento tratamento) {
        setDataHora(dataHora);
        this.paciente = paciente;
        this.local = local;
        this.tratamento = tratamento;
    }

    // Getters e Setters
    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        try {
            if (dataHora.isAfter(LocalDate.now())) {
                this.dataHora = dataHora;
            } else {
                throw new Exception("A data deve ser futura!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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

    // Métodos de classe
    public boolean remarcar(LocalDate novaData) {
        try {
            if (novaData.isAfter(LocalDate.now())) {
                setDataHora(novaData);

                String mensagem = String.format(
                        "Consulta remarcada para o %s:\n%s - %s\n    %s ",
                        getPaciente().getNome(),
                        dataFormatada(),
                        getLocal(),
                        getTratamento().getNome()
                );
                JOptionPane.showMessageDialog(null, mensagem);

                return true;
            } else {
                throw new Exception("A data deve ser futura!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public String dataFormatada() {
        return getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
