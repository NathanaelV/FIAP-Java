package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;

    // Construtores
    public Gestante() {}

    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
//        this.dataDaGestacao = dataDaGestacao;
        setDataDaGestacao(dataDaGestacao);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        LocalDate fim = LocalDate.now();
        LocalDate inicio = fim.minusMonths(9).minusDays(1);

        try {
            if (dataDaGestacao.isAfter(inicio) && dataDaGestacao.isBefore(fim.plusDays(1))) {
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("Data fora da faixa permitida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

    }

    // Métodos da classe (particulares)
    public int tempoDeGestacao() {
        LocalDate dataAtual = LocalDate.now();
        Period gestacao = Period.between(dataDaGestacao, dataAtual);
        return gestacao.getMonths();
    }
}
