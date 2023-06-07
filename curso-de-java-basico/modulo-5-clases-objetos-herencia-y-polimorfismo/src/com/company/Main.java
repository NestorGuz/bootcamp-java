/*
    En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    Crear constructor vacío y con todos los parámetros para cada clase.
    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
package com.company;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch("Wear OS", "Huawei", "GT 3 Pro", "Piel", "Circular");
        SmarthPhone smarthPhone = new SmarthPhone("Android 13", "Samsung", "Galaxy Note 22", 5, "Telcel");

        System.out.println(smartWatch);
        System.out.println(smarthPhone);
    }
}
