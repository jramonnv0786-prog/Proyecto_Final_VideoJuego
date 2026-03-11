package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Pregunta;

public class MotorDigitalizacion {

    private ArrayList<Pregunta> preguntas;
    private int indice = 0;
    private int puntuacion = 0;

    public MotorDigitalizacion() {
        preguntas = new ArrayList<>();

        // -------------------------------
        // PREGUNTAS DE DIGITALIZACIÓN
        // -------------------------------

        preguntas.add(new Pregunta(
                "¿Qué es la transformación digital?",
                "Pasar todos los archivos a PDF",
                "Integrar tecnología en todas las áreas de una empresa",
                "Comprar ordenadores nuevos",
                "Usar redes sociales para publicidad",
                2));

        preguntas.add(new Pregunta(
                "¿A qué hace referencia el término 'Cloud Computing' (Computación en la nube)?",
                "Almacenamiento y servicios a través de internet",
                "Predicción del clima mediante software",
                "Redes sociales en la estratosfera",
                "Ordenadores que funcionan con energía solar",
                1));

        preguntas.add(new Pregunta(
                "¿Qué significa 'IoT' (Internet de las Cosas)?",
                "Internet Of Technology",
                "Internal Organization Tools",
                "Interconexión digital de objetos cotidianos con internet",
                "Un tipo de cable de fibra óptica",
                3));

        preguntas.add(new Pregunta(
                "¿Qué es el 'Big Data'?",
                "Un disco duro de gran tamaño",
                "Conjuntos de datos demasiado grandes y complejos para procesar tradicionalmente",
                "Una empresa de telecomunicaciones",
                "El servidor principal de internet",
                2));

        preguntas.add(new Pregunta(
                "¿Qué tecnología utiliza bloques criptográficos inmutables, comúnmente asociada a criptomonedas?",
                "Inteligencia Artificial",
                "Machine Learning",
                "Blockchain",
                "5G",
                3));

        preguntas.add(new Pregunta(
                "¿Cuál de las siguientes protege los sistemas y redes de ataques digitales?",
                "Ciberseguridad",
                "Cybermarketing",
                "SEO",
                "Software Open Source",
                1));

        preguntas.add(new Pregunta(
                "¿Qué concepto describe una identidad virtual que recopila nuestros datos, acciones y rastros en internet?",
                "IP estática",
                "Huella digital",
                "Avatar",
                "Cookies",
                2));

        preguntas.add(new Pregunta(
                "¿Qué es el comercio electrónico (E-commerce)?",
                "Enviar correos electrónicos comerciales",
                "Aprender economía por internet",
                "Compra y venta de productos o servicios a través de internet",
                "Bancos que solo tienen cajeros",
                3));

        preguntas.add(new Pregunta(
                "¿Qué significa SEO en marketing digital?",
                "Search Engine Optimization",
                "System Electronic Output",
                "Secure Enterprise Operations",
                "Software Execution Order",
                1));

        preguntas.add(new Pregunta(
                "¿A qué se refiere el término 'Brecha Digital'?",
                "Un virus que rompe el sistema operativo",
                "Desigualdad en el acceso y uso de las TIC",
                "Espacio entre dos monitores",
                "Avería física en un cable de red",
                2));

        preguntas.add(new Pregunta(
                "¿Qué tecnología permite a una máquina simular inteligencia humana?",
                "Realidad Virtual (VR)",
                "Inteligencia Artificial (IA)",
                "Internet de las Cosas (IoT)",
                "Realidad Aumentada (AR)",
                2));

        preguntas.add(new Pregunta(
                "¿Qué es el phishing?",
                "Un juego de pesca en línea",
                "Técnica para mejorar la velocidad de internet",
                "Suplantación de identidad para robar datos confidenciales",
                "Un tipo de filtro para fotografías",
                3));

        preguntas.add(new Pregunta(
                "La Cuarta Revolución Industrial (Industria 4.0) se caracteriza principalmente por...",
                "Uso de energía de vapor",
                "Producción en cadena automatizada clásica",
                "Sistemas ciberfísicos, IoT e IA en la industria",
                "Invención de la bombilla",
                3));

        preguntas.add(new Pregunta(
                "¿Cuál es una ventaja clave del teletrabajo (trabajo remoto)?",
                "Exige comprar equipo más caro",
                "Flexibilidad geográfica y de horarios",
                "Reduce los sueldos a la mitad",
                "Elimina la necesidad de usar internet",
                2));

        preguntas.add(new Pregunta(
                "¿Qué tecnología mezcla entornos reales con objetos virtuales superpuestos en tiempo real?",
                "Realidad Virtual (VR)",
                "Realidad Aumentada (AR)",
                "Metaverso",
                "Cloud Computing",
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
