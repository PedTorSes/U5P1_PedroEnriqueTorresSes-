package com.ieschabas;

import java.util.Arrays;

/**
 * Clase NivelesSecretos en la cual vamos a establecer uno array con diferentes niveles y debemos buscar un nivel en concreto
 * @author Pedro Torres Sesé
 * @version 1.0
 */
public class NivelSecreto {
    public static void main(String[] args) {
        /**
         * Establecemos un array desordenado con los niveles que tenemos disponibles
         */
        int[] codigosNivel = {1, 4, 105, 32, 49, 30, 99, 100, 83, 72};
        /**
         * Establecemos el valor que queremos encontrar dentro del array
         */
        int nivelBuscado = 99;
        /**
         * Mostramos el listado del array para que veas que no hay trampa ni cartón
         */
        System.out.println("El listado de niveles inicial: " + Arrays.toString(codigosNivel));
        /**
         * ¿Dónde está el 99? ¿Dónde está el 99? Hagan sus apuestas
         * Organizamos de menor a mayor los datos del array. ¿En qué vasito estará?
         */
        Arrays.sort(codigosNivel);
        /**
         * Establecemos la variable índice en la cual comparamos los campos de códigos nivel y el nivel buscado para designarle valor a indice
         */
        int indice = Arrays.binarySearch(codigosNivel, nivelBuscado);
        /**
         * Mostramos por pantalla el valor buscado y el índice en el que se encuentra
         */
        System.out.println("El índice en el que se encuentra el " + nivelBuscado + ": " + indice);


    }
}
