Proyecto: Sistema de Gestión de Contenidos Audiovisuales (Unidad 2 – POO)

Objetivo:
Ampliar el proyecto base de la Unidad 1 aplicando herencia, asociación, agregación y composición. Se añaden nuevas clases y relaciones para entregar un sistema funcional.

Estructura del repositorio:

* src/

  * unia/ (código original)

    * ContenidoAudiovisual.java
    * Pelicula.java
    * SerieDeTV.java
    * Documental.java
  * modificaciones/ (clases añadidas en Unidad 2)

    * Actor.java
    * Temporada.java
    * Investigador.java
* diagramas/diagrama\_clases.png

Clases añadidas:

* Actor  → asociada a Pelicula
* Temporada → composición en SerieDeTV
* Investigador → agregación en Documental

Subclases nuevas de ContenidoAudiovisual (Etapa 4):

* (pendiente de crear: por ejemplo VideoYouTube, Cortometraje)

Instalación y ejecución rápida:

1. git clone
2. cd poo\_unidad2
3. Compilar: javac -d bin \$(find src -name "\*.java")
4. Ejecutar: java -cp bin unia.PruebaEtapa2

Pruebas:

* La clase PruebaEtapa2 crea objetos de todas las clases y muestra resultados en consola.

Mejoras implementadas:

* Uso de arrays/listas para colecciones.
* Separación de paquetes.
* Diagrama UML incorporado.

Licencia:
Proyecto académico – Universidad Politécnica Salesiana.
