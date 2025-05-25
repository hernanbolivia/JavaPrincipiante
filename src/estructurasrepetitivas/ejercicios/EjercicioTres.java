package estructurasrepetitivas.ejercicios;
/*
Realizar un programa que muestre por pantalla los números del 200 al 250 de 2 en 2.
 */
public class EjercicioTres {
    public static void main(String[] args) {

        /*for(int contador = 200; contador <= 250; contador += 2){
            System.out.println("Numero de vuelta: " + contador);
        }*/

        int contador = 200;
        while(contador <= 250){
            System.out.println("Número: " + contador);
            contador += 2;
        }


    }
}
