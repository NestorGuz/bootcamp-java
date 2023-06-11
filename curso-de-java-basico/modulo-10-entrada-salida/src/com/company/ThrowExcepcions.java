package com.company;

public class ThrowExcepcions {
    public static void main(String[] args) {
    /*
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante
        del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
        try {
            System.out.println( divide(1,0) );
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo código");
        }
    }

    public static int divide(int num1, int num2) throws ArithmeticException{
        return num1/num2;
    }
}
