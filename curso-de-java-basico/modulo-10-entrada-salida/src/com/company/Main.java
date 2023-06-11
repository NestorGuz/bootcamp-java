/*
1 - Dada la función: public static String reverse(String texto) { }
    Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

2 - Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

3 - Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

4 - Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

5 - Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

6 - Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

7 - Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

8 - Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

9 - Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

10 - Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int selectedOption;
        
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("**** Menú ****");
            System.out.println("1 - Texto al reves");
            System.out.println("2 - Array unidimensional");
            System.out.println("3 - Array bidimensional");
            System.out.println("4 - Vector");
            System.out.println("5 - Capacidad inicial de un vector");
            System.out.println("6 - ArrayList y LinkedList");
            System.out.println("7 - Números impares con ArrayList");
            System.out.println("8 - Manejo de errores");
            System.out.println("9 - Entrada/Salida");
            System.out.println("0 - Salir");

            selectedOption = requestPositiveIntegerNumber(scanner, "Introduzca una opción para mostrar", true);

            switch (selectedOption) {
                case 1 -> showOptionReverseString(scanner);
                case 2 -> showOptionUnidimensionalArray(scanner);
                case 3 -> showOptionBidimensionalArray(scanner);
                case 4 -> showOptionVector(scanner);
                case 5 -> showOptionVectorQuestion();
                case 6 -> showOptionArrayListToLinkedList(scanner);
                case 7 -> showOptionOddNumbers(scanner);
                case 8 -> showOptionThrowExepcions(scanner);
                case 9 -> showOptionIO(scanner);
                case 0 -> System.out.println("¡Adios!");
                default -> System.out.println("Opción no valida!!");
            }

        } while (selectedOption > 0);

        scanner.close();
    }

    private static void showOptionIO(Scanner scanner) {
        System.out.println("9 - Entrada/Salida");
        System.out.println("Copiar un archivo.");
        System.out.println("Ingrese la ubicación del archivo a copiar.");
        String from = scanner.nextLine();
        System.out.println("Ingrese la ubicación donde va a ser copiado el archivo + el nombre del archivo.");
        String to = scanner.nextLine();

        InputAndOutput.copy(from, to);
    }

    private static void showOptionThrowExepcions(Scanner scanner) {
        System.out.println("8 - Manejo de errores");
        System.out.println("Introduce dos números para dividirlos, " +
                "si el segundo número es cero se generará una excepción que ha sido controlada.");
        int num1 = requestPositiveIntegerNumber(scanner, "Introduzca el primer número:", true);
        int num2 = requestPositiveIntegerNumber(scanner, "Introduca el segundo número", true);

        System.out.println("Resultado de la división:");
        try {
            System.out.println(ThrowExcepcions.divide(num1, num2));
        } catch (ArithmeticException e){
            System.out.println("*** Esto no se puede hacer *** ");
        }
    }

    private static void showOptionOddNumbers(Scanner scanner) {
        System.out.println("7 - Números impares con ArrayList");
        int stopNumber = requestPositiveIntegerNumber(scanner, "¿Hasta qué número desea parar?", false);
        ArrayListAndLinkedList.printOddNumbers(stopNumber);
    }

    private static void showOptionArrayListToLinkedList(Scanner scanner) {
        System.out.println("6 - Elementos de un ArrayList a LinkedList");
        ArrayList<String> elements = new ArrayList<>();

        do {
            System.out.println("Escriba el contenido del ArrayList6 ["+elements.size()+"]");
            elements.add(scanner.nextLine());

        } while (elements.size() < 4);

        ArrayListAndLinkedList.print(elements);
    }

    private static void showOptionVectorQuestion() {
        System.out.println("5 - Indica cuál es el problema de utilizar un Vector " +
                "con la capacidad por defecto si tuviésemos 1000 elementos " +
                "para ser añadidos al mismo.");

        System.out.println("Respuesta -> Mucho desperdicio de memoria, " +
                "debido a que la capacidad por defecto es 10, el vector se " +
                "redimensionaría varias veces\n" +
                "hasta lograr almacenar los 1000 elementos.");
    }

    private static void showOptionVector(Scanner scanner) {
        System.out.println("3 - Operar con los elementos de un Vector");
        Vector<String> elements = new Vector<>();

        do {
            System.out.println("Escriba el contenido del vector ["+elements.size()+"]");
            elements.add(scanner.nextLine());

        } while (elements.size() < 5);

        VectorExample.print(elements);
    }

    private static void showOptionBidimensionalArray(Scanner scanner) {
        System.out.println("3 - Mostrar los elementos de un array bidimensional");
        int numRows = requestPositiveIntegerNumber(scanner, "¿Cuántos filas?", false);
        int numCols = requestPositiveIntegerNumber(scanner, "¿Cuántos columnas?", false);

        int[][] elements = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                elements[i][j] = requestPositiveIntegerNumber(scanner,
                        "Introduzca un número para la fila " + (i+1) + ", columna " + (j+1),
                        true);
            }
        }

        System.out.println("Estos son los elementos del array bidimensional:");
        BidimensionalArray.print(elements);

    }

    private static void showOptionUnidimensionalArray(Scanner scanner){
        System.out.println("2 - Mostrar los elementos de un array unidimensional");

        int cantidadElementos = requestPositiveIntegerNumber(scanner, "¿Cuántos elementos requiere?", false);

        String[] elementos = new String[cantidadElementos];

        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Introduzca el elemento " + (i + 1));
            elementos[i] = scanner.nextLine();
        }

        System.out.println("Estos son los elementos del array unidimensional:");
        UnidimensionalArray.printArray(elementos);

    }

    private static void showOptionReverseString(Scanner scanner) {
        System.out.println("1 - Texto al reves");
        System.out.println("Introduce el texto para mostrarlo en forma inversa");
        String text = scanner.nextLine();
        System.out.println("Respuesta:");
        System.out.println(ReverseString.reverse(text));
    }

    private static int requestPositiveIntegerNumber(Scanner scanner, String message, boolean withZero){
        int number = -1;

        do {
            try {
                System.out.println(message);
                number = Integer.parseInt(scanner.nextLine());

                if (number < 0 && withZero){
                    System.out.println("La entrada debe ser mayor o igual a cero.");
                } else if (number <= 0 && !withZero) {
                    System.out.println("La entrada debe ser mayor a cero");
                }

            } catch (Exception e){
                System.out.println("La entrada debe ser numérica y positiva.");
            }

        } while(number < 0 || (number == 0 && !withZero));
        
        return number;
    }

}

