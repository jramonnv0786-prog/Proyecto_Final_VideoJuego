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

    // Constructor para dificultad (juego aleatorio)
    public MotorJuego(int dificultad) {
        List<Pregunta> todas = BancoPreguntas.getAllPreguntas();
        Collections.shuffle(todas);

        int limite;
        switch (dificultad) {
            case 0:
                limite = 10;
                break;
            case 1:
                limite = 20;
                break;
            default:
                limite = todas.size();
                break;
        }

        int numPreguntas = Math.min(limite, todas.size());
        preguntas = new ArrayList<>(todas.subList(0, numPreguntas));
    }

    // Constructor para categoría específica
    public MotorJuego(String categoria) {
        preguntas = new ArrayList<>(BancoPreguntas.getPreguntasPorCategoria(categoria));
        Collections.shuffle(preguntas);
    }

    public Pregunta getPreguntaActual() {
        if (indice < preguntas.size())
            return preguntas.get(indice);
        return null;
    }

    public boolean comprobarRespuesta(int respuestaJugador) {
        Pregunta p = getPreguntaActual();
        if (p == null)
            return false;

        boolean acierto = (respuestaJugador == p.getCorrecta());
        if (acierto)
            puntuacion++;

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