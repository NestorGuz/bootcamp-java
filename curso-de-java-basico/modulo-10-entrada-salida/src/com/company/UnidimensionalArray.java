/*
    2 - Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */
package com.company;

public class UnidimensionalArray {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");
        String[] nombres = {"Juan", "Pedro", "Camilo", "Eduardo"};

        printArray(nombres);
    }

    public static void printArray(String[] items){
        for (String item : items){
            System.out.println(item);
        }
    }
}
