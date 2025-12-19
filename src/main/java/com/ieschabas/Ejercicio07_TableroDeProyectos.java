package com.ieschabas;
/**
 * Clase TableroDeProyectos en la cual vamos a establecer una matriz con valores vacíos y le vamos a rellenar la primera fila y la tercera columna con el dato 10.0
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Arrays;

public class Ejercicio07_TableroDeProyectos {
    public static void main(String[] args) {
        /**
         * Creamos la matriz de 4x4 sin asignarle ningún valor
         */
        double [][]matrizRecursos = new double[4][4];
        /**
         * Recorremos la matriz de manera horizontal y establecemos el valor 10.0 a la primera fila
         */
        for (int i = 0; i < matrizRecursos.length; i++) {
            matrizRecursos[0][i] = 10.0;
        }
        /**
         * Recorremos la matriz de manera vertical y asignamos el valor 10.0 a la tercera columna
         */
        for (int j = 0; j < matrizRecursos[0].length; j++) {
            matrizRecursos[j][2] = 10.0;
        }
        /**
         * Recorremos todos los datos de la matriz para poder imprimirla en pantalla
         */

        for (int i = 0; i < matrizRecursos.length; i++) {
            for (int j = 0; j < matrizRecursos[i].length; j++) {

                /**
                 * Mostramos en pantalla el resultado de nuestro maravilloso trabajo
                 */
                System.out.print(matrizRecursos[i][j] + " ");
            }
            System.out.println();

        }
    }
}
