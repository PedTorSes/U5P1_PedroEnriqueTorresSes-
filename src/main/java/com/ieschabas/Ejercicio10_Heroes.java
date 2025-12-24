package com.ieschabas;

/**
 * Clase Heroes en la cual establecemos dos arrays de puntuaciones para un héroe y tenemos que ordenarlo de menor a mayor en función del número introducido.
 * En el primero realizaremos un orden a traves del comando "Arrays.sort" que organizará de menor a mayor conforme encuentre los números
 * En el segundo realizaremos el ordenado de las puntuaciones a través de una comparación por parejas.
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.Arrays;

public class Ejercicio10_Heroes {
    public static void main(String[] args) {
        int[] puntuacion1Heroes = {3,6,6,8,8,10,11,20,15,16};

        /**
         * Orden tras realizar un selection sort, es decir, que el programa recorre el array de números y va introduciendo ordenadamente el número menor en los primeros lugares
         */
        Arrays.sort(puntuacion1Heroes);
        for (int i = 0; i < puntuacion1Heroes.length; i++) {

        }
        System.out.println("El array de puntuación del héroe tras el selection sort:");
        System.out.println(Arrays.toString(puntuacion1Heroes));

        /**
         * Segunda comparación, mediante el bubble sort, que consiste en comparar los números en parejas, entonces el programa va a recorrer el array por parejas e irá modificando, paso a paso, la secuencia de números hasta tenerlos organizados
         * En primer lugar escogerá 50 y 80 y establecerá el número menor en primer lugar y el mayor en el segundo
         * En segundo lugar, escogerá el 80 y luego el 30 y le dará prioridad al número menor, en este caso 30.
         * En tercer paso comprobará 50 y 30 (que se ha adelantado por el paso anterior) y colocará primero el número menor.
         * Y, así, sucesivamente hasta conseguir el orden ascendente de los números
         */

        int[] puntuacion2Heroes = {50, 80, 30, 90, 60, 20, 10, 70, 40, 100};

        for (int i = 0; i < puntuacion2Heroes.length - 1; i++) {
            for (int j = 0; j < puntuacion2Heroes.length - 1 - i; j++) {
                if (puntuacion2Heroes[j] > puntuacion2Heroes[j + 1]) {
                    int orden = puntuacion2Heroes[j];
                    puntuacion2Heroes[j] = puntuacion2Heroes[j + 1];
                    puntuacion2Heroes[j + 1] = orden;
                }
            }
        }
        System.out.println("La puntuación del héroe en esta segunda tanda tras el buble short es: ");
        System.out.println(Arrays.toString(puntuacion2Heroes));



    }
}
