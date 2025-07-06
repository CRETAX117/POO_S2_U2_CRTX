/**
 * Universidad Politecnica Salesiana
 * Brandon Cárdenas
 * Unidad 2
 * App de creacion y relaciones
 *
 * 
 */

package poo;

import java.util.*;

//Clases
import uni1a.*;    // Pelicula, SerieDeTV, Documental, Temporada, ContenidoAudiovisual
import modified.*; // Actor, Investigador, YouTubeVideo, TikTokVideo

public class GestorContenidoApp {

    //Catálogo general
    private static final List<ContenidoAudiovisual> catalogo = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    /* ---------- MAIN ---------- */
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1 -> menuPelicula();
                case 2 -> menuSerie();
                case 3 -> menuDocumental();
                case 4 -> menuVideos();
                case 5 -> listarCatalogo();
                case 0 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }


    //  MENÚS SECUNDARIOS ---

    //PELÍCULA
    private static void menuPelicula() {
        String titulo   = leerTexto("Título: ");
        int duracion    = leerEntero("Duración (min): ");
        String genero   = leerTexto("Género: ");
        String estudio  = leerTexto("Estudio: ");

        Pelicula peli = new Pelicula(titulo, duracion, genero, estudio);
        catalogo.add(peli);

        System.out.println(">> Película creada. Añada actores (vacío para terminar).");
        while (true) {
            String nombre = leerTexto("Nombre actor (ENTER para terminar): ");
            if (nombre.isBlank()) break;
            String apellido = leerTexto("Apellido: ");
            int edad        = leerEntero("Edad: ");
            String pais     = leerTexto("Nacionalidad: ");
            String rubro    = leerTexto("Especialidad/Rubro: ");

            Actor a = new Actor(nombre, apellido, edad, pais, rubro);
            peli.agregarActor(a);
            System.out.println("Actor añadido.");
        }
    }

    //SERIE
    private static void menuSerie() {
        String titulo = leerTexto("Título de la serie: ");
        int duracion  = leerEntero("Duración promedio episodio (min): ");
        String genero = leerTexto("Género: ");

        SerieDeTV serie = new SerieDeTV(titulo, duracion, genero, 0);
        catalogo.add(serie);

        System.out.println(">> Añada temporadas (0 para terminar).");
        while (true) {
            int numTemp = leerEntero("Número de temporada (0 para terminar): ");
            if (numTemp == 0) break;
            int episodios = leerEntero("Cantidad de episodios: ");
            int durEp     = leerEntero("Duración promedio: ");
            String fIni   = leerTexto("Fecha inicio (dd/mm/aaaa): ");
            String fFin   = leerTexto("Fecha fin (dd/mm/aaaa): ");
            Temporada t   = new Temporada(numTemp, episodios, durEp, fIni, fFin);
            serie.agregarTemporada(t);
            System.out.println("Temporada añadida.\n");
        }
    }

    // DOCUMENTAL
    private static void menuDocumental() {
        String titulo  = leerTexto("Título del documental: ");
        int duracion   = leerEntero("Duración (min): ");
        String genero  = leerTexto("Género: ");
        String tema    = leerTexto("Tema central: ");

        Documental doc = new Documental(titulo, duracion, genero, tema);
        catalogo.add(doc);

        System.out.println(">> Añada investigadores (vacío para terminar).");
        while (true) {
            String nombre = leerTexto("Nombre investigador (ENTER para terminar): ");
            if (nombre.isBlank()) break;
            String apellido = leerTexto("Apellido: ");
            String especial = leerTexto("Especialidad: ");
            String inst     = leerTexto("Institución: ");
            int aniosExp    = leerEntero("Años experiencia: ");
            String grado    = leerTexto("Grado académico (BSc/MSc/PhD): ");

            Investigador i = new Investigador(nombre, apellido, especial, inst, aniosExp, grado);
            doc.agregarInvestigador(i);
            System.out.println("Investigador añadido.");
        }
    }

    //VIDEOS
    private static void menuVideos() {
        int opVid;
        do {
            System.out.println("""
                1) Crear YouTubeVideo
                2) Crear TikTokVideo
                0) Volver
                """);
            opVid = leerEntero("Opción: ");
            switch (opVid) {
                case 1 -> crearYouTube();
                case 2 -> crearTikTok();
                case 0 -> { /* salir */ }
                default -> System.out.println("Opción inválida.");
            }
        } while (opVid != 0);
    }

    private static void crearYouTube() {
        String titulo = leerTexto("Título: ");
        int dur       = leerEntero("Duración (min): ");
        String genero = leerTexto("Género: ");
        String canal  = leerTexto("Canal: ");
        long views    = leerLong("Visualizaciones: ");
        long likes    = leerLong("Likes: ");

        YouTubeVideo yt = new YouTubeVideo(titulo, dur, genero, canal, views, likes);
        catalogo.add(yt);

        // colaboradores
        while (true) {
            String colab = leerTexto("Nombre colaborador (ENTER para terminar): ");
            if (colab.isBlank()) break;
            Actor a = new Actor(colab, "", 0, "", "");
            yt.addColaborador(a);
        }
    }

    private static void crearTikTok() {
        String titulo = leerTexto("Título: ");
        int durSeg    = leerEntero("Duración (seg): ");
        String genero = leerTexto("Género: ");
        String user   = leerTexto("Usuario @: ");
        long views    = leerLong("Visualizaciones: ");
        long likes    = leerLong("Likes: ");
        long shares   = leerLong("Shares: ");

        String nombre = leerTexto("Protagonista (nombre, ENTER si ninguno): ");
        Actor prota   = nombre.isBlank() ? null
                           : new Actor(nombre, "", 0, "", "");

        TikTokVideo tk = new TikTokVideo(titulo, durSeg, genero, user,
                                         views, likes, shares, prota);
        catalogo.add(tk);
    }

    //  LISTAR CATÁLOGO COMPLETO

    private static void listarCatalogo() {
        System.out.println("\n===== CATALOGO COMPLETO =====\n");
        if (catalogo.isEmpty()) {
            System.out.println("(Vacío)\n");
            return;
        }
        catalogo.forEach(ContenidoAudiovisual::mostrarDetalles);
    }

    //  UTILIDADES DE ENTRADA
    private static void mostrarMenuPrincipal() {
        System.out.println("""
            ===== GESTOR DE CONTENIDO AUDIOVISUAL =====
            1) Nueva Película
            2) Nueva Serie de TV
            3) Nuevo Documental
            4) Nuevos Videos (YouTube/TikTok)
            5) Listar catálogo
            0) Salir
            """);
    }

    private static String leerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    private static int leerEntero(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }

    private static long leerLong(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Long.parseLong(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }
}
