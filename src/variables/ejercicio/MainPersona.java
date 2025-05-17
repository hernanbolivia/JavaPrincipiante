package variables.ejercicio;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona = new Persona(25, "Hernan");
        Persona perssona1 = new Persona(25, "Hernan", "Perez");
        Persona persona2 = new Persona();

        persona.mostrarDetalles();
        perssona1.mostrarDetalles();
        persona2.mostrarDetalles();


    }
}
