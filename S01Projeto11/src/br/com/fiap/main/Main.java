package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1;
        String auxiliar, nome, dataEUA, ano, mes, dia;
        LocalDate dataNascimento;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Deixa o nome do usuário todo maiúsculo
            nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Digite data de nascimento (dia/mês/ano)");

//            // Arrumar a String no formato ano-mês-dia
//            // 0 1 2 3 4 5 6 7 8 9
//            // 15 / 1 1 / 1 9 9 8
//            ano = auxiliar.substring(6, 10);
//            mes = auxiliar.substring(3, 5);
//            dia = auxiliar.substring(0, 2);
//            dataEUA = String.format("%s-%s-%s", ano, mes, dia);
//            dataNascimento = LocalDate.parse(dataEUA);

            // Outra alternativa
            // Informa o formato que data virá.
            dataNascimento = LocalDate.parse(auxiliar, dtf);

            pessoa1 = new Pessoa(nome, dataNascimento);

            JOptionPane.showMessageDialog(null, String.format("Data formato EUA\nData de Nascimento %s",
                    pessoa1.getDataNascimento()));

            // Formatando a data no padrão dia/mês/ano

            JOptionPane.showMessageDialog(null,
                    String.format("Dados pessoais\nNome: %s\nData de Nascimento: %s\nIdade: %d ano(s)",
                    pessoa1.getNome(), pessoa1.getDataNascimento().format(dtf),
                    pessoa1.calcularIdade()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
