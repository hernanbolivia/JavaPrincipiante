package vectores;

import java.util.Scanner;

public class EjemploMatriz {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        Scanner teclado = new Scanner(System.in);

        //Recorrrido y carga
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Ingrese para la fila: " + i + "Columna: " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        //Recorrido y muestra
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Fila: " + i + " Columna: " + j + " Valor:  " + matriz[i][j]);
            }
        }



    }
}