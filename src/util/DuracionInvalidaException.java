package util;

/**
 * Excepción personalizada que indica que la duración proporcionada para un
 * contenido audiovisual no es válida (por ejemplo, cuando es negativa o cero).
 */
/**
 * Excepción personalizada para duraciones no válidas.
 *
 * Extiende de {@link RuntimeException} para que sea no verificada, de modo
 * que las clases de dominio puedan lanzar esta excepción sin necesidad de
 * declarar {@code throws} y los consumidores no tengan que atraparla
 * explícitamente. Esto simplifica la creación de objetos en contextos
 * donde la duración ya ha sido validada por la interfaz de usuario.
 */
public class DuracionInvalidaException extends RuntimeException {
    public DuracionInvalidaException(String mensaje) {
        super(mensaje);
    }
}