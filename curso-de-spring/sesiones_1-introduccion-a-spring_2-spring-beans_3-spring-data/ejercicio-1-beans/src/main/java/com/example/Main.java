package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 1
            Crear proyecto maven con la dependencia spring-context y crear una clase Saludo con un método imprimirSaludo que imprima un texto por consola.
            Crear el archivo beans.xml con un bean para la clase Saludo.
            Obtener el bean desde el método main y ejecutar el método imprimirSaludo.
         */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) applicationContext.getBean("saludo");

        Saludo saludo1 = (Saludo) applicationContext.getBean("saludo");

        saludo.imprimirSaludo();
        saludo1.imprimirSaludo();
    }
}
