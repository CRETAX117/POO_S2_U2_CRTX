package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases de forma segura
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        try {
            contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
            contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
            contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        } catch (util.DuracionInvalidaException e) {
            System.err.println("Error al crear contenido: " + e.getMessage());
            return;
        }

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}