package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;


    // Construtores
    public SuperHeroi() {}

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }


    // Métodos de classe
    public void listarHeroi() {
        String descricao = String.format("%s (%s)", nome, idSecreta);

        if (poderes.length > 0) {
            descricao += "\nPoderes:";
            for (String poder : poderes) {
                descricao += String.format("\n - %s", poder);
            }
        }

        if (fraquezas.length > 0) {
            descricao += "\nFraquezas:";
            for (String fraqueza : fraquezas) {
                descricao += String.format("\n - %s", fraqueza);
            }
        }

        JOptionPane.showMessageDialog(null, descricao);
    }
}
