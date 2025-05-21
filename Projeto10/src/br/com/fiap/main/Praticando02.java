package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Praticando02 {
    public static void main(String[] args) {
//        LocalDate  dataInicial, dataFinal;
//        String texto, data01, data02;
//        Period periodo, periodoInvertido;
//        DateTimeFormatter dtf;
//
//        // O Usuário tem que inserir a data
//        // Trocar
//        dataInicial = LocalDate.parse("1996-01-06");
//        dataFinal = LocalDate.now();
//
//        periodo = Period.between(dataInicial, dataFinal);
//
//        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        texto = """
//                Data inicial: %s
//                Data final: %s
//                Entre as datas fornecidas existem %d ano(s), %d mês(es) e %d dia(s)!
//                """.formatted(dataInicial.format(dtf),
//                    dataFinal.format(dtf),
//                    periodo.getYears(),
//                    periodo.getMonths(),
//                    periodo.getDays());
//
//        JOptionPane.showMessageDialog(null, texto);
//
//        System.out.println("O rato roeu a roupa do rei de roma".length());
//        System.out.println("O rato roeu a roupa do rei de roma".substring(14,18));
//
//
//        System.out.println("\n\nQuestionário:\n\n");
//        LocalDate data1 = LocalDate.parse("2020-11-21");
//        LocalDate data2 = LocalDate.parse("2010-01-01");
//
//        periodoInvertido = Period.between(data1, data2);
//        Period periodo2 = Period.between(data2, data1);
//
//        System.out.println(periodoInvertido.getYears());
//        System.out.println(periodoInvertido.getMonths());
//        System.out.println(periodo2);

        String date1, date2;
        LocalDate dataInicial;

        // O Usuário vai digitar no formato dd/MM/yyyy ou dd-MM-yyyy
        date1 = JOptionPane.showInputDialog("Digite uma data: ");
        dataInicial = LocalDate.parse(date1);

    }
}
