/*
    En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
    Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
    String[] nombres = {"", "", "", ""}
 */
package com.company;

public class Main {
    public static void main(String[] args) {
        String[] nombres =  {"Pedro", "Juan", "Lorenzo" , "Alonso", "Manuel"};

        String nombresConcatenados = "";

        for (int i = 0; i < nombres.length; i++){
            boolean esPenultimoElemento =  i == (nombres.length - 2);
            boolean esUltimoElemento = i == (nombres.length - 1);

            nombresConcatenados += nombres[i];

            if (!esPenultimoElemento && !esUltimoElemento) {
                nombresConcatenados += ", ";
            } else if (esPenultimoElemento) {
                nombresConcatenados += " y ";
            }

        }

        System.out.println(nombresConcatenados);
    }

}
