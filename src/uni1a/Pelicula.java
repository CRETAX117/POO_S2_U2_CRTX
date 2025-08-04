/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

import modified.Actor;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores; // Relación de asociación con Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) throws util.DuracionInvalidaException {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    // Métodos para gestionar actores
    public List<Actor> getActores() {
        return actores;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void eliminarActor(Actor actor) {
        actores.remove(actor);
    }

    public void mostrarActores() {
        if (actores.isEmpty()) {
            System.out.println("No hay actores registrados para esta película.");
        } else {
            System.out.println("Actores de la película:");
            for (Actor actor : actores) {
                System.out.println("- " + actor.getNombreCompleto());
            }
        }
        System.out.println();
    }

    /**
     * Convierte la película en una línea CSV.
     * Formato: titulo,duracionEnMinutos,genero,estudio
     * @return representación CSV de la película
     */
    public String toCSV() {
        return String.format("%s,%d,%s,%s", getTitulo(), getDuracionEnMinutos(), getGenero(), estudio);
    }

    /**
     * Crea una instancia de Pelicula a partir de una línea CSV.
     * Se espera que la línea tenga el formato: titulo,duracionEnMinutos,genero,estudio
     * @param csvLine línea con valores separados por comas
     * @return nueva instancia de Pelicula
     */
    public static Pelicula fromCSV(String csvLine) {
        String[] datos = csvLine.split(",");
        String titulo  = datos[0];
        int duracion   = Integer.parseInt(datos[1].trim());
        String genero  = datos[2];
        String estudio = datos[3];
        return new Pelicula(titulo, duracion, genero, estudio);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        mostrarActores();
    }
}