package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Pregunta;

public class MotorEntornos {

        private ArrayList<Pregunta> preguntas;
        private int indice = 0;
        private int puntuacion = 0;

        public MotorEntornos() {
                preguntas = new ArrayList<>();

                // -------------------------------
                // PREGUNTAS DE ENTORNOS
                // -------------------------------

                preguntas.add(new Pregunta(
                                "¿Qué significa IDE?",
                                "Entorno de Desarrollo Integrado",
                                "Interfaz de Datos Electrónicos",
                                "Motor de Base de Datos Interna",
                                "Editor de Diseño Interactivo",
                                1));

                preguntas.add(new Pregunta(
                                "¿Cuál es un ejemplo de IDE popular?",
                                "Microsoft Word",
                                "Eclipse",
                                "Photoshop",
                                "Excel",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué es Git?",
                                "Un lenguaje de programación",
                                "Un sistema de control de versiones",
                                "Un IDE",
                                "Un compilador",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué comando de Git se usa para subir cambios al repositorio remoto?",
                                "git pull",
                                "git push",
                                "git commit",
                                "git add",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué es un framework?",
                                "Un tipo de hardware",
                                "Un conjunto de herramientas y bibliotecas para desarrollar software",
                                "Un sistema operativo",
                                "Un navegador web",
                                2));

                preguntas.add(new Pregunta(
                                "¿Cuál es un ejemplo de framework para Java?",
                                "React",
                                "Spring",
                                "Django",
                                "Laravel",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué es el testing unitario?",
                                "Probar el software completo",
                                "Probar componentes individuales del código",
                                "Probar la interfaz de usuario",
                                "Probar la base de datos",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué herramienta se usa comúnmente para testing en Java?",
                                "JUnit",
                                "Selenium",
                                "Postman",
                                "Jenkins",
                                1));

                preguntas.add(new Pregunta(
                                "¿Qué es Maven?",
                                "Un IDE",
                                "Una herramienta de gestión de proyectos y dependencias",
                                "Un lenguaje de programación",
                                "Un servidor web",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué archivo configura las dependencias en Maven?",
                                "pom.xml",
                                "build.gradle",
                                "package.json",
                                "requirements.txt",
                                1));

                preguntas.add(new Pregunta(
                                "¿Qué es Scrum?",
                                "Un lenguaje de programación",
                                "Una metodología ágil",
                                "Un IDE",
                                "Un framework",
                                2));

                preguntas.add(new Pregunta(
                                "¿Cuál es el rol del Scrum Master?",
                                "Desarrollar el código",
                                "Facilitar el proceso Scrum",
                                "Diseñar la interfaz",
                                "Gestionar la base de datos",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué es la integración continua?",
                                "Un tipo de base de datos",
                                "La práctica de integrar cambios de código frecuentemente",
                                "Un lenguaje de scripting",
                                "Un servidor de aplicaciones",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué herramienta se usa para integración continua?",
                                "Git",
                                "Jenkins",
                                "Eclipse",
                                "Maven",
                                2));

                preguntas.add(new Pregunta(
                                "¿Qué es Docker?",
                                "Un IDE",
                                "Una plataforma para desarrollar, enviar y ejecutar aplicaciones en contenedores",
                                "Un sistema de control de versiones",
                                "Un framework web",
                                2));

                // -------------------------------
                // BARAJAR LAS PREGUNTAS ALEATORIAMENTE
                // ------------------------------
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
