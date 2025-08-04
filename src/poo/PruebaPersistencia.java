package poo;

import java.util.ArrayList;
import java.util.List;

import uni1a.Pelicula;
import util.GestorArchivos;
import util.DuracionInvalidaException;

/**
 * Clase de prueba para demostrar la funcionalidad de persistencia en CSV
 * de la clase {@link Pelicula} mediante la utilidad {@link GestorArchivos}.
 *
 * Esta clase crea una lista de películas, las guarda en un archivo CSV y
 * luego las lee de vuelta para mostrar sus detalles por consola. De este
 * modo se comprueba el correcto funcionamiento de las operaciones de
 * entrada y salida de archivos, siguiendo el principio de responsabilidad
 * única (SRP) donde la lógica de persistencia está encapsulada en
 * {@code GestorArchivos} y no en las clases de dominio.
 */
public class PruebaPersistencia {

    public static void main(String[] args) {
        // Crear algunas películas de prueba
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            peliculas.add(new Pelicula("Matrix", 136, "Ciencia ficción", "Warner Bros"));
            peliculas.add(new Pelicula("Toy Story", 81, "Animación", "Pixar"));
            peliculas.add(new Pelicula("El Señor de los Anillos", 178, "Fantasía", "New Line Cinema"));
        } catch (DuracionInvalidaException e) {
            // No debería ocurrir en este contexto ya que las duraciones son válidas
            System.err.println("Error al crear películas de prueba: " + e.getMessage());
            return;
        }

        // Guardar las películas a un archivo CSV
        String ruta = "peliculas.csv";
        GestorArchivos.guardarPeliculas(peliculas, ruta);
        System.out.println("Películas guardadas en " + ruta);

        // Leer las películas de vuelta desde el archivo
        List<Pelicula> leidas = GestorArchivos.leerPeliculas(ruta);
        System.out.println("Películas leídas desde el archivo:");
        leidas.forEach(p -> {
            System.out.println("- " + p.getTitulo() + " (" + p.getDuracionEnMinutos() + " min, "
                               + p.getGenero() + ", " + p.getEstudio() + ")");
        });
    }
}