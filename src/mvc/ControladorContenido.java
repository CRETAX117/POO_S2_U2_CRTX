/*
 * Manejo de controladores
 * by cretax
 * */

package mvc;

import java.util.List;

import uni1a.ContenidoAudiovisual;

/**
 * Controlador que media entre la vista y el repositorio.
 * Permite agregar nuevos contenidos y mostrar el catálogo.
 */
public class ControladorContenido {
    private final IContenidoRepository repositorio;
    private final VistaConsola vista;

    public ControladorContenido(IContenidoRepository repositorio, VistaConsola vista) {
        this.repositorio = repositorio;
        this.vista       = vista;
    }

    /**
     * Agrega un nuevo contenido al repositorio.
     * @param contenido nuevo contenido a guardar
     */
    public void agregarContenido(ContenidoAudiovisual contenido) {
        repositorio.save(contenido);
    }

    /**
     * Recupera los contenidos desde el repositorio y los muestra por consola.
     */
    public void listarContenidos() {
        List<ContenidoAudiovisual> lista = repositorio.getAll();
        vista.mostrarCatalogo(lista);
    }
}