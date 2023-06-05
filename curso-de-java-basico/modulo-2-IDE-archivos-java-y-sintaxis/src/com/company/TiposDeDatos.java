/*
Para este primer ejercicio tendréis que realizar lo siguiente:
 * Crea un proyecto de Java desde 0
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
package com.company;

public class TiposDeDatos {
    public static void main(String[] args) {
        //1 - Numéricos
        //1.1 Enteros
        byte num1 = 110;
        short num2 = 200;
        int num3 = 1100;
        long num4 = 101155115;
        //1.2 Decimales
        float num5 = 124.50f;
        double num6 = 2155.224d;

        //2 - Booleanos
        boolean bool1 = true;
        boolean bool2 = false;

        //3 - Texto
        char text1 = 'H';
        String text2 = "Hola mundo";

        System.out.println("Datos numéricos");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        System.out.println("Datos booleanos");
        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println("Datos tipo texto");
        System.out.println(text1);
        System.out.println(text2);
    }
}
