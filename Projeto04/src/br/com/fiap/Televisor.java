package br.com.fiap;

public class Televisor {
    public int volume;
    public int canal;

    public void aumetarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
