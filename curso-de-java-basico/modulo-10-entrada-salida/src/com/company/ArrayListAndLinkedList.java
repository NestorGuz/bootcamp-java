package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        /*  6 - Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
            Recorre ambos mostrando únicamente el valor de cada elemento.
        */

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Durazno");
        frutas.add("Melon");
        frutas.add("Sandía");

        print(frutas);

        /*
            7 - Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
            A continuación, con otro bucle, recórrelo y elimina los numeros pares.
            Por último, vuelve a recorrerlo y muestra el ArrayList final.
            Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        */

        printOddNumbers(10);

    }
    public static void print(ArrayList<String> elements){
        //LinkedList<String> elementsAsLink = new LinkedList<>(elements);
        LinkedList<String> elementsAsLink = new LinkedList<>();

        for (int i = 0; i < elements.size(); i++) {
            elementsAsLink.add(elements.get(i));
        }

        System.out.println("Elementos ArrayList:");
        for (String fruta : elements){
            System.out.println(fruta);
        }

        System.out.println("Elementos LinkedList:");
        for (String fruta : elementsAsLink){
            System.out.println(fruta);
        }
    }

    public static void printOddNumbers(int stopNumber){
        if(stopNumber <= 0){
            System.out.println("El número de parada no puede ser menor o igual a 0");
            return;
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number = 1; number <= stopNumber; number++){
            boolean isPair = number % 2 == 0;
            if (!isPair){
                oddNumbers.add(number);
            }
        }

        System.out.println("Los números impares son:" + oddNumbers);
    }
}
