# 02. Mecánicas de Juego (Gameplay) - MVP (Producto Mínimo Viable)

## 1. Bucle Principal de Juego (Core Loop)
*El juego permite elegir entre una partida general con selección de dificultad o practicar por categorías específicas.*

1. **Selección de Modo:**
    * **Juego General:** El jugador elige dificultad (Fácil, Medio, Difícil).
    * **Categorías:** El jugador elige una materia específica para practicar.
2. **Aparición de Pregunta:** El juego selecciona preguntas de la base de datos (aleatorizadas).
3. **Fase de Respuesta:** El jugador lee la pregunta y las 4 opciones.
4. **Resolución:**
   * **Acierto:** Suma puntos a la puntuación global.
   * **Fallo:** No suma puntos. Se pasa a la siguiente pregunta.
5. **Fin de Partida:** Al terminar el bloque de preguntas (según dificultad o categoría), se muestra la puntuación final y se permite volver al menú.

## 2. Las Categorías (Materias de DAW)
*El juego cuenta con 6 categorías principales, cada una con su propio banco de preguntas y paneles personalizados.*
1. **Programación:** Temas de Java y lógica.
2. **Entornos de Desarrollo:** Git, IDEs y metodologías.
3. **Lenguaje de Marcas:** HTML, CSS y XML.
4. **Sistemas Informáticos:** Hardware y Sistemas Operativos.
5. **Digitalización:** Conceptos de transformación digital.
6. **Sostenibilidad:** Conceptos de sostenibilidad en IT.

## 3. Reglas de la Partida y Condiciones
* **Selección de Dificultad (Modo General):**
    * **Fácil:** Bloque de 10 preguntas aleatorias.
    * **Medio:** Bloque de 20 preguntas aleatorias.
    * **Difícil:** Todas las preguntas disponibles en el banco.
* **Puntuación:** +1 punto por cada respuesta correcta. La puntuación es acumulativa en la sesión actual.
* **Condición de Finalización:** Terminar el set de preguntas asignado por la dificultad o la categoría.

## 4. Controles e Interacción (Inputs)
* **Ratón:** Hacer clic en el botón de la respuesta (A, B, C o D).
* **Navegación:** Botones para volver al menú o cambiar de categoría.