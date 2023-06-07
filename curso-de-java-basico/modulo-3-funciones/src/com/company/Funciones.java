/* Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido. */
package com.company;

public class Funciones {
    public static void main(String[] args) {
        System.out.println(obtenerPrecioConIva(8.10));
    }

    public static double obtenerPrecioConIva(double precioSinIva){
        double iva = (precioSinIva * 16) / 100;
        return precioSinIva + iva;
    }
}
