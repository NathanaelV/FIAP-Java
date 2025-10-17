package br.com.fiap;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        char gender = 'M';
        byte age = 35;
        short code = 15650;
        int students = 50, classes = 11;
        long brazilians = 216455377500L;
        float media = 8.7f;
        double dollar = 5.68;
        boolean alternative = false;
        String completeName = "Raphael Splinter";

        System.out.printf("Sexo: %s Idade: %d Código: %d", gender, age, code);
        System.out.printf("%nMédia: %f Alunos: %d Turmas: %d", media, students, classes);
        System.out.printf("%nHabitantes: %d Cotação do Dólar: U$ %.2f", brazilians, dollar);
        System.out.printf("%nAlternativa: %b", alternative);
        System.out.printf("%nNome: %s", completeName);

        System.out.printf("\n\n %s [-%.0f; %.0f]", "Byte", Math.pow(2, 7), Math.pow(2,7) - 1);
        System.out.printf("\n %s [-%.0f; %.0f]", "Short", Math.pow(2, 15), Math.pow(2,15) - 1);
        System.out.printf("\n %s [-%.0f; %.0f]", "Int", Math.pow(2, 31), Math.pow(2,31) - 1);
        System.out.printf("\n %s [-%.0f; %.0f]\n", "Long", Math.pow(2, 63), Math.pow(2,63) - 1);
    }
}
