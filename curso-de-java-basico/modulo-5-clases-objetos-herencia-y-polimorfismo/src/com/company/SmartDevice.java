/*
    En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    Crear constructor vacío y con todos los parámetros para cada clase.
    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
package com.company;

public class SmartDevice {
    String os;
    String marca;
    String modelo;

    public SmartDevice(){}

    public SmartDevice(String os, String marca, String modelo) {
        this.os = os;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "os='" + os + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
