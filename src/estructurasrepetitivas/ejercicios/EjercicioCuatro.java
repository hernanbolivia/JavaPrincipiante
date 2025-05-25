package estructurasrepetitivas.ejercicios;
/*
Programa que lleve la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1
 */
public class EjercicioCuatro {
    public static void main(String[] args) {

        System.out.println("¿listos para el año nuevo? La cuenta regresiva inicia...");
        for(int contador = 10; contador >= 0; contador=contador-1){
            System.out.println("La cuenta regresiva es: " + contador);

        }
        System.out.println("Feliz año nuevo 2026");
    }
}
