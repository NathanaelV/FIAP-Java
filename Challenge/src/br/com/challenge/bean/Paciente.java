package br.com.challenge.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class Paciente extends Pessoa {
    private int numeroCadastro;
    private RedeCredenciada redeCredenciada;
    private Acompanhante acompanhante;
    private Consulta consulta;

    public Paciente() {
    }

//    public Paciente(String nome, LocalDate dataNascimento, String documento, Endereco endereco, Contato contato, int numeroCadastro, RedeCredenciada redeCredenciada, Acompanhante acompanhante) {
//        super(nome, dataNascimento, documento, endereco, contato);
//        this.numeroCadastro = numeroCadastro;
//        this.redeCredenciada = redeCredenciada;
//        this.acompanhante = acompanhante;
//    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }

    public RedeCredenciada getRedeCredenciada() {
        return redeCredenciada;
    }

    public void setRedeCredenciada(RedeCredenciada redeCredenciada) {
        this.redeCredenciada = redeCredenciada;
    }

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        consulta.setPaciente(this);
        this.consulta = consulta;

        String mensagem = String.format(
                "Consulta marcada para o %s:\n%s - %s\n    %s ",
                consulta.getPaciente().getNome(),
                consulta.dataFormatada(),
                consulta.getLocal(),
                consulta.getTratamento().getNome()
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void abreOcorrencia(String assunto, String texto) {
        Ocorrencia ocorrencia = new Ocorrencia(this, assunto, texto);
        String mensagem = String.format(
                "Ocorrência aberta para o paciente %s:\n%s - %s\n    %s ",
                ocorrencia.getPaciente().getNome(),
                ocorrencia.getCodigoChamado(),
                ocorrencia.getAssunto(),
                ocorrencia.getTexto()
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}