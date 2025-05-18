package condicionales.ejerciciopractico;
import java.util.Scanner;
public class EjercicioIaMerceria {
    private static final double COSTO_ENVIO = 10.00;
    private static final double LIMITE_PROMOCION = 100.00;
    private static final double DESCUENTO_BAJO = 0.05;
    private static final double DESCUENTO_ALTO = 0.10;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paquetes a comprar: ");
        int cantidadPaquetes = teclado.nextInt();

        if (cantidadPaquetes < 0) {
            System.out.println("Error: No se permiten compras negativas.");
        } else if (cantidadPaquetes < 5) {
            System.out.println("No se permiten compras inferiores a 5 paquetes.");
        } else {
            System.out.print("Ingrese el monto total de la compra: ");
            double montoTotal = teclado.nextDouble();

            // Cálculo del costo de envío
            if (cantidadPaquetes <= 15) {
                System.out.printf("El costo de envío es de $%.2f USD.%n", COSTO_ENVIO);
                montoTotal += COSTO_ENVIO;
            } else {
                System.out.println("El costo de envío es gratuito. Gracias por su preferencia.");
            }

            // Evaluación de promociones
            if (montoTotal < LIMITE_PROMOCION) {
                double diferencia = LIMITE_PROMOCION - montoTotal;
                System.out.printf("El monto total es inferior a $%.2f USD. No accede a promociones.%n", LIMITE_PROMOCION);
                System.out.printf("Necesita comprar $%.2f USD adicionales para acceder a las promociones.%n", diferencia);
            } else {
                aplicarDescuento(montoTotal);
            }
        }

        teclado.close();
    }

    /**
     * Aplica descuentos según el rango del monto total.
     *
     * @param montoTotal monto total (incluyendo el envío)
     */
    private static void aplicarDescuento(double montoTotal) {
        double descuento;
        double totalConDescuento;

        if (montoTotal <= 300) {
            descuento = montoTotal * DESCUENTO_BAJO;
            totalConDescuento = montoTotal - descuento;
            System.out.printf("Por su compra tiene un descuento del 5%%: $%.2f USD.%n", descuento);
        } else {
            descuento = montoTotal * DESCUENTO_ALTO;
            totalConDescuento = montoTotal - descuento;
            System.out.printf("Por su compra tiene un descuento del 10%%: $%.2f USD.%n", descuento);
        }

        System.out.printf("El monto total con descuento es: $%.2f USD.%n", totalConDescuento);
    }
}
