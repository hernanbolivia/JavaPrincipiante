package operadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainOperadores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();

        Operadores op = new Operadores(numero1, numero2);

        System.out.println("\nResultados:");
        System.out.println("Suma:" + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicación: " + op.multiplicar());
        try {
            System.out.println("División: " + op.dividir());
        }catch (ArithmeticException e){
            System.out.println("Error en la división: " + e.getMessage());
        }
        teclado.close();

    }
}
