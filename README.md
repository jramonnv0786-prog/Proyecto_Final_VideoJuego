# Proyecto_Final_VideoJuego

## 🏗️ Arquitectura del Proyecto (Patrón MVC)

El juego está estructurado siguiendo estrictamente el patrón **Modelo-Vista-Controlador (MVC)** para garantizar un código limpio y escalable, separando la lógica del juego de la interfaz gráfica.

```mermaid
classDiagram
    %% Definición de Paquetes y Clases
    
    class Main {
        +main(String[] args)
    }

    namespace Controlador {
        class ControladorJuego {
            -VentanaPrincipal vista
            -Partida partida
            +iniciar()
            +verificarRespuesta(int indiceBoton)
        }
    }

    namespace Modelo {
        class Partida {
            -int puntos
            -int vidas
            -Pregunta preguntaActual
            -List~Pregunta~ listaPreguntas
            +comprobarRespuesta(int indice) boolean
            +siguientePregunta()
        }
        class Pregunta {
            -String textoPregunta
            -String[] opciones
            -int indiceCorrecto
            -String categoria
            +getters()
        }
        class BancoPreguntas {
            +obtenerPreguntas() List~Pregunta~
        }
    }

    namespace Vista {
        class VentanaPrincipal {
            -PanelJuego panelJuego
            +mostrar()
        }
        class PanelJuego {
            +actualizarTextos(Pregunta p)
            +actualizarMarcadores(int puntos, int vidas)
            +cambiarColorFondo(Color c)
        }
    }

    %% Relaciones
    Main ..> VentanaPrincipal : Instancia
    Main ..> ControladorJuego : Instancia
    
    ControladorJuego --> VentanaPrincipal : Modifica (UI)
    ControladorJuego --> Partida : Consulta / Modifica (Lógica)
    
    Partida *-- "*" Pregunta : Contiene
    Partida ..> BancoPreguntas : Carga de
    
    VentanaPrincipal *-- "1" PanelJuego : Contiene
