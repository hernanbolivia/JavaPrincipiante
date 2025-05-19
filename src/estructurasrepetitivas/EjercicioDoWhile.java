package estructurasrepetitivas;

public class EjercicioDoWhile {

    public static void main(String[] args) {
        int contador = 0;

        do{
            System.out.println("Estoy en la vuelta n°: " + contador );
            contador++;
        }while(contador < 10);
    }
}
