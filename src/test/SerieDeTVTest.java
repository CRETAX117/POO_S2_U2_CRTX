/*Testeo automatico de clases
 * by Cretax
 * 
 * */

package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uni1a.SerieDeTV;
import modified.Temporada;
import util.DuracionInvalidaException;

public class SerieDeTVTest {

    @Test
    void testAgregarTemporada() throws DuracionInvalidaException {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        Temporada temporada1 = new Temporada(1, 7, 45, "2008-01-20", "2008-03-09");
        serie.agregarTemporada(temporada1);
        assertEquals(1, serie.getListaTemporadas().size());
        assertTrue(serie.getListaTemporadas().contains(temporada1));
    }

    @Test
    void testEliminarTemporada() throws DuracionInvalidaException {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        Temporada temporada1 = new Temporada(1, 7, 45, "2008-01-20", "2008-03-09");
        serie.agregarTemporada(temporada1);
        serie.eliminarTemporada(temporada1);
        assertEquals(0, serie.getListaTemporadas().size());
        assertFalse(serie.getListaTemporadas().contains(temporada1));
    }

    @Test
    void testBuscarTemporada() throws DuracionInvalidaException {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        Temporada temporada1 = new Temporada(1, 7, 45, "2008-01-20", "2008-03-09");
        Temporada temporada2 = new Temporada(2, 13, 45, "2009-03-08", "2009-05-31");
        serie.agregarTemporada(temporada1);
        serie.agregarTemporada(temporada2);
        
        Temporada encontrada = serie.buscarTemporada(2);
        assertNotNull(encontrada);
        assertEquals(2, encontrada.getNumeroTemporada());
        assertEquals(13, encontrada.getNumeroEpisodios());
    }

    @Test
    void testBuscarTemporadaNoExistente() throws DuracionInvalidaException {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        Temporada temporada1 = new Temporada(1, 7, 45, "2008-01-20", "2008-03-09");
        serie.agregarTemporada(temporada1);
        
        Temporada encontrada = serie.buscarTemporada(5);
        assertNull(encontrada);
    }

    @Test
    void testGetTemporadas() throws DuracionInvalidaException {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
        assertEquals(5, serie.getTemporadas());
    }
}
