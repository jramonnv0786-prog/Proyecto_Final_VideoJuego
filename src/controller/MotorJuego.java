package controller;

import model.Pregunta;

import java.util.ArrayList;
import java.util.Collections;

public class MotorJuego {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorJuego() {
        Collections.shuffle(preguntas);
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

        if (p == null)
            return false;

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