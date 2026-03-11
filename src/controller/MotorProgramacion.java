package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Pregunta;

public class MotorProgramacion {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorProgramacion() {
        preguntas = new ArrayList<>();

        // -------------------------------
        // PREGUNTAS DE PROGRAMACIÓN
        // -------------------------------

        preguntas.add(new Pregunta(
                "¿Qué lenguaje de programación se utiliza principalmente para el desarrollo web del lado del cliente?",
                "Java",
                "Python",
                "JavaScript",
                "C#",
                3));

        preguntas.add(new Pregunta(
                "¿Cuál es el propósito principal de la sentencia 'if' en programación?",
                "Repetir código",
                "Realizar cálculos matemáticos",
                "Tomar decisiones condicionales",
                "Declarar variables",
                3));

        preguntas.add(new Pregunta(
                "¿Qué estructura de datos se utiliza para almacenar una colección ordenada de elementos?",
                "Array (Arreglo)",
                "Objeto",
                "Variable booleana",
                "Constante",
                1));

        preguntas.add(new Pregunta(
                "¿Qué significa 'HTML' en el contexto del desarrollo web?",
                "High Transfer Markup Language",
                "HyperText Markup Language",
                "Hyperlink and Text Management Language",
                "Home Tool Markup Language",
                2));

        preguntas.add(new Pregunta(
                "¿Cuál es el resultado de la siguiente operación: 5 + 3 * 2?",
                "16",
                "11",
                "13",
                "8",
                2));

        preguntas.add(new Pregunta(
                "¿Qué tipo de dato se utiliza para representar valores verdadero o falso?",
                "String",
                "Integer",
                "Boolean",
                "Float",
                3));

        preguntas.add(new Pregunta(
                "¿Qué se utiliza para comentar una sola línea en la mayoría de los lenguajes de programación?",
                "//",
                "/* */",
                "#",
                "<!-- -->",
                1));

        preguntas.add(new Pregunta(
                "¿Qué significa 'API' en el contexto de software?",
                "Advanced Programming Interface",
                "Application Programming Interface",
                "Automated Program Instruction",
                "Application Process Integration",
                2));

        preguntas.add(new Pregunta(
                "¿Qué estructura de control se utiliza para repetir un bloque de código mientras una condición sea verdadera?",
                "If-else",
                "Switch",
                "While",
                "For",
                3));

        preguntas.add(new Pregunta(
                "¿Qué lenguaje de programación se utiliza principalmente para el desarrollo de aplicaciones Android?",
                "Swift",
                "Kotlin",
                "Dart",
                "Ruby",
                2));

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
