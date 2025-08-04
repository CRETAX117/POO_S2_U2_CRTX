/*
 * Manejo de controladores
 * by cretax
 * */

package mvc;

import java.util.ArrayList;
import java.util.List;

import uni1a.ContenidoAudiovisual;

/**
 * Implementación simple de {@link IContenidoRepository} basada en una lista en memoria.
 * Esta clase aplica el principio de inversión de dependencias (DIP) al separar la
 * lógica de almacenamiento del resto de la aplicación.
 */
public class ListaContenidoRepository implements IContenidoRepository {
    private final List<ContenidoAudiovisual> contenidos = new ArrayList<>();

    @Override
    public List<ContenidoAudiovisual> getAll() {
        return new ArrayList<>(contenidos);
    }

    @Override
    public void save(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }
}