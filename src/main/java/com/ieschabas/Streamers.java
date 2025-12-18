package com.ieschabas;

public class Streamers {
    public static void main(String[] args) {
        String[] topStreamers = {"Tatoh", "TheViper", "Hera", "DauT"};
        System.out.println("El streamer en la posición 3 es: " + topStreamers[2]);

        topStreamers[0] = "MegaProGamer";

        for (int i = 0; i < topStreamers.length; i++) {
            System.out.println(topStreamers[i]);
        }
    }
}
