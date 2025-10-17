package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gestante1;
        String nome, auxiliar, texto;
        LocalDate dataFecundacao;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            nome = JOptionPane.showInputDialog("Digite seu nome");

            auxiliar = JOptionPane.showInputDialog("Digite a data da fecundação no formato dia-mês-ano");
            dataFecundacao = LocalDate.parse(auxiliar, dtf);

            gestante1 = new Gestante(nome, dataFecundacao);

            JOptionPane.showMessageDialog(null, String.format("Data da gestação: %s", gestante1.getDataDaGestacao()));

            texto = String.format("Info\nNome: %s\nData da gestação: %s\nTempo de Gestação: %d mês(es)",
                    gestante1.getNome(),
                    gestante1.getDataDaGestacao().format(dtf),
                    gestante1.tempoDeGestacao());

            JOptionPane.showMessageDialog(null, texto);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
