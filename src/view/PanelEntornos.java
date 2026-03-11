package view;

import controller.MotorEntornos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Pregunta;

public class PanelEntornos extends JPanel {

    private JLabel tituloLabel;
    private JLabel preguntaLabel;
    private JLabel puntuacionLabel;

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton botonVolver;

    private MotorEntornos motor;

    private model.Partida partida;

    public PanelEntornos(model.Partida partida) {
        this.partida = partida;
        // 1. Configuración básica del panel
        setLayout(null);
        setBounds(0, 0, 1000, 800);
        setBackground(new Color(240, 248, 255)); // Color de fondo distinto

        motor = new MotorEntornos();

        // 2. Título de la Categoría
        tituloLabel = new JLabel("Categoría: Entornos");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 28));
        tituloLabel.setBounds(350, 40, 400, 50);
        add(tituloLabel);

        // 3. Etiqueta de la Puntuación
        puntuacionLabel = new JLabel("Puntuación Global: " + partida.getPuntuacionTotal());
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        puntuacionLabel.setBounds(30, 30, 250, 40);
        add(puntuacionLabel);

        // 4. Etiqueta de la Pregunta
        preguntaLabel = new JLabel("Cargando pregunta...");
        preguntaLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        preguntaLabel.setBounds(200, 150, 600, 80);
        add(preguntaLabel);

        // 5. Botones de Respuestas
        boton1 = new JButton();
        boton1.setBounds(200, 300, 250, 60);
        add(boton1);
        boton1.addActionListener((ActionEvent e) -> responder(1));

        boton2 = new JButton();
        boton2.setBounds(550, 300, 250, 60);
        add(boton2);
        boton2.addActionListener((ActionEvent e) -> responder(2));

        boton3 = new JButton();
        boton3.setBounds(200, 400, 250, 60);
        add(boton3);
        boton3.addActionListener((ActionEvent e) -> responder(3));

        boton4 = new JButton();
        boton4.setBounds(550, 400, 250, 60);
        add(boton4);
        boton4.addActionListener((ActionEvent e) -> responder(4));

        // 6. Botón para Volver
        botonVolver = new JButton("Volver a Categorías");
        botonVolver.setBounds(30, 700, 200, 50);
        add(botonVolver);

        botonVolver.addActionListener((ActionEvent e) -> {
            javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
            if (ventana != null) {
                ventana.getContentPane().removeAll();
                ventana.add(new PanelCategorias(partida));
                ventana.revalidate();
                ventana.repaint();
            }
        });

        // 7. Cargar la primera pregunta
        actualizarPregunta();
    }

    private void responder(int opcion) {
        boolean acierto = motor.comprobarRespuesta(opcion);
        if (acierto) {
            partida.sumarPuntos(1);
            System.out.println("¡Acierto en Entornos! Puntos globales: " + partida.getPuntuacionTotal());
        }
        puntuacionLabel.setText("Puntuación Global: " + partida.getPuntuacionTotal());
        actualizarPregunta();
    }

    private void actualizarPregunta() {
        if (motor.hayPreguntas()) {
            Pregunta p = motor.getPreguntaActual();
            preguntaLabel.setText("<html>" + p.getPregunta() + "</html>"); // Así hace salto de línea si es larga

            boton1.setText(p.getOpcion1());
            boton2.setText(p.getOpcion2());
            boton3.setText(p.getOpcion3());
            boton4.setText(p.getOpcion4());
        } else {
            preguntaLabel.setText("¡Categoría completada! Puntuación Global: " + partida.getPuntuacionTotal());
            boton1.setEnabled(false);
            boton2.setEnabled(false);
            boton3.setEnabled(false);
            boton4.setEnabled(false);
        }
    }

}
