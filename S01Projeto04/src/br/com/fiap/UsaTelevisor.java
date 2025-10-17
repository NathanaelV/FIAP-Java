package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        televisor.volume = 10;
        televisor.canal = 3;

        televisor.aumetarVolume();
        televisor.aumetarVolume();
        televisor.aumetarVolume();
        televisor.trocarCanal(2);
        System.out.println("Volume da TV: " + televisor.volume + "\nCanal da TV: " + televisor.canal);

        System.out.println("-".repeat(20));
        televisor.diminuirVolume();
        televisor.diminuirVolume();
        televisor.trocarCanal(7);
        System.out.println("Volume da TV: " + televisor.volume + "\nCanal da TV: " + televisor.canal);
    }
}
