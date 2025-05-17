package condicionales;

import java.util.Scanner;

/*
Sistema para informar el horario a los alumnos, días y hora, según
la edad del alumno
 */
public class EjercicioSchool {

   public static void main(String[] args) {

       int edad;
       Scanner teclado = new Scanner(System.in);


       System.out.println("***Welcome To School***");
       System.out.println("Ingrese la edad del alumno:");
       edad = teclado.nextInt();

       if(edad >=4 && edad <=6){
           System.out.println("El horario del grupo Kinder: Lunes y Miércoles de 16 a 17hs");
       }else{
           if(edad >=7 && edad <=8){
               System.out.println("El horario del grupo 1st year: Martes y Jueves de 16:30 a 17:30hs");
           }else{
               if(edad >=9 && edad <=10){
                   System.out.println("El horario del grupo 2nd year: Martes y Jueves de 17:30 a 19hs");
               }else{
                   if(edad >=11 && edad <=13 ){
                       System.out.println("El horario del grupo 3rd year: Lunes y Miércoles 17 a 18:30hs");
                   }else{
                       System.out.println("Ingresó una edad no permitida, por favor, comunicarse con el administrador");
                   }
               }
           }
       }
   }

}
