package condicionales;

import java.util.Scanner;

public class CondicionalIfElse {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        if(edad > 18){
            System.out.println("Es mayor de 18 años");
            if(edad > 40){
                System.out.println("Eres generación X");
            }else{
                System.out.println("Eres milenial o centenial");
            }
        } else {
            if(edad == 18){
                System.out.println("Tu edad es 18 años");
            } else {
                System.out.println("No puedes ingresar, eres menor de 18 años");
            }

        }
        System.out.println("Llegaste al final");

    }
}
