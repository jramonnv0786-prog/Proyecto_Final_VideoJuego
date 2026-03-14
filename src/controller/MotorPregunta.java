package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.BancoPreguntas;
import model.Pregunta;

public class MotorPregunta {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    // Recibe la categoría y carga automáticamente las preguntas
    public MotorPregunta(String categoria) {
        preguntas = new ArrayList<>(BancoPreguntas.getPreguntasPorCategoria(categoria));
        Collections.shuffle(preguntas);
    }

    // DEVOLVER LA PREGUNTA ACTUAL
    public Pregunta getPreguntaActual() {
        if (indice < preguntas.size()) {
            return preguntas.get(indice);
        }
        return null;
    }

    // COMPROBAR RESPUESTA
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