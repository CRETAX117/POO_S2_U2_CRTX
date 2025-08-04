/*
 * Manejo de controladores
 * by cretax
 * */

package mvc;

import java.util.List;
import uni1a.ContenidoAudiovisual;

/**
 * Vista de consola simple que muestra detalles de contenidos audiovisuales.
 */
public class VistaConsola {

    /**
     * Muestra el catálogo completo de contenidos.
     * @param catalogo lista de contenidos a mostrar
     */
    public void mostrarCatalogo(List<ContenidoAudiovisual> catalogo) {
        System.out.println("\n===== CATÁLOGO DESDE MVC =====\n");
        if (catalogo == null || catalogo.isEmpty()) {
            System.out.println("(Vacío)\n");
            return;
        }
        for (ContenidoAudiovisual c : catalogo) {
            c.mostrarDetalles();
        }
    }
}