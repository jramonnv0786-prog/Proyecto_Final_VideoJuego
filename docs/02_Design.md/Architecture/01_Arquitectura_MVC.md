# Arquitectura del Proyecto (Patrón MVC)

Estructura interna de "DevQuiz: Edición DAW" usando el patrón Modelo-Vista-Controlador (MVC) adaptado para nuestro MVP de 4 días.

## 1. El Patrón MVC (Resumen)
* **Modelo (Datos):** Reglas del juego. Lleva la cuenta de puntos, vidas y almacena la lista de preguntas. No sabe nada de botones ni colores.
* **Vista (Interfaz Gráfica):** Es "tonta". Solo dibuja la pantalla usando **Java Swing estándar** y avisa cuando el usuario hace clic.
* **Controlador (Cerebro):** Escucha a la Vista, aplica la lógica en el Modelo, y le dice a la Vista cómo actualizarse.

## 2. Clases Principales

### Paquete: `modelo`
* `Pregunta.java`: Guarda los datos básicos (texto, las 4 opciones, la categoría y cuál es la respuesta correcta).
* `Partida.java`: Controla el estado actual de la partida (puntuación, las 3 vidas y qué pregunta toca).
* `BancoPreguntas.java`: Clase que contiene la lista de preguntas escritas directamente en el código (en un `ArrayList`) para enviárselas a la Partida al empezar a jugar.

### Paquete: `vista` (Java Swing)
* `VentanaPrincipal.java`: Hereda de `JFrame`. Es el marco principal de la ventana del juego.
* `PanelJuego.java`: Hereda de `JPanel`. Donde se dibuja todo: textos (`JLabel`), los 4 botones de respuesta (`JButton`) y el color de fondo según la categoría.

### Paquete: `controlador`
* `ControladorJuego.java`: Conecta el `PanelJuego` con la `Partida`. Contiene el temporizador (`javax.swing.Timer`) y los eventos de clic (`ActionListener`).

## 3. Flujo Rápido (Al responder)
*(Ver diagrama en: `flujo_respuesta.png`)*

1. El jugador hace clic en un botón del `PanelJuego`.
2. El `ControladorJuego` recibe el aviso del clic.
3. El `ControladorJuego` comprueba en la `Partida` si la respuesta es correcta.
4. La `Partida` actualiza sus datos (suma 100 puntos o resta 1 vida).
5. El `ControladorJuego` manda al `PanelJuego` actualizar los textos y poner la pantalla verde o roja.