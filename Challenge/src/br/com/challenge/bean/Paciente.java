package br.com.challenge.bean;

import javax.swing.*;

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