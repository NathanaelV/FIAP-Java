package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Equipe {
    private String nome;
    private ArrayList<String> integrantes;


    // Construtores
    public Equipe () {}

    public Equipe(String nome, ArrayList<String> integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }


    // Métodos de Classe
    public void listarEquipe() {
        String equipe = nome;
        Collections.sort(integrantes);
        for (String integrante : integrantes) {
            equipe += String.format("\n - %s", integrante);
        }

        JOptionPane.showMessageDialog(null, equipe, "Listagem da Equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
