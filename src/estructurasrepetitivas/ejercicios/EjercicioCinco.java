package estructurasrepetitivas.ejercicios;

import java.util.Scanner;

/*
Realizar un programa que muestre en pantalla palabras que sean
ingresadas por teclado, hasta que se ingrese "salir".
 */
public class EjercicioCinco {
    public static void main(String[] args) {
        String palabra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la palabra que desea mostrar por teclado");
        palabra = teclado.nextLine();

        while(!palabra.equals("salir")){
            System.out.println("La palabra es: "+palabra);

            System.out.println("Ingrese la palabra que desea mostrar por teclado");
            palabra = teclado.nextLine();
        }
        System.out.println("Gracias por usar el programa");



    }
}
