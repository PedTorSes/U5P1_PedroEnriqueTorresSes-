package com.ieschabas;
/**
 * Clase Horarios en la cual vamos a establecer una matriz con 5 filas y 6 columnas y la vamos a mostrar por pantalla
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.Arrays;

public class Ejercicio06_Horarios {
    public static void main(String[] args) {
        /**
         * Establecemos la matriz con los datos pertinentes. Asignatura y cantidad de horas.
         */
        String[][] horarioDam = {
                {"Lunes", "Sistemas informáticos 2h", "Programación 1h", "Base de datos 2h", "Entornos 1h"},
                {"Martes", "Lenguaje de marcas", "FOL 2h", "Proyecto Intermodular 1h", "Programación 2h"},
                {"Miércoles", "Programación 2h", "Base de datos 1h", "Fol 1h", "Sistemas informáticos 2h" },
                {"Jueves", "Base de datos 2h", "Sistemas 1h", "Entornos de desarrollo 2h", "Programación 1h" },
                {"Viernes", "Programación 2h", "Lenguaje de marcas 1h", "Inglés 2h", "Nada"},
        };
        /**
         * Recorremos el array de manera horizontal para obtener los datos
         */
        for (int i = 0; i < horarioDam.length; i++) {

            /**
             * Recorremos el array de manera vertical para mostrar la matriz
             */
            for (int j = 0; j < horarioDam[i].length; j++) {

                /**
                 * Mostramos en pantalla los resultados
                 */
                System.out.print(horarioDam[i][j] + " ");
            }
            System.out.println();

        }
    }
}
