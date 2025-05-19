package estructurasrepetitivas.ejercicios;

import java.util.Scanner;

/*
Realizar un programa que dado por teclado un límite numérico(por ejemplo 100)
muestre en pantalla todos los números hasta ese limite (empezando por 1)
 */
public class EjercicioDos {
    public static void main(String[] args) {
        int limite;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el número limite de repeticionnes");
        limite = teclado.nextInt();

        //respuesta con while
       /*while(contador <= limite){
           System.out.println("repetición n°: " + contador);
           contador ++;
       }
       teclado.close();
       */

        //Respuesta con for

        for(int contador = 0; contador < limite; contador++){
            System.out.println("repetición n°: " + (contador+1));

        }


    }
}
