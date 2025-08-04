/**
 * Universidad Politecnica Salesiana
 * Brandon Cárdenas
 * Unidad 2
 * Clase Youtube
 *
 * 
 */

package modified;

import java.util.ArrayList;
import java.util.List;
import uni1a.ContenidoAudiovisual;

public class YouTubeVideo extends ContenidoAudiovisual {

    private String canal;
    private long   visualizaciones;
    private long   likes;
    private final List<Actor> colaboradores = new ArrayList<>();

    public YouTubeVideo(String titulo, int duracionMin, String genero,
                        String canal, long visualizaciones, long likes) throws util.DuracionInvalidaException {
        super(titulo, duracionMin, genero);
        this.canal           = canal;
        this.visualizaciones = visualizaciones;
        this.likes           = likes;
    }

    public void addColaborador(Actor actor)    { colaboradores.add(actor); }
    public void removeColaborador(Actor actor) { colaboradores.remove(actor); }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== YouTube Video ===");
        System.out.println("ID              : " + getId());
        System.out.println("Título          : " + getTitulo());
        System.out.println("Duración (min)  : " + getDuracionEnMinutos());
        System.out.println("Género          : " + getGenero());
        System.out.println("Canal           : " + canal);
        System.out.println("Visualizaciones : " + visualizaciones);
        System.out.println("Likes           : " + likes);
        if (!colaboradores.isEmpty()) {
            System.out.println("Colaboradores   :");
            colaboradores.forEach(a -> System.out.println(" - " + a.getNombre()));
        }
        System.out.println();
    }
}
