package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.Pregunta;
import controller.MotorJuego;

public class PanelJuego extends JPanel {

    private JLabel preguntaLabel;
    private JLabel puntuacionLabel;

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    private MotorJuego motor;

    private model.Partida partida;
    private Image fondo;

    public PanelJuego(model.Partida partida, int dificultad) {
        this.partida = partida;

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // Cargar la imagen de fondo
        java.net.URL urlFondo = getClass().getResource("/resources/fondoPreguntas.png");
        if (urlFondo != null) {
            ImageIcon icon = new ImageIcon(urlFondo);
            fondo = icon.getImage();
        }

        motor = new MotorJuego(dificultad);

        // -----------------
        // LABEL DE PREGUNTA
        // -----------------
        preguntaLabel = new JLabel();
        preguntaLabel.setBounds(100, 150, 800, 100);
        preguntaLabel.setFont(new Font("Arial", Font.BOLD, 22));
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(preguntaLabel);

        // -----------------
        // LABEL DE PUNTUACION
        // -----------------
        puntuacionLabel = new JLabel("Puntuación Global: " + partida.getPuntuacionTotal());
        puntuacionLabel.setBounds(30, 30, 250, 40);
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        puntuacionLabel.setForeground(Color.WHITE);
        add(puntuacionLabel);

        // -----------------
        // BOTONES
        // -----------------
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

        // BOTÓN VOLVER
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setBounds(30, 700, 200, 50);
        add(botonVolver);
        botonVolver.addActionListener((ActionEvent e) -> {
            javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new PanelMenu(partida));
                frame.revalidate();
                frame.repaint();
            }
        });

        // CARGAR PRIMERA PREGUNTA
        actualizarPregunta();
    }

    private void responder(int opcion) {
        boolean acierto = motor.comprobarRespuesta(opcion);

        if (acierto) {
            partida.sumarPuntos(1);
        }

        puntuacionLabel.setText("Puntuación Global: " + partida.getPuntuacionTotal());
        actualizarPregunta();
    }

    private void actualizarPregunta() {
        if (motor.hayPreguntas()) {
            Pregunta p = motor.getPreguntaActual();
            preguntaLabel.setText("<html><center>" + p.getPregunta() + "</center></html>");

            boton1.setText(p.getOpcion1());
            boton2.setText(p.getOpcion2());
            boton3.setText(p.getOpcion3());
            boton4.setText(p.getOpcion4());

            boton1.setVisible(true);
            boton2.setVisible(true);
            boton3.setVisible(true);
            boton4.setVisible(true);

        } else {
            preguntaLabel.setText("Juego terminado. Puntuación Global: " + partida.getPuntuacionTotal());

            boton1.setVisible(false);
            boton2.setVisible(false);
            boton3.setVisible(false);
            boton4.setVisible(false);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fondo != null) {
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}