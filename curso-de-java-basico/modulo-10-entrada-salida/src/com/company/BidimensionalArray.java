package com.company;

public class BidimensionalArray {
    public static void main(String[] args) {
        // 3 - Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        System.out.println("Ejercicio 3");
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        print(nums);
    }

    public static void print(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Posición i: " + i);
                System.out.println("Posición j: " + j);
                System.out.println("Valor: " + nums[i][j]);
            }
        }
    }
}
