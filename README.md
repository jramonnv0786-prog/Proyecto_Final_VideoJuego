# DevQuiz: Edición DAW

## 🏗️ Arquitectura del Proyecto (Patrón MVC)

El juego está estructurado siguiendo el patrón **Modelo-Vista-Controlador (MVC)**, separando la lógica del juego de la interfaz gráfica para facilitar el mantenimiento y la expansión a nuevas asignaturas.

```mermaid
classDiagram
    %% Definición de Paquetes y Clases
    
    class Principal {
        +main(String[] args)
    }

    namespace controller {
        class MotorJuego {
            -List~Pregunta~ preguntas
            -int puntuacion
            +comprobarRespuesta(int r) boolean
            +getPreguntaActual() Pregunta
        }
        class MotorProgramacion {
            -List~Pregunta~ preguntas
            +comprobarRespuesta(int r) boolean
        }
    }

    namespace model {
        class Partida {
            -String nombreJugador
            -int puntuacionTotal
            +sumarPuntos(int p)
        }
        class Pregunta {
            -String pregunta
            -String[] opciones
            -int correcta
            +getters()
        }
        class BancoPreguntas {
            +getAllPreguntas() List~Pregunta~
            +getPreguntasProgramacion() List~Pregunta~
        }
    }

    namespace view {
        class Ventana {
            +getContentPane()
        }
        class PanelMenu {
            -Partida partida
            +iniciarMusica()
        }
        class PanelJuego {
            -MotorJuego motor
            +actualizarPregunta()
        }
        class PanelCategorias {
            -Partida partida
        }
    }

    %% Relaciones
    Principal ..> Ventana : Instancia
    Principal ..> Partida : Instancia
    
    PanelMenu --> PanelJuego : Navega (Dificultad)
    PanelMenu --> PanelCategorias : Navega
    
    PanelJuego --> MotorJuego : Usa
    MotorJuego --> BancoPreguntas : Carga de
    MotorJuego *-- "*" Pregunta : Contiene
    
    Ventana *-- "1" JPanel : Contiene (Dynamic)
```
