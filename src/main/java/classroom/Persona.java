package classroom;

public class Persona {

    long cedula = 0;
    static int totalCedulas;
    String nombre;
    static int totalPersonas;
    
    static {    /* Inicializador */
        totalPersonas = 0;
    }

    Persona() {
        //this.nombre = "";
        this("");
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        this.cedula = totalCedulas;
        totalCedulas++;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
