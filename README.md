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

## Historial de commits mínimos

1. Initial commit: Estructura de paquetes y clases base  
2. Add interactive menu: GestorContenidoApp con menú y operaciones básicas  
3. Implement domain methods: agregarActor, agregarInvestigador, agregarTemporada  
4. Add social media classes: Incorporación de TikTokVideo y YouTubeVideo  

## Mejoras adicionales

- Validaciones de entradas en el menú  
- Diagramas UML generados con PlantUML  
- Uso de Collections.unmodifiableList para proteger colecciones  
- Posibilidad de añadir pruebas unitarias con JUnit en el futuro  

---

¡Gracias por probar el sistema!  
Desarrollado en la Universidad Politécnica Salesiana  
Asignatura: Programación Orientada a Objetos  
Autor: Brandon Cárdenas
