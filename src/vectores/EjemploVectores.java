package vectores;

import java.util.Scanner;

public class EjemploVectores {
    public static void main(String[] args) {
        int numeros [] = new int[8];
        Scanner teclado = new Scanner(System.in);
        //ingreso basico
        /*numeros [0] = 15;
        numeros [1] = 20;
        numeros [2] = 25;
        numeros [3] = 30;
        numeros [4] = 35;
        numeros [5] = 40;
        numeros [6] = 45;
        numeros [7] = 50;*/

        //Recorrido + carga de datos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el valor del indice: " + i);
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los valores ingresados fueron: ");

        //Recorrido y muestra de datos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice: " + i + " valor: "+ numeros[i]);

        }

    }
}
