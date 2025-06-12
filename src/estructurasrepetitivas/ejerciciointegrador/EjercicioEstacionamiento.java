package estructurasrepetitivas.ejerciciointegrador;



import java.util.Scanner;

public class EjercicioEstacionamiento {

    public static void main(String[] args) {
        /*
        Varios clientes:
        El programa debe solicitar por teclado dos datos:
        Placa del vehículo
        El tipo de estacionamiento
         */
        String placa ="";
        int tipoEstacionamiento, cantHoras, cont1=0, cont2=0,cont3=0;
        double total, totalDia=0;

        Scanner teclado = new Scanner(System.in);
        while(!placa.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese la placa de su vehículo");
            placa = teclado.nextLine();

            if (!placa.equalsIgnoreCase("fin")) {

            System.out.println("Ingrese el tipo de estacionamiento");
            System.out.println("1 - Por hora");
            System.out.println("2 - Media jornada (5 horas)");
            System.out.println("3 - Jornada completa (10 horas)");

            if(teclado.hasNextInt()) {
                tipoEstacionamiento = teclado.nextInt();
                teclado.nextLine();


                if (tipoEstacionamiento <= 0 || tipoEstacionamiento > 3) {
                    System.out.println("No ingresó un tipo de estacionamiento valido");
                } else {
                /*
                Los tipo de estacionamiento son:
                - Por hora (3usd)
                - Media jornada (15 usd + 5% descto)
                - Jornada completa (30 usd + 10% descuento)
                 */
                    if (tipoEstacionamiento == 1) {

                        System.out.println("Ingrese la cantidad de horas que desea estacionar ");
                        cantHoras = teclado.nextInt();
                        total = cantHoras * 3;

                        System.out.println("El total a pagar es: $" + total + " usd");

                        cont1++;
                        totalDia += total;

                    } else {
                        if (tipoEstacionamiento == 2) {
                            System.out.println("El servicio de media jornada es de 15 usd + 5% descuento");
                            total = 15 - (15 * 0.05);

                            System.out.println("El total a pagar es: $" + total + " usd");
                            cont2++;
                            totalDia += total;

                        } else {
                            System.out.println("El servicio de jornada completa es de 30 usd + 10% descuento");
                            total = 30 - (30 * 0.10);
                            System.out.println("El total a pagar es: $" + total + " usd");
                            cont3++;
                            totalDia += total;
                        }

                    }
                    System.out.println("---- Gracias por su compra----");
                }
            }else{

                System.out.println("Entrada inválida. Debe ingresar un número entero. Por favor, intente nuevamente.");
                teclado.nextLine();
            }



        }


        }
        System.out.println("-------------------");
        System.out.println("Totales monetario del día");
        System.out.println("Cantidad de servicio por hora: " + cont1);
        System.out.println("Cantidad de servicio de media jornada: " + cont2);
        System.out.println("Cantidad de servicio de jornada completa: " + cont3);
        System.out.println ("El monto total recaudado del día es de: $" + totalDia + " usd");

    }


}
