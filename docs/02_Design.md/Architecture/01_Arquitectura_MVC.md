# Arquitectura del Proyecto (Patrón MVC)

Estructura interna de "DevQuiz: Edición DAW" usando el patrón Modelo-Vista-Controlador (MVC).

## 1. El Patrón MVC (Resumen)
* **Modelo (Datos):** Contiene la lógica de negocio, el banco de preguntas y el estado de la partida.
* **Vista (Interfaz Gráfica):** Paneles de Java Swing que gestionan la representación visual y capturan eventos.
* **Controlador (Motores):** Gestionan la lógica de cada tipo de juego, filtrando preguntas y validando respuestas.

## 2. Clases Principales

### Paquete: `model`
* `Pregunta.java`: POJO que representa una pregunta con sus opciones y respuesta correcta.
* `Partida.java`: Almacena el estado global de la sesión (nombre del jugador, puntuación acumulada).
* `BancoPreguntas.java`: Repositorio estático con todos los bancos de preguntas para cada materia.

### Paquete: `view` (Java Swing)
* `Ventana.java`: JFrame principal que actúa como contenedor.
* `PanelMenu.java`: Menú principal con opciones de Iniciar (General), Categorías y Créditos.
* `PanelCategorias.java`: Selector de materias específicas.
* `PanelJuego.java`: Panel para la partida general con dificultad.
* `Paneles Especializados` (`PanelProgramacion.java`, `PanelSistemas.java`, etc.): Paneles adaptados a cada materia (aunque comparten una lógica visual similar).

### Paquete: `controller`
* `MotorJuego.java`: Controlador para el modo general. Gestiona el límite de preguntas según dificultad.
* `Motores Especializados` (`MotorProgramacion.java`, `MotorEntornos.java`, etc.): Controladores dedicados a filtrar preguntas de una sola categoría.

## 3. Flujo de Navegación

1. **Entrada:** `Principal.java` instancia `Ventana` y `Partida`.
2. **Menú:** `PanelMenu` permite navegar a `PanelJuego` (con diálogo de dificultad) o a `PanelCategorias`.
3. **Selección:** Desde `PanelCategorias`, se instancia el Panel específico de la materia.
4. **Ciclo de Juego:** 
    * El Panel solicita la pregunta actual al Motor.
    * El usuario responde.
    * El Panel llama al Motor para validar.
    * Si acierta, el Panel actualiza la `Partida` (Modelo).
    * Se carga la siguiente pregunta hasta agotar el banco.