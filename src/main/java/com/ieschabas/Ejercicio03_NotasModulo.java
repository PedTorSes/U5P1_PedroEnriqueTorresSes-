package com.ieschabas;

import java.util.Arrays;

/**
 * Clase NotasModulo en la cual vamos a establecer un método que reciba un array de las notas y nos devuelva la media de las notas
 * @author Pedro Torres Sesé
 * @version 1.0
 */
public class Ejercicio03_NotasModulo {
    /**
     * Array con las notas de los alumnos
     * @param args
     */
    public static void main(String[] args) {
        double[] notas = {5, 10, 4, 3, 9, 7};
        /**
         * Mostramos por pantalla las notas de los alumnos
         */
        System.out.println("Las notas son: " + Arrays.toString(notas));
        calcularMedia(notas);
    }

    /**
     * Método para calcular la nota media de la clase
     * @param notas
     */

    static void calcularMedia(double[] notas) {
        /**
         * Establecemos las variables para calcular la nota total y luego la media
         */
        double notaTotal = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            /**
             * Recorremos el array para realizar la suma de la nota total y luego dividirla entre el tamaño del array
             */
            notaTotal = notaTotal + notas[i];
            media = notaTotal / notas.length;
        }
        /**
         * Mostramos por pantalla los resultados de la nota media
         */
        System.out.println("La nota media es: " + media);
    }
}



