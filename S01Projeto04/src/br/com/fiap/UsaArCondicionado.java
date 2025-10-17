package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();

        arCondicionado.temperatura = 26;
        arCondicionado.modo = "ventilar";

        arCondicionado.diminuirTemperatura();
        arCondicionado.diminuirTemperatura();
        arCondicionado.diminuirTemperatura();
        arCondicionado.diminuirTemperatura();
        arCondicionado.trocarModo("resfriar");

        System.out.println("Temperatura: " + arCondicionado.temperatura + "\nModo: " + arCondicionado.modo);

        System.out.println("-".repeat(20));
        arCondicionado.aumentarTemperatura();
        arCondicionado.aumentarTemperatura();
        arCondicionado.trocarModo("aquecer");

        System.out.println("Temperatura: " + arCondicionado.temperatura + "\nModo: " + arCondicionado.modo);
    }
}
