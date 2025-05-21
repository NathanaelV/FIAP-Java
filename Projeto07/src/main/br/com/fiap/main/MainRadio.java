package main.br.com.fiap.main;


import main.br.com.fiap.bean.Radio;

public class MainRadio {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setEstacao(89.1f);
        radio.setVolume(55);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(92.5f);
        System.out.printf("Estação atual: %.1fMhz\nVolume atual: %d\n", radio.getEstacao(), radio.getVolume());

        radio.setVolume(99);
        radio.aumentarVolume();
        radio.aumentarVolume();
    }
}
