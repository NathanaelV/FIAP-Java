package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private ArrayList<String> poderes;
    private ArrayList<String> fraquezas;


    // Construtores
    public SuperHeroi() {}

    public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
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

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    public ArrayList<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(ArrayList<String> fraquezas) {
        this.fraquezas = fraquezas;
    }


    // Métodos de Classe
    public void listarHeroi() {
        String mostrar = String.format("%s - (%s)", nome, idSecreta);

        if (poderes.size() > 0) {
            Collections.sort(poderes);
            mostrar += "\nPoderes:";
            for (String poder : poderes) {
                mostrar += "\n - " + poder;
            }
        }

        if (fraquezas.size() > 0) {
            Collections.sort(fraquezas);
            mostrar += "\nFraquezas:";
            for (String fraqueza : fraquezas) {
                mostrar += "\n - " + fraqueza;
            }
        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}
