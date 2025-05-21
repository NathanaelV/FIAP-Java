package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate fimDosTempos = LocalDate.parse("2012-12-21");

        // Saber quanto se passou de uma data para outra
        // Colocar a data mais atual antes
        Period periodo = Period.between(fimDosTempos, dataAtual);

        // Formatar data
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatação da String
        String formatado = String.format("Fim dos tempos: %s \nData atual: %s \nDesde o fim dos tempos, passaram-se %d ano(s), %d mês(es) e %d dia(s).",
                fimDosTempos.format(dtf), dataAtual.format(dtf), periodo.getYears(), periodo.getMonths(), periodo.getDays());

        System.out.println(dataAtual);
        System.out.println(fimDosTempos);
        System.out.println(periodo);
        System.out.println(periodo.getDays());
        System.out.println(formatado);

        JOptionPane.showMessageDialog(null, formatado);


    }
}
