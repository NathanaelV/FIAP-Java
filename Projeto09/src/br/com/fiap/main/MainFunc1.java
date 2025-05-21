package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Raph");
        func.setValorHoraTrabalho(20.0f);
        LocalDate dataAtual = LocalDate.now();

        // Neste exemplo o funcionário trabalha 20 horas por semana
        System.out.println("Data: ");
    }
}
