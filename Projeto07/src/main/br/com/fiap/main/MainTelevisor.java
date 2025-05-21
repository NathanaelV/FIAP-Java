package main.br.com.fiap.main;

import main.br.com.fiap.bean.Televisor;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        tv1.setCanal(4);
        tv1.setVolume(5);
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.setCanal(13);
        System.out.printf("Canal atual: %d \nVolume atual :%d\n", tv1.getCanal(), tv1.getVolume());
    }
}
