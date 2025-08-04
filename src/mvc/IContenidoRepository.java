/*
 * Manejo de controladores
 * by cretax
 * */

package mvc;

import java.util.List;
import uni1a.ContenidoAudiovisual;

/**
 * Interfaz del repositorio de contenido audiovisual.
 * Define operaciones básicas para obtener y almacenar contenidos.
 */
public interface IContenidoRepository {
    /**
     * Devuelve todos los contenidos almacenados.
     * @return lista de contenidos
     */
    List<ContenidoAudiovisual> getAll();

    /**
     * Guarda un nuevo contenido en el repositorio.
     * @param contenido contenido a guardar
     */
    void save(ContenidoAudiovisual contenido);
}