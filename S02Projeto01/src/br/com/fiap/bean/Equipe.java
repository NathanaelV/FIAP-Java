package br.com.fiap.bean;

import javax.swing.*;
import java.awt.*;

public class Equipe {
    private String nome;
    private String[] integrantes;


    // Construtores
    public Equipe () {};

    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }


    // Getter e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String[] getIntegrantes() { return integrantes; }
    public void setIntegrantes(String[] integrantes) { this.integrantes = integrantes; }


    // Métodos de classe
    public void listarEquipe() {
        String exibe = String.format("Nome da equipe: %s\nIntegrantes:\n", nome);

        for (String nome : this.integrantes) {
            exibe += String.format(" - %s\n", nome);
        }

        JOptionPane.showMessageDialog(null, exibe);
    }
}
