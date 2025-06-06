package variables.ejercicio;

public class Persona {

    private int edad;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;

    public Persona() {
    }

    public Persona(int edad) {
        this(
                edad,
                "desconocido",
                "Desconocido",
                "Desconocida",
                "Desconocido",
                "Desconocido");
    }

    public Persona (int edad, String nombre){
        this(
                edad,
                nombre,
                "desconocido",
                "desconocida",
                "desconocido",
                "desconocido");
    }

    public Persona(int edad, String nombre, String apellido) {
        this(
                edad,
                nombre,
                apellido,
                "desconocida",
                "desconocido",
                "desconocido");
    }

    public Persona (int edad, String nombre,String apellido, String direccion){
        this (
                edad,
                nombre,
                apellido,
                direccion,
                "desconocido",
                "desconocido");
    }

    public Persona (int edad, String nombre, String apellido, String direccion, String telefono){
        this(
                edad,
                nombre,
                apellido,
                direccion,
                telefono,
                "desconocido");
    }


    public Persona(int edad, String nombre, String apellido, String direccion, String telefono, String correo) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrarDetalles(){
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
    }
}
