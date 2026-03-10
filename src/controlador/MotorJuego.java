package controlador;

import java.util.ArrayList;

public class MotorJuego {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorJuego() {
        preguntas = new ArrayList<>();

        // -------------------------------
        // EJEMPLO DE PREGUNTAS
        // -------------------------------
        preguntas.add(new Pregunta(
                "¿Capital de España?",
                "Madrid",
                "Barcelona",
                "Sevilla",
                "Valencia",
                1
        ));

        preguntas.add(new Pregunta(
                "¿Lenguaje usado en Android?",
                "Java",
                "Python",
                "C++",
                "PHP",
                1
        ));

        preguntas.add(new Pregunta(
                "¿Planeta rojo?",
                "Marte",
                "Venus",
                "Júpiter",
                "Saturno",
                1
        ));
    }

    // -------------------------------
    // DEVOLVER LA PREGUNTA ACTUAL
    // -------------------------------
    public Pregunta getPreguntaActual() {
        if (indice < preguntas.size()) {
            return preguntas.get(indice);
        } else {
            return null; // fin del juego
        }
    }

    // -------------------------------
    // COMPROBAR RESPUESTA
    // -------------------------------
    public boolean comprobarRespuesta(int respuestaJugador) {
        Pregunta p = getPreguntaActual();

        if (p == null) return false;

        boolean acierto = (respuestaJugador == p.getCorrecta());

        if (acierto) {
            puntuacion++; // suma 1 punto si acierta
        }

        indice++; // pasar a la siguiente pregunta
        return acierto;
    }

    
    public int getPuntuacion() {
        return puntuacion;
    }

    public boolean hayPreguntas() {
        return indice < preguntas.size();
    }
}