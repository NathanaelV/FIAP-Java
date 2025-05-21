package br.com.fiap;

public class UsaRadio {
    public static void main(String[] args) {
//        Radio radio; // Declaração do objeto
//        radio = new Radio(); // instanciação do objeto

        // Teste Mock, onde nós passamos o valor, não pedimos para o usuário

        Radio radio = new Radio();
        radio.estacao = 89.1f;
        radio.volume = 5;
        radio.trocarEstacao(92.5f);
        radio.aumentarVolume();
        radio.aumentarVolume();

        System.out.println("Volume atual: " + radio.volume + "\nEstação atual: " + radio.estacao);
    }
}
