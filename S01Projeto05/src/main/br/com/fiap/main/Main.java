package main.br.com.fiap.main;

import main.br.com.fiap.bean.ArCondicionado;
import main.br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.canal = 4;
        tv.volume = 3;

        tv.trocarCanal(7);
        tv.diminuirVolume();
        tv.diminuirVolume();

        System.out.printf("Dados do Televisor\nCanal atual: %d\nVolume atual: %d\n", tv.canal, tv.volume);


        // Ar-Condicionado

        ArCondicionado ar = new ArCondicionado();
        ar.temperatura = 21;
        ar.modo = "ventilar";
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.trocarModo("aquecer");

        String mensagem = String.format("\nDados do Ar-condicionado:\nTemperatura atual: %d°C\nModo atual: %s",
                ar.temperatura, ar.modo);

        System.out.println(mensagem);
    }
}
