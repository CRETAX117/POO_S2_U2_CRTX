package poo;

import uni1a.*;
import modified.*;

public class PruebaRelaciones {

    public static void main(String[] args) {

        System.out.println("=== INICIO RELACIONES ===\n");

        // === 1. ACTORES ===
        Actor actor1 = new Actor("Hugh", "Laurie", 64, "Reino Unido", "Drama médico");
        Actor actor2 = new Actor("Rami", "Malek", 43, "EE.UU.", "Thriller");
        Actor actor3 = new Actor("Yusuke", "Kobayashi", 38, "Japón", "Voz");
        Actor actor4 = new Actor("Lisa", "Edelstein", 57, "EE.UU.", "Drama");
        Actor actor5 = new Actor("Christian", "Slater", 54, "EE.UU.", "Thriller");

        // === 2. INVESTIGADORES ===
        Investigador inv1 = new Investigador("Senku", "Ishigami", "Ciencia Aplicada", "Instituto Ishigami", 6, "PhD");
        Investigador inv2 = new Investigador("Chrome", "S.", "Química Orgánica", "Laboratorio Primario", 3, "Licenciado");

        // === 3. PELÍCULA ===
        Pelicula pelicula = new Pelicula("House: Diagnóstico Final", 120, "Drama médico", "Fox");
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor4);
        pelicula.eliminarActor(actor4); // simula edición
        pelicula.agregarActor(actor3);  // colaboración externa

        // === 4. SERIE ===
        SerieDeTV serie = new SerieDeTV("Mr. Robot", 55, "Thriller psicológico", 0);

        Temporada t1 = new Temporada(1, 10, 55, "01/06/2015", "01/09/2015");
        t1.agregarEpisodio("eps1.0_hellofriend.mov");
        t1.agregarEpisodio("eps1.1_ones-and-zer0es.mpeg");

        Temporada t2 = new Temporada(2, 12, 55, "15/06/2016", "15/09/2016");
        t2.agregarEpisodio("eps2.0_unm4sk-pt1.tc");

        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);
        serie.eliminarTemporada(t1); // simula error y corrección
        serie.agregarTemporada(t1); // vuelve a agregar

        // === 5. DOCUMENTAL ===
        Documental doc = new Documental("La ciencia de Dr. Stone", 60, "Ciencia ficción", "Análisis científico del anime");
        doc.agregarInvestigador(inv1);
        doc.agregarInvestigador(inv2);
        doc.eliminarInvestigador(inv2); // simulación de modificación

        // === 6. MOSTRAR DATOS ===
        System.out.println("------ Película ------");
        pelicula.mostrarDetalles();

        System.out.println("------ Serie ------");
        serie.mostrarDetalles();

        System.out.println("------ Documental ------");
        doc.mostrarDetalles();

        System.out.println("\n=== FIN RELACIONES ===");
    }
}
