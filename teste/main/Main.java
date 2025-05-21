package main;

import bean.Televisor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hellow World!");

        Televisor tv = new Televisor();
        tv.canal = 5;
        tv.volume = 8;

        System.out.println(2500*0.3);
        System.out.println(tv.volume);
    }
}
