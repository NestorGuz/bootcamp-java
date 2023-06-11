package com.company;

import java.io.*;

public class InputAndOutput {
    /*
        9 - Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
        "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
        dado en el parámetro "fileIn" al fichero dado en "fileOut".
    */
    public static void main(String[] args) {
        copy("C:\\Users\\NestorGuz\\Desktop\\mytxt.txt", "C:\\Users\\NestorGuz\\Desktop\\mytxt2.txt");
    }

    public static void copy(String fileIn, String fileOut) {
        try {
            InputStream inputFile = new FileInputStream(fileIn);
            byte[] data =  inputFile.readAllBytes();

            PrintStream outputFile = new PrintStream(fileOut);
            outputFile.write(data);

            inputFile.close();
            outputFile.close();

            System.out.println("El archivo se ha copiado correctamente");

        } catch (IOException e) {
            System.out.println("¡¡ups, algo salió mal!! " + e.getMessage());
        }

    }
}
