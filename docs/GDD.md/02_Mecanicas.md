# 02. Mecánicas de Juego (Gameplay) - MVP (Producto Mínimo Viable)

## 1. Bucle Principal de Juego (Core Loop)
*El juego elimina la ruleta para ser una experiencia directa y rápida tipo "Supervivencia".*

1. **Aparición de Pregunta:** El juego selecciona aleatoriamente una pregunta de la base de datos (mostrando el color de su categoría).
2. **Fase de Respuesta:** El jugador lee la pregunta y las 4 opciones. Tiene un temporizador en pantalla.
3. **Resolución:** * **Acierto:** La pantalla brilla en verde, suma puntos, y pasa automáticamente a la siguiente pregunta aleatoria.
   * **Fallo (o Fin de tiempo):** La pantalla brilla en rojo, pierde una vida (corazón), se muestra cuál era la correcta durante 2 segundos, y pasa a la siguiente.
4. **Game Over:** Cuando se acaban las vidas, se muestra la puntuación final y un botón de "Volver a jugar".

## 2. Las Categorías (Materias de DAW)
*El juego cuenta con 4 categorías principales. Cada una cambia el color de fondo de la interfaz para dar variedad visual al jugador de forma sencilla.*
1. **Frontend (HTML/CSS):** Color Naranja.
2. **Backend (Java/Python):** Color Azul.
3. **Bases de Datos (MySQL):** Color Amarillo.
4. **Entornos de Desarrollo (GitHub/IDEs):** Color Morado.

## 3. Reglas de la Partida y Condiciones
* **Sistema de Vidas:** El jugador empieza con **3 Vidas (Corazones)**. Fallar una respuesta resta 1 vida.
* **Puntuación:** +100 puntos por cada respuesta correcta. (Opcional si da tiempo: +10 puntos extra por cada segundo sobrante en el temporizador).
* **Temporizador:** **20 segundos** por pregunta. Llegar a 0 equivale a fallar.
* **Condición de Victoria:** Es un juego infinito de superar tu propia puntuación (High Score). No hay un "final", terminas cuando mueres.
* **Condición de Derrota:** Perder los 3 corazones.

## 4. Controles e Interacción (Inputs)
* **Ratón:** Hacer clic en el botón de la respuesta (A, B, C o D).
* **Teclado:** Las teclas `1`, `2`, `3` y `4` para responder rápido sin usar el ratón.