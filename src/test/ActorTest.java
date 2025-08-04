/*Testeo automatico de clases
 * by Cretax
 * 
 * */

package test;

import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Documental;
import modified.YouTubeVideo;
import modified.TikTokVideo;
import util.DuracionInvalidaException;

/**
 * Pruebas para verificar que la excepción DuracionInvalidaException se lanza
 * correctamente cuando se intenta crear contenidos con duración no positiva.
 */
public class ActorTest {
    public static void main(String[] args) {
        pruebaPeliculaInvalida();
        pruebaSerieInvalida();
        pruebaDocumentalInvalida();
        pruebaYouTubeVideoInvalido();
        pruebaTikTokVideoInvalido();
        System.out.println("Todas las pruebas de DuracionInvalidaException pasaron.");
    }

    private static void pruebaPeliculaInvalida() {
        boolean lanzada = false;
        try {
            new Pelicula("Test", 0, "Drama", "Studio");
        } catch (DuracionInvalidaException e) {
            lanzada = true;
        }
        assert lanzada;
    }

    private static void pruebaSerieInvalida() {
        boolean lanzada = false;
        try {
            new SerieDeTV("Serie", -5, "Género", 1);
        } catch (DuracionInvalidaException e) {
            lanzada = true;
        }
        assert lanzada;
    }

    private static void pruebaDocumentalInvalida() {
        boolean lanzada = false;
        try {
            new Documental("Doc", 0, "Género", "Tema");
        } catch (DuracionInvalidaException e) {
            lanzada = true;
        }
        assert lanzada;
    }

    private static void pruebaYouTubeVideoInvalido() {
        boolean lanzada = false;
        try {
            new YouTubeVideo("YT", 0, "Género", "Canal", 100, 10);
        } catch (DuracionInvalidaException e) {
            lanzada = true;
        }
        assert lanzada;
    }

    private static void pruebaTikTokVideoInvalido() {
        boolean lanzada = false;
        try {
            new TikTokVideo("TT", 0, "Género", "user", 100, 10, 5, null);
        } catch (DuracionInvalidaException e) {
            lanzada = true;
        }
        assert lanzada;
    }
}