#### 2. En `03_Secuencia.md`
El diagrama de secuencia es vital para el MVC porque explica **el orden temporal** en el que se pasan los mensajes. Este es el que le encanta a los profesores.


[Image of UML sequence diagram]

Puedes copiar este código Mermaid, que describe exactamente lo que pasa cuando el jugador hace clic en una respuesta:
```markdown
# Diagrama de Secuencia: Flujo de Respuesta

```mermaid
sequenceDiagram
    actor Jugador
    participant V as Vista (PanelJuego)
    participant C as ControladorJuego
    participant M as Modelo (Partida)

    Jugador->>V: Clic en Botón de Respuesta (Ej: 'A')
    V->>C: notificarClic(indiceBoton)
    
    activate C
    C->>M: comprobarRespuesta(indiceBoton)
    activate M
    
    alt Respuesta Correcta
        M-->>C: devuelve TRUE
        C->>V: cambiarColorFondo(Verde)
        C->>M: sumarPuntos()
    else Respuesta Incorrecta
        M-->>C: devuelve FALSE
        C->>V: cambiarColorFondo(Rojo)
        C->>M: restarVida()
    end
    
    deactivate M
    
    C->>V: actualizarTextos(Puntos, Vidas)
    deactivate C
```