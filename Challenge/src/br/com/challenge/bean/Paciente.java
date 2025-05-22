package br.com.challenge.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private int numeroCadastro;
    private RedeCredenciada redeCredenciada;
    private Acompanhante acompanhante;

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


//    public void abreOcorrencia(String assunto, String texto) {
//        System.out.println("Ocorrência aberta para o paciente " + this.getNome() + ": " + assunto + " - " + texto);
//        // In a real application, this would create an Ocorrencia object and persist it.
//    }
//
//    public void novaConsulta(LocalDate dataHora, Tratamento tratamento) {
//        System.out.println("Nova consulta agendada para " + this.getNome() + " em " + dataHora + " para tratamento: " + tratamento.getNome());
//        // In a real application, this would create a Consulta object.
//    }
//
//    public void reagendamentoConsulta(Consulta consulta, LocalDateTime novaData) {
//        System.out.println("Reagendamento da consulta " + consulta.getCodigo() + " para " + novaData);
//        // In a real application, this would update the Consulta object.
//    }
}