# GestorContenidoApp - POO_S2_U2_CRTX

Programación Orientada a Objetos • Universidad Politécnica Salesiana

---

## Objetivos y propósito

Este proyecto es una **aplicación de consola** para demostrar los principios de Programación Orientada a Objetos (POO) mediante la gestión de contenido audiovisual: películas, series, documentales y videos de redes sociales. Permite crear, relacionar y mostrar entidades complejas y sus interacciones.

## Clases y funcionalidades nuevas

- **Modelo de dominio**:
  - ContenidoAudiovisual (abstracta)
  - Pelicula, Documental, SerieDeTV (herencia)
  - Actor, Investigador, Temporada
  - TikTokVideo, YouTubeVideo
- **GestorContenidoApp**:
  - Menú interactivo por consola
  - Métodos para crear y manipular todas las clases usando constructores parametrizados
  - Agregar actores, investigadores, temporadas, colaboradores
  - Mostrar catálogo completo con detalles y relaciones
- **Diagramas PlantUML** para visualizar herencias, agregaciones y composiciones.

## Instrucciones para clonar y ejecutar

1. **Clonar el repositorio**:
   ```
   git clone https://github.com/CRETAX117/POO_S2_U2_CRTX.git
   cd POO_S2_U2_CRTX
   ```
2. **Crear commits adicionales** (ya presentes):
   - Initial commit: Estructura base del proyecto
   - Implement domain methods: agregarActor, agregarTemporada, etc.
   - Add social media classes: TikTokVideo, YouTubeVideo
3. **Importar en NetBeans**:
   - File → Open Project → Selecciona la carpeta raíz del proyecto
   - Ejecuta POO_S2_U2_CRTX desde el IDE **O compilar/ejecutar en consola**:
   ```
   mkdir bin
   javac -d bin src/uni1a/*.java src/modified/*.java src/poo/*.java
   java -cp bin poo.GestorContenidoApp
   ```

## Mejoras adicionales

- Validaciones de entradas en el menú  
- Diagramas UML generados con PlantUML  
- Uso de Collections.unmodifiableList para proteger colecciones  
- Posibilidad de añadir pruebas unitarias con JUnit en el futuro  

# Refactorizacion

VALIDACIÓN DE DOMINIO
   - Antes: Las subclases aceptaban cualquier duración (0 o negativa).
   - Ahora: Se añadió DuracionInvalidaException. Se lanza automáticamente
     si la duración ≤ 0. Convertida en RuntimeException para no romper código
     existente.

PERSISTENCIA
   - Antes: No existía forma de guardar/recuperar objetos.
   - Ahora: Clase util.GestorArchivos con métodos toCSV / fromCSV y manejo
     de archivos mediante try-with-resources.

DISEÑO (MVC)
   - Antes: Lógica y presentación mezcladas en las clases demo.
   - Ahora: Paquete mvc con VistaConsola, ControladorContenido y un
     repositorio en memoria. Vista ↔ Modelo desacoplados.

PRUEBAS AUTOMATIZADAS

   - Antes: El proyecto no contaba con pruebas automatizadas, y la verificación de la funcionalidad se realizaba únicamente de forma manual.

   - Ahora: Se han implementado un total de 5 clases de prueba unitarias utilizando JUnit 5, cubriendo las funcionalidades principales de las siguientes clases:



MANEJO DE ERRORES EN DEMOS
   - Antes: Clases Prueba* podían abortar por excepciones sin capturar.
   - Ahora: Bloques try-catch en PruebaAudioVisual, PruebaRelaciones y
     PruebaSubclases; muestran mensaje y continúan.

REFACTOR Y SOLID
   - Antes: Métodos largos y responsabilidades mezcladas.
   - Ahora: Aplicados SRP (una responsabilidad por clase), OCP (nuevas
     subclases sin tocar las bases) y DIP (controlador ↔ repositorio).

---

¡Gracias por probar el sistema!  
Desarrollado en la Universidad Politécnica Salesiana  
Asignatura: Programación Orientada a Objetos  
Autor: Brandon Cárdenas (CRETAX)
