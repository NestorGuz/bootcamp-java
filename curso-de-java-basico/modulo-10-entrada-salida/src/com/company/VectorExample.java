package com.company;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // 4 - Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        System.out.println("Ejercicio 4");
        Vector<String> vector = new Vector<>();
        vector.add("Pepe");
        vector.add("Toño");
        vector.add("Margarita");
        vector.add("Santiago");
        vector.add("Israel");

        print(vector);
    }

    public static void print(Vector<String> vector){
        System.out.println("Valores del vector antes de eliminar: " + vector);
        vector.remove(1);
        System.out.println("Valores del vector despúes de eliminar el segundo elemento: " + vector);
        vector.remove(2);
        System.out.println("Valores del vector despúes de eliminar el tercer elemento: " + vector);
    }
}
