package com.ieschabas;

/**
 * Clase MejorRendimiento en la cual vamos a establecer una matriz la cual cada fila corresponde a un alumno y cada columna corresponde a la calificación en cada asignatura
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Ejercicio09_MejorRendimiento {
    /**
     * Establecemos la matriz con la cantidad de alumnos y las notas, como queremos obtener la nota del alumno 2, crearemos 3 alumnos para que el índice corresponda con el 2.
     */

    public static void main(String[] args) {
            int[][] calificacionesTrimestrales = {
                    {2,3,4,6,8},
                    {4,7,9,5,2},
                    {7,8,6,3,8},
            };
        /**
         * Establecemos notaMaxima para que nos guarde la nota máxima del alumno 2
         */

        int notaMaxima = calificacionesTrimestrales[2][0];

        /**
         * Recorremos las notas que tiene el alumno 2 y le indicamos al programa que guarde la nota máxima en "notaMaxima"
         */

        for (int i = 0; i < calificacionesTrimestrales[2].length; i++) {
            if (calificacionesTrimestrales[2][i] > notaMaxima) {
             notaMaxima = calificacionesTrimestrales[2][i];
            }
        }
        System.out.println("La nota máxima del alumno 2 es: " + notaMaxima);
    }
}
