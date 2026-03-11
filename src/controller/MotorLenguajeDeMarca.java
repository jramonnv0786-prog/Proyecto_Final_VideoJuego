package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Pregunta;

public class MotorLenguajeDeMarca {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorLenguajeDeMarca() {
        preguntas = (java.util.ArrayList<model.Pregunta>) model.BancoPreguntas.getPreguntasLenguajeDeMarca();
        Collections.shuffle(preguntas);
    }

    // -------------------------------
    // DEVOLVER LA PREGUNTA ACTUAL
    // -------------------------------
    public Pregunta getPreguntaActual() {
        if (indice < preguntas.size()) {
            return preguntas.get(indice);
        }
        return null;
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
            puntuacion++;
        }

        indice++;
        return acierto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public boolean hayPreguntas() {
        return indice < preguntas.size();
    }
}
