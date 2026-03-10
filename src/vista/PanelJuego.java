package vista;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.MotorJuego;
import controlador.Pregunta;

public class PanelJuego extends JPanel {

    private JLabel preguntaLabel;
    private JLabel puntuacionLabel;

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    private MotorJuego motor;

    public PanelJuego() {

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        motor = new MotorJuego();

        // -----------------
        // LABEL DE PREGUNTA
        // -----------------
        preguntaLabel = new JLabel();
        preguntaLabel.setBounds(200, 100, 600, 50);
        add(preguntaLabel);

        // -----------------
        // LABEL DE PUNTUACION
        // -----------------
        puntuacionLabel = new JLabel("Puntuación: 0");
        puntuacionLabel.setBounds(20, 20, 200, 40);
        add(puntuacionLabel);

        // -----------------
        // BOTON 1
        // -----------------
        boton1 = new JButton();
        boton1.setBounds(200, 400, 200, 60);
        add(boton1);
        boton1.addActionListener((ActionEvent e) -> {
            responder(1);
        });

        // -----------------
        // BOTON 2
        // -----------------
        boton2 = new JButton();
        boton2.setBounds(600, 400, 200, 60);
        add(boton2);
        boton2.addActionListener((ActionEvent e) -> {
            responder(2);
        });

        // -----------------
        // BOTON 3
        // -----------------
        boton3 = new JButton();
        boton3.setBounds(200, 500, 200, 60);
        add(boton3);
        boton3.addActionListener((ActionEvent e) -> {
            responder(3);
        });

        // -----------------
        // BOTON 4
        // -----------------
        boton4 = new JButton();
        boton4.setBounds(600, 500, 200, 60);
        add(boton4);
        boton4.addActionListener((ActionEvent e) -> {
            responder(4);
        });

        // CARGAR PRIMERA PREGUNTA
        actualizarPregunta();
    }

    // -----------------
    // METODO PARA RESPONDER
    // -----------------
    private void responder(int opcion) {
        boolean acierto = motor.comprobarRespuesta(opcion);

        if (acierto) {
            System.out.println("Respuesta correcta! Puntos: " + motor.getPuntuacion());
        } else {
            System.out.println("Respuesta incorrecta! Puntos: " + motor.getPuntuacion());
        }

        puntuacionLabel.setText("Puntuación: " + motor.getPuntuacion());
        actualizarPregunta();
    }

    // -----------------
    // METODO PARA CARGAR PREGUNTA ACTUAL
    // -----------------
    private void actualizarPregunta() {
        if (motor.hayPreguntas()) {
            Pregunta p = motor.getPreguntaActual();
            preguntaLabel.setText(p.getPregunta());

            boton1.setText(p.getOpcion1());
            boton2.setText(p.getOpcion2());
            boton3.setText(p.getOpcion3());
            boton4.setText(p.getOpcion4());

            boton1.setVisible(true);
            boton2.setVisible(true);
            boton3.setVisible(true);
            boton4.setVisible(true);

        } else {
            preguntaLabel.setText("Juego terminado. Puntuación final: " + motor.getPuntuacion());

            boton1.setVisible(false);
            boton2.setVisible(false);
            boton3.setVisible(false);
            boton4.setVisible(false);
        }
    }
}