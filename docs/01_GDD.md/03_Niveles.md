# 03. Estructura de Dificultad (Niveles)

*El juego ha evolucionado de un sistema de escalado progresivo a un sistema de selección explícita por parte del usuario, permitiendo adaptar la duración y el reto de la partida desde el inicio.*

## 1. Selección de Dificultad (Modo Principal)

Al iniciar una partida general, el jugador debe elegir entre tres niveles que determinan el volumen de preguntas y, por tanto, la exigencia para mantener la concentración:

* **Modo Fácil (Calentamiento)**
  * **Volumen:** 10 preguntas aleatorias.
  * **Objetivo:** Partida rápida para toma de contacto o repaso breve.
  * **Puntuación Máxima:** 10 puntos.

* **Modo Medio (Práctica Real)**
  * **Volumen:** 20 preguntas aleatorias.
  * **Objetivo:** Evaluación más profunda de los conocimientos generales de DAW.
  * **Puntuación Máxima:** 20 puntos.

* **Modo Difícil (Examen Final)**
  * **Volumen:** Todas las preguntas disponibles en el banco (`BancoPreguntas.getAllPreguntas()`).
  * **Objetivo:** Test de resistencia y dominio total de todas las materias.
  * **Puntuación Máxima:** Variable según el tamaño del banco.

## 2. Especialización por Categorías

Además del modo general, el juego permite la **práctica focalizada**. En este modo, el jugador selecciona una de las 6 materias (Programación, Sistemas, etc.) y se enfrenta a todas las preguntas específicas de esa área.

Este sistema sustituye la curva de dificultad dinámica por una **autogestionada**, donde el "Nivel" lo marca la ambición del jugador al elegir el modo de juego.

## 3. Estructura de Datos (Banco de Preguntas)

Las preguntas están organizadas en la clase `model.BancoPreguntas` y se recuperan dinámicamente:
* `getPreguntasProgramacion()`
* `getPreguntasSistemas()`
* `getPreguntasEntornos()`
* `getPreguntasLenguajeMarca()`
* `getPreguntasDigitalizacion()`
* `getPreguntasSostenibilidad()`
* `getAllPreguntas()` (Para el modo general con dificultad)