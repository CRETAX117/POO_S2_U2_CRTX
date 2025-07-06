package poo;

import modified.*;

public class PruebaSubclases {

    public static void main(String[] args) {

        System.out.println("=== INICIO SUBCLASES ===\n");

        // === ACTORES ===
        Actor colaborador1 = new Actor("Destin", "Sandlin", 42, "EE.UU.", "Divulgación");
        Actor colaborador2 = new Actor("Veritasium", "Derek", 38, "Australia", "Educativo");

        Actor protagonista1 = new Actor("Rami", "Malek", 43, "EE.UU.", "Thriller");
        Actor protagonista2 = new Actor("Khaby", "Lame", 24, "Italia", "Comedia muda");

        // === YouTubeVideo ===
        YouTubeVideo yt1 = new YouTubeVideo("Ciencia real detrás de Dr. Stone", 18, "Documental", "Toho", 1_200_000, 98_000);
        yt1.addColaborador(colaborador1);
        yt1.addColaborador(colaborador2);

        YouTubeVideo yt2 = new YouTubeVideo("Análisis de Mr. Robot", 12, "Tecnología", "TechLab", 350_000, 12_000);
        yt2.addColaborador(protagonista1);

        // === TikTokVideo ===
        TikTokVideo tk1 = new TikTokVideo("Hack de Elliot en 30s", 30, "Thriller", "mrrobot", 8_500_000, 750_000, 120_000, protagonista1);
        TikTokVideo tk2 = new TikTokVideo("Cómo arreglar todo sin hablar", 15, "Comedia", "khaby.lame", 60_000_000, 3_200_000, 850_000, protagonista2);

        // === MOSTRAR DETALLES ===
        yt1.mostrarDetalles();
        yt2.mostrarDetalles();
        tk1.mostrarDetalles();
        tk2.mostrarDetalles();

        System.out.println("=== FIN SUBCLASES ===");
    }
}
