package com.ieschabas;

/**
 * Clase PuntuacionesIrregular, en la cual vamos a establecer una matriz con arrays de diferentes tamaños y vamos a ver la diferencia de datos a la hora de mostrar por consola según el código que introduzcamos
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Ejercicio08_PuntuacionesIrregulaes {
    public static void main(String[] args) {
/**
 * Creamos la matriz de datos con los tres equipos y sus respectivas cantidades de jugadores
 */
        double[][] puntuacionesEquipo = {
                new double[4],
                new double[5],
                new double[2]
        };

        System.out.println("Este dato nos muestra el atributo 'puntuacionesEquipo.length': " + puntuacionesEquipo.length);

        System.out.println("Esto es lo que nos muestra 'puntuacionesEquipo[0].length: " + puntuacionesEquipo[0].length);
        System.out.println("Esto es lo que nos muestra 'puntuacionesEquipo[1].length: " + puntuacionesEquipo[1].length);
        System.out.println("Esto es lo que nos muestra 'puntuacionesEquipo[2].length: " + puntuacionesEquipo[2].length);
        /**
         * Como podemos observar, el primer comando "puntuacionesEquipo.length" nos muestra la cantidad de arrays que contiene la matriz, o lo que es lo mismo, la cantidad de filas.
         * Por contra, el comando "puntuacionesEquipo[i].length" nos enseña la cantidad de espacios reservados dentro del array
         */

    }
}
