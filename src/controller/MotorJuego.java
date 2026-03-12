package controller;

import model.BancoPreguntas;
import model.Pregunta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MotorJuego {

    private List<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorJuego(int dificultad) {
        // Cargar todas las preguntas
        List<Pregunta> todas = BancoPreguntas.getAllPreguntas();
        Collections.shuffle(todas);

        // Ajustar según dificultad
        int limite;
        switch (dificultad) {
            case 0: // Fácil
                limite = 10;
                break;
            case 1: // Medio
                limite = 20;
                break;
            default: // Difícil
                limite = todas.size();
                break;
        }

        // Tomar el mínimo entre el límite y el total disponible
        int numPreguntas = Math.min(limite, todas.size());
        preguntas = new ArrayList<>(todas.subList(0, numPreguntas));
    }

    // DEVOLVER LA PREGUNTA ACTUAL
    public Pregunta getPreguntaActual() {
        if (indice < preguntas.size()) {
            return preguntas.get(indice);
        } else {
            return null; // fin del juego
        }
    }

    // COMPROBAR RESPUESTA
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
        return (preguntas != null && indice < preguntas.size());
    }
}