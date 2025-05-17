package operadores;


public class Operadores {

    private int numero1;
    private int numero2;


    public Operadores() {
    }

    public Operadores(int numero1) {
        this( numero1, 0);
    }

    public Operadores(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Metodos

    public int sumar(){
        return numero1 + numero2;
    }

    public int restar(){
        return numero1 - numero2;
    }

    public int multiplicar(){
        return numero1 * numero2;
    }

    public double dividir(){
        if(numero2 == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return (double)numero1 / numero2;
    }
}
