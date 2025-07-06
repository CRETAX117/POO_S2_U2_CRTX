/**
 * Universidad Politecnica Salesiana
 * Brandon Cárdenas
 * Unidad 2
 * Clase Actor
 * 
 */
package modified;

public class Actor {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private String rubro; // drama, comedia, acción, etc.

    public Actor(String nombre, String apellido, int edad, String nacionalidad, String rubro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.rubro = rubro;
    }

    // Getters y Setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getrubro() {
        return rubro;
    }

    public void setrubro(String rubro) {
        this.rubro = rubro;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInformacion() {
        System.out.println("Información del Actor:");
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("rubro: " + rubro);
        System.out.println();
    }
} 