/*Testeo automatico de clases
 * by Cretax
 * 
 * */

package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uni1a.Pelicula;
import modified.Actor;
import util.DuracionInvalidaException;

public class PeliculaTest {

    @Test
    void testAgregarActor() throws DuracionInvalidaException {
        Pelicula pelicula = new Pelicula("El Padrino", 175, "Drama", "Paramount Pictures");
        Actor actor1 = new Actor("Marlon", "Brando", 80, "Estadounidense", "Drama");
        pelicula.agregarActor(actor1);
        assertEquals(1, pelicula.getActores().size());
        assertTrue(pelicula.getActores().contains(actor1));
    }

    @Test
    void testEliminarActor() throws DuracionInvalidaException {
        Pelicula pelicula = new Pelicula("El Padrino", 175, "Drama", "Paramount Pictures");
        Actor actor1 = new Actor("Marlon", "Brando", 80, "Estadounidense", "Drama");
        pelicula.agregarActor(actor1);
        pelicula.eliminarActor(actor1);
        assertEquals(0, pelicula.getActores().size());
        assertFalse(pelicula.getActores().contains(actor1));
    }

    @Test
    void testGetEstudio() throws DuracionInvalidaException {
        Pelicula pelicula = new Pelicula("El Padrino", 175, "Drama", "Paramount Pictures");
        assertEquals("Paramount Pictures", pelicula.getEstudio());
    }

    @Test
    void testSetEstudio() throws DuracionInvalidaException {
        Pelicula pelicula = new Pelicula("El Padrino", 175, "Drama", "Paramount Pictures");
        pelicula.setEstudio("Warner Bros.");
        assertEquals("Warner Bros.", pelicula.getEstudio());
    }

    @Test
    void testFromCSV() throws DuracionInvalidaException {
        String csvLine = "Titanic,195,Romance,20th Century Fox";
        Pelicula pelicula = Pelicula.fromCSV(csvLine);
        assertEquals("Titanic", pelicula.getTitulo());
        assertEquals(195, pelicula.getDuracionEnMinutos());
        assertEquals("Romance", pelicula.getGenero());
        assertEquals("20th Century Fox", pelicula.getEstudio());
    }
}