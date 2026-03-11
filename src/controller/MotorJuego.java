package controller;

import model.Pregunta;

import java.util.ArrayList;
import java.util.Collections;

public class MotorJuego {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorJuego() {
        preguntas = new ArrayList<>();

        // -------------------------------
        // AÑADIR LAS PREGUNTAS A LA COLECCIÓN
        // -------------------------------
        preguntas.add(new Pregunta(
                "¿Capital de España?",
                "Madrid",
                "Barcelona",
                "Sevilla",
                "Valencia",
                1));

        preguntas.add(new Pregunta(
                "¿Lenguaje usado en Android?",
                "Java",
                "Python",
                "C++",
                "PHP",
                1));

        preguntas.add(new Pregunta(
                "¿Planeta rojo?",
                "Marte",
                "Venus",
                "Júpiter",
                "Saturno",
                1));
                
        preguntas.add(new Pregunta(
                "¿Cuál es el océano más grande del mundo?",
                "Océano Atlántico",
                "Océano Índice",
                "Océano Pacífico",
                "Océano Ártico",
                3));
                
        preguntas.add(new Pregunta(
                "¿Qué etiqueta de HTML se usa para los párrafos?",
                "<p>",
                "<h1>",
                "<div>",
                "<text>",
                1));
                
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