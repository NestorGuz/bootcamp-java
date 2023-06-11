package com.company;

public class ReverseString {

    public static void main(String[] args) {
        /*
            1 - Dada la función: public static String reverse(String texto) { }
            Escribe el código que devuelva una cadena al revés.
            Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

        */
        System.out.println(reverse("Hola mundo"));
    }

    public static String reverse(String text) {
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }

        return reverseText;
    }
}
