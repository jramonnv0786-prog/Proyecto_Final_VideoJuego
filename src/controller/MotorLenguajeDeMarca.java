package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Pregunta;

public class MotorLenguajeDeMarca {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorLenguajeDeMarca() {
        preguntas = new ArrayList<>();

        // -------------------------------
        // PREGUNTAS DE LENGUAJE DE MARCAS
        // -------------------------------

        preguntas.add(new Pregunta(
                "¿Qué significa HTML?",
                "Hyper Terminal Markup Language",
                "HyperText Markup Language",
                "High Transfer Machine Language",
                "Hyperlink Text Management Language",
                2));

        preguntas.add(new Pregunta(
                "¿Cuál de las siguientes etiquetas define el título de un documento HTML?",
                "<head>",
                "<meta>",
                "<title>",
                "<h1>",
                3));

        preguntas.add(new Pregunta(
                "¿Qué lenguaje se usa principalmente para dar estilo a las páginas web?",
                "HTML",
                "JavaScript",
                "XML",
                "CSS",
                4));

        preguntas.add(new Pregunta(
                "¿Qué significa XML?",
                "eXtensible Markup Language",
                "Extra Modern Link",
                "eXecutable Multiple Language",
                "X-Markup Language",
                1));

        preguntas.add(new Pregunta(
                "¿Cuál es la etiqueta correcta para insertar una imagen en HTML?",
                "<image src='img.jpg'>",
                "<img href='img.jpg'>",
                "<img src='img.jpg'>",
                "<pic src='img.jpg'>",
                3));

        preguntas.add(new Pregunta(
                "¿Qué etiqueta se utiliza para crear un enlace (hipervínculo) en HTML?",
                "<link>",
                "<a>",
                "<href>",
                "<url>",
                2));

        preguntas.add(new Pregunta(
                "En HTML5, ¿cuál etiqueta se usa para reproducir contenido de video?",
                "<media>",
                "<movie>",
                "<video>",
                "<mp4>",
                3));

        preguntas.add(new Pregunta(
                "¿Qué significa JSON?",
                "Java Standard Output Network",
                "JavaScript Object Notation",
                "JavaScript Oriented Network",
                "Java Serialized Object Node",
                2));

        preguntas.add(new Pregunta(
                "¿Cuál es la estructura básica de una tabla en HTML?",
                "<table>, <tr>, <td>",
                "<table>, <row>, <cell>",
                "<tab>, <tr>, <td>",
                "<table>, <head>, <body>",
                1));

        preguntas.add(new Pregunta(
                "¿Qué atributo HTML se usa para definir estilos en línea (inline)?",
                "class",
                "font",
                "style",
                "styles",
                3));

        preguntas.add(new Pregunta(
                "¿Cuál de estos NO es un lenguaje de marcado?",
                "HTML",
                "XML",
                "Markdown",
                "Python",
                4));

        preguntas.add(new Pregunta(
                "¿Qué etiqueta de HTML5 se usa para el contenido principal de un documento?",
                "<main>",
                "<content>",
                "<section>",
                "<body>",
                1));

        preguntas.add(new Pregunta(
                "¿Qué lenguaje se usa comúnmente para escribir archivos de configuración simples?",
                "YAML",
                "C++",
                "Java",
                "PHP",
                1));

        preguntas.add(new Pregunta(
                "¿Qué versión de HTML introdujo elementos semánticos como <article> y <nav>?",
                "HTML 3.2",
                "HTML 4.01",
                "XHTML",
                "HTML5",
                4));

        preguntas.add(new Pregunta(
                "¿Qué atributo se usa en las imágenes (<img>) para el texto alternativo si la imagen no carga?",
                "title",
                "src",
                "alt",
                "description",
                3));

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
