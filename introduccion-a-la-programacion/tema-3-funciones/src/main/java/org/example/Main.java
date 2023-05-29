/*
    Primera parte:
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.

    Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.
 */
package org.example;

public class Main {
    public static void main(String[] args) {
        int resultado = sumar(10,20,30);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("Numero de puertas del coche: " + miCoche.puertas);
    }

    public static int sumar(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

class Coche {
    int puertas = 0;

    public void agregarPuerta(){
        this.puertas++;
    }

}