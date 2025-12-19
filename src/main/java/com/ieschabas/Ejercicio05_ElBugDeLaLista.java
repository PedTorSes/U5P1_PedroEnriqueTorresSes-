package com.ieschabas;
/**
 * Clase ElBugDeLaLista en la cual vamos a eliminar, de una lista de labores, la que se encuentre en la segunda posición.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Arrays;

public class Ejercicio05_ElBugDeLaLista {
    public static void main(String[] args) {

        /**
         * Creamos el primer array con todas las labores a realizar
         */
        String[] tareasPendientes = {"Dormir", "Estudiar", "Beber", "Comer", "Jugar"};
        /**
         * Establecemos la posición del dato que queremos eliminar
         */
        int exclusion = 1;
        /**
         * Mostramos el array original para que se vea que no hay trampa ni cartón
         */

        System.out.println("Array original: " + Arrays.toString(tareasPendientes));
        /**
         * Creamos el array nuevo el cual tiene un espacio menos que el original
         */
        String[] tareasPendientesResultado = new String[tareasPendientes.length - 1];
        /**
         * Establecemos el valor de la posición que va a ocupar el nuevo elemento que introduzcamos en el array
         */
        int j = 0;
        /**
         * Recorremos el array orginal "tareasPendientes" y evitamos el índice que tiene el valor de "exclusión"
         */

        for (int i = 0; i < tareasPendientes.length; i++) {
            if (i != exclusion) {

                /**
                 * Establecemos los datos del array original en el nuevo array en la manera que aparecen
                 */
                tareasPendientesResultado[j] = tareasPendientes[i];
                j++;
            }
        }

        /**
         * Mostramos el array final para ver si se ha eliminado el valor que ocupa la segunda posición
         */
        System.out.println("Array resultante: " + Arrays.toString(tareasPendientesResultado));
    }
}
