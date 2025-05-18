package condicionales.ejerciciopractico;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {

        // Si cantidad es menos a 5 : No se permite compras inferiores a 5 productos
        // Si cantidad >= 5 && <= 15: El costo de envio es de $10.00 usd
        // Si cantidad > 15 = El costo de envío es gratuito.

        int cantidadPaquetes;
        double montoTotal , diferencia, descuento, totalDescuento;


        System.out.println("Ingrese la cantidad de paquetes a comprar");
        Scanner teclado = new Scanner(System.in);
        cantidadPaquetes = teclado.nextInt();


        //Evaluar casos de compras en paquete

        if(cantidadPaquetes < 5) {
            if (cantidadPaquetes < 0) {
                System.out.println("No se permiten compras negativas");
            } else {
                System.out.println("No se permite compras inferiores a 5 paquetes");
            }
        }else{
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if(cantidadPaquetes <= 15) {
                System.out.println("El costo de envio es de $10.00 usd");
                montoTotal += 10;
            }else{
                System.out.println("El costo de envío es gratuito. Gracias por su preferencia.");
            }
            if (montoTotal < 100){
                diferencia = 100 - montoTotal;
                System.out.println(
                        "El monto total es inferior a $100;  no accede a promociones" +
                                " Necesita comprar: " + diferencia + " usd para acceder a las promociones");
            }else{
                if(montoTotal >=100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalDescuento = montoTotal - descuento;
                    System.out.println(
                            "Por su compra tiene un descuento del 5%. " +
                                    " El descuento es: " + descuento +
                                    " usd. El monto total con descuento es: " + totalDescuento + " usd");
                }else{
                    descuento = montoTotal * 0.10;
                    totalDescuento = montoTotal - descuento;
                    System.out.println(
                            "Por su compra tiene un descuento del 10%. " +
                                    "El descuento es: " + descuento +
                                    " El monto total con descuento es: " + totalDescuento + " usd");

                }
            }
        }

    }
}

