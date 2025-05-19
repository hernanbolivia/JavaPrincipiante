package estructurasrepetitivas;

import java.util.Scanner;

public class EjercicioWhile {
    public static void main(String[] args) {

        //Ejemplo de bucle controlado por contador
        /*int contador = 0;

        while (contador < 10) {
            System.out.println("Estoy en la vuelta n°: " + contador);
            contador++;
        }*/

        // Ejemplo de bucle controlado por centinela
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        while(bandera == true) {
            System.out.println("El valor de la bandera es: " + bandera);
            System.out.println("Estas actualmente suscrito? " + bandera);
            System.out.println("Quieres desuscribirte a TodoCode?");
            respuesta = teclado.next();

            if(respuesta.equals("si")){
                bandera = false;
            }
        }
    }
}
