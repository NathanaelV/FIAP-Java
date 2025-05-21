package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    // Construtores
    public Pessoa() {}

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
//        this.dataNascimento = dataNascimento;
        setDataNascimento(dataNascimento);
    }

    // Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        LocalDate inicio = LocalDate.parse("1899-12-31"); // Dia anterior a data limite. Posso usar o isAfter
        LocalDate fim = LocalDate.now().plusDays(1); // Adiciona um dia para permitir a Data atual usando o isBefore

        try {
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data fora da faixa permitida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Mostra a mensagem de erro
            System.exit(0); // encerra o programa após
        }
    }

    // Métodos da classe (particulares)
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }
}
