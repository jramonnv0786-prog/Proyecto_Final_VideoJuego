# 03. Progresión y Estructura de Datos (Niveles)

*Al ser un juego tipo Trivial infinito ("Supervivencia"), no hay niveles físicos. La progresión se basa en la gestión de la base de datos de preguntas y cómo escala el reto a medida que el jugador acierta.*

## 1. Curva de Dificultad (Progresión del Juego)
*(El gráfico visual de la progresión se encuentra en: `docs/Design/architecture/curva_dificultad.png`)*

Para mantener al jugador enganchado, la dificultad de las preguntas aumentará gradualmente según la cantidad de aciertos consecutivos. La dificultad no se basa en el tiempo (que siempre será de 15 segundos), sino en la **complejidad cognitiva** de la pregunta sobre el temario de DAW:

* **Nivel 1: Dificultad Baja (Fase de Calentamiento)**
  * **Aparición:** Preguntas 1 a 5.
  * **Descripción:** Conceptos teóricos básicos, significados de siglas o cultura general de informática. Son preguntas de lectura rápida donde el jugador sabe la respuesta casi por instinto.
  * *Ejemplos:* "¿Qué significan las siglas HTML?", "¿Cuál de estos NO es un lenguaje de programación?" o "¿Qué es una clave primaria en SQL?".

* **Nivel 2: Dificultad Media (Fase de Práctica)**
  * **Aparición:** Preguntas 6 a 15.
  * **Descripción:** Sintaxis específica, uso de comandos de consola o herramientas concretas del día a día del desarrollador. Requiere haber tocado el código o la herramienta.
  * *Ejemplos:* "¿Qué comando de Git se usa para subir los cambios al repositorio remoto?", "¿Cómo se declara una variable en Java 17?" o "¿Qué puerto usa por defecto MySQL?".

* **Nivel 3: Dificultad Alta (Examen Final / Muerte Súbita)**
  * **Aparición:** Pregunta 16 en adelante.
  * **Descripción:** Lógica de programación, lectura de fragmentos de código (Snippets), debugging o conceptos abstractos de arquitectura. Requieren leer detenidamente las 4 opciones antes de contestar.
  * *Ejemplos:* "¿Cuál será el valor de la variable 'x' tras ejecutar este bucle *for*?", "¿Cuál es la diferencia principal entre un *Inner Join* y un *Left Join*?" o "¿Qué ocurre si intentas modificar una constante en JavaScript?".

*(Nota de Desarrollo para el MVP de 4 días: Añadiremos un campo `dificultad: 1, 2, 3` en el archivo JSON. Si no da tiempo a programar el escalado progresivo en el Controlador, haremos que el sistema simplemente elija preguntas al azar ignorando este campo).*