/**
 * Universidad Politecnica Salesiana
 * Brandon Cárdenas
 * Unidad 2
 * Clase Tiktok
 *
 * 
 */

package modified;

import uni1a.ContenidoAudiovisual;

public class TikTokVideo extends ContenidoAudiovisual {

    private String usuario;      // @username
    private long   visualizaciones;
    private long   likes;
    private long   shares;
    private Actor  protagonista; // opcional

    public TikTokVideo(String titulo, int duracionSeg, String genero,
                       String usuario, long visualizaciones,
                       long likes, long shares, Actor protagonista) {
        // Se almacena en minutos aproximados
        super(titulo, (int) Math.ceil(duracionSeg / 60.0), genero);
        this.usuario         = usuario;
        this.visualizaciones = visualizaciones;
        this.likes           = likes;
        this.shares          = shares;
        this.protagonista    = protagonista;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== TikTok Video ===");
        System.out.println("ID              : " + getId());
        System.out.println("Título          : " + getTitulo());
        System.out.println("Duración (min)  : " + getDuracionEnMinutos());
        System.out.println("Género          : " + getGenero());
        System.out.println("Usuario         : @" + usuario);
        System.out.println("Visualizaciones : " + visualizaciones);
        System.out.println("Likes           : " + likes);
        System.out.println("Shares          : " + shares);
        if (protagonista != null) {
            System.out.println("Protagonista    : " + protagonista.getNombre());
        }
        System.out.println();
    }
}
