/*Testeo automatico de clases
 * by Cretax
 * 
 * */

package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import util.GestorArchivos;
import uni1a.Pelicula;
import util.DuracionInvalidaException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivosTest {

    private static final String TEST_FILE_PATH = "test_peliculas.csv";

    @BeforeEach
    void setUp() throws IOException {
        // Asegurarse de que el archivo de prueba no exista antes de cada test
        Files.deleteIfExists(Paths.get(TEST_FILE_PATH));
    }

    @AfterEach
    void tearDown() throws IOException {
        // Limpiar el archivo de prueba después de cada test
        Files.deleteIfExists(Paths.get(TEST_FILE_PATH));
    }

    @Test
    void testGuardarPeliculas() throws DuracionInvalidaException, IOException {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Pelicula 1", 120, "Accion", "Estudio A"));
        peliculas.add(new Pelicula("Pelicula 2", 90, "Comedia", "Estudio B"));

        GestorArchivos.guardarPeliculas(peliculas, TEST_FILE_PATH);

        assertTrue(Files.exists(Paths.get(TEST_FILE_PATH)));
        List<String> lines = Files.readAllLines(Paths.get(TEST_FILE_PATH));
        assertEquals(2, lines.size());
        assertEquals("Pelicula 1,120,Accion,Estudio A", lines.get(0));
        assertEquals("Pelicula 2,90,Comedia,Estudio B", lines.get(1));
    }

    @Test
    void testLeerPeliculas() throws DuracionInvalidaException, IOException {
        // Primero, guardar algunas películas para leerlas después
        List<Pelicula> peliculasOriginales = new ArrayList<>();
        peliculasOriginales.add(new Pelicula("Pelicula A", 100, "Drama", "Estudio X"));
        peliculasOriginales.add(new Pelicula("Pelicula B", 110, "Ciencia Ficcion", "Estudio Y"));
        GestorArchivos.guardarPeliculas(peliculasOriginales, TEST_FILE_PATH);

        List<Pelicula> peliculasLeidas = GestorArchivos.leerPeliculas(TEST_FILE_PATH);

        assertNotNull(peliculasLeidas);
        assertEquals(2, peliculasLeidas.size());
        assertEquals("Pelicula A", peliculasLeidas.get(0).getTitulo());
        assertEquals(100, peliculasLeidas.get(0).getDuracionEnMinutos());
        assertEquals("Drama", peliculasLeidas.get(0).getGenero());
        assertEquals("Estudio X", peliculasLeidas.get(0).getEstudio());

        assertEquals("Pelicula B", peliculasLeidas.get(1).getTitulo());
        assertEquals(110, peliculasLeidas.get(1).getDuracionEnMinutos());
        assertEquals("Ciencia Ficcion", peliculasLeidas.get(1).getGenero());
        assertEquals("Estudio Y", peliculasLeidas.get(1).getEstudio());
    }

    @Test
    void testLeerPeliculasArchivoVacio() throws IOException {
        // Crear un archivo vacío
        Files.createFile(Paths.get(TEST_FILE_PATH));
        List<Pelicula> peliculasLeidas = GestorArchivos.leerPeliculas(TEST_FILE_PATH);
        assertNotNull(peliculasLeidas);
        assertTrue(peliculasLeidas.isEmpty());
    }

    @Test
    void testLeerPeliculasArchivoNoExistente() {
        List<Pelicula> peliculasLeidas = GestorArchivos.leerPeliculas("non_existent_file.csv");
        assertNotNull(peliculasLeidas);
        assertTrue(peliculasLeidas.isEmpty());
    }

    @Test
    void testGuardarPeliculasListaVacia() throws IOException {
        List<Pelicula> peliculas = new ArrayList<>();
        GestorArchivos.guardarPeliculas(peliculas, TEST_FILE_PATH);

        assertTrue(Files.exists(Paths.get(TEST_FILE_PATH)));
        List<String> lines = Files.readAllLines(Paths.get(TEST_FILE_PATH));
        assertTrue(lines.isEmpty());
    }
}