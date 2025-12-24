package com.ieschabas;

/**
 * Clase Streamers en la cual vamos a introducir el nombre de cuatro streamers dentro de un array y luego vamos a modificar el valor que se encuentra en tercera posición
 */

public class Ejercicio02_Streamers {
    public static void main(String[] args) {
        /**
         * Generamos el primer array con los cuatro streamers
         */
        String[] topStreamers = {"Tatoh", "TheViper", "Hera", "DauT"};

        /**
         * Mostramos en pantalla cual es el tercer streamer
         */
        System.out.println("El streamer en la posición 3 es: " + topStreamers[2]);

        /**
         * Modificamos el nombre del primer streamer
         */
        topStreamers[0] = "MegaProGamer";

        /**
         * Mostramos el array completo
         */

        for (int i = 0; i < topStreamers.length; i++) {
            System.out.println(topStreamers[i]);
        }
    }
}
