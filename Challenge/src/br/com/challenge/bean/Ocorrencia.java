package br.com.challenge.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ocorrencia {
    private Paciente paciente;
    private String codigoChamado;
    private LocalDateTime dataHora;
    private String assunto;
    private String texto;

    public Ocorrencia() {
        // Código Hexadecimal será automático e futuramente único.
        this.codigoChamado = "AAA01";
        this.dataHora = LocalDateTime.now();
    }

    public Ocorrencia(Paciente paciente, String assunto, String texto) {
        // Código Hexadecimal será automático e futuramente único.
        this.codigoChamado = "AAA01";
        this.dataHora = LocalDateTime.now();
        this.paciente = paciente;
        this.assunto = assunto;
        this.texto = texto;
    }

    public Paciente getPaciente() {
        return paciente;
    }

//    public void setPaciente(Paciente paciente) {
//        // Depois que um Paciênte abre uma ocorrência, não pode trocar de paciente
//         this.paciente = paciente;
//    }

    public String getCodigoChamado() {
        return codigoChamado;
    }

//    public void setCodigoChamado(String codigoChamado) {
//        // Código será criado com a criação da ocorrência
//         this.codigoChamado = codigoChamado;
//    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

//    public void setDataHora(LocalDateTime dataHora) {
//        // Data definida somente na criação da ocorrência
//        this.dataHora = dataHora;
//    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}