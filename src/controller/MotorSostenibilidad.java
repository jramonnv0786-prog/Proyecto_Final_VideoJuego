package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Pregunta;

public class MotorSostenibilidad {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorSostenibilidad() {
        preguntas = (ArrayList<Pregunta>) model.BancoPreguntas.getPreguntasSostenibilidad();

        // -------------------------------
        // BARAJAR LAS PREGUNTAS ALEATORIAMENTE
        // -------------------------------

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
