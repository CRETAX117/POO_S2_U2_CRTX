/**
 * Clase utilitaria para leer y escribir datos de películas en archivos CSV.
 * Esta clase sigue el principio de responsabilidad única (SRP) al encargarse
 * únicamente de la persistencia de datos de Pelicula.
 */
package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import uni1a.Pelicula;

public class GestorArchivos {

    /**
     * Lee todas las películas de un archivo CSV y las devuelve como una lista.
     * Cada línea del archivo debe respetar el formato definido en
     * {@link Pelicula#toCSV()}.
     * @param ruta ruta del archivo CSV
     * @return lista de películas leídas
     */
    public static List<Pelicula> leerPeliculas(String ruta) {
        List<Pelicula> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.isBlank()) continue;
                peliculas.add(Pelicula.fromCSV(linea));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return peliculas;
    }

    /**
     * Guarda una lista de películas en un archivo CSV. Cada película se
     * convierte usando {@link Pelicula#toCSV()} y se escribe en una línea
     * independiente.
     * @param peliculas lista de películas a guardar
     * @param ruta ruta del archivo a escribir
     */
    public static void guardarPeliculas(List<Pelicula> peliculas, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Pelicula p : peliculas) {
                bw.write(p.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}