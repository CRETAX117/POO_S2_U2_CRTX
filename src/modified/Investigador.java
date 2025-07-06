/**
 * Universidad Politecnica Salesiana
 * Brandon Cárdenas
 * Unidad 2
 * Clase Investigador
 *
 * 
 */
package modified;

public class Investigador {
    private String nombre;
    private String apellido;
    private int experiencia;
    private String especialidad; 
    private String institucion; 
    private String titulo; 

    public Investigador(String nombre, String apellido, String especialidad, String institucion, int experiencia, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.institucion = institucion;
        this.experiencia = experiencia;
        this.titulo = titulo;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getexperiencia() {
        return experiencia;
    }

    public void setexperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getCredenciales() {
        return titulo + " " + getNombreCompleto();
    }

    //Funcion de mostrar detalles
    public void mostrarInformacion() {
        System.out.println("Información del Investigador:");
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Título académico: " + titulo);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Institución: " + institucion);
        System.out.println("Años de experiencia: " + experiencia);
        System.out.println();
    }
} 