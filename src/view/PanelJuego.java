package view;

import controller.MotorJuego;
import model.Partida;
import model.Pregunta;
import util.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelJuego extends JPanel {

    private JLabel preguntaLabel;
    private JLabel puntuacionLabel;
    private JButton boton1, boton2, boton3, boton4;

    private MotorJuego motor;
    private Partida partida;
    private Image fondo;

    public PanelJuego(Partida partida, MotorJuego motor) {
        this.partida = partida;
        this.motor = motor;

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // Fondo
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondoPreguntas.png"));
        if (icon != null)
            fondo = icon.getImage();

        // Labels
        preguntaLabel = new JLabel("", SwingConstants.CENTER);
        preguntaLabel.setBounds(100, 150, 800, 100);
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(preguntaLabel);

        puntuacionLabel = new JLabel("Puntuación Global: " + partida.getPuntuacionTotal());
        puntuacionLabel.setBounds(30, 30, 300, 40);
        puntuacionLabel.setForeground(Color.WHITE);
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(puntuacionLabel);

        // Botones de respuestas
        boton1 = crearBoton(200, 270, 600, 60, 1);
        boton2 = crearBoton(200, 370, 600, 60, 2);
        boton3 = crearBoton(200, 470, 600, 60, 3);
        boton4 = crearBoton(200, 570, 600, 60, 4);

        // Botón Volver
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setBounds(30, 700, 200, 50);
        botonVolver.setBorderPainted(false);
        add(botonVolver);
        botonVolver.addActionListener((ActionEvent e) -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new PanelMenu(partida));

                // Volver a música del menú si está activada
                if (partida.isMusicaActiva()) {
                    SoundManager.getInstancia().pararMusicaPrincipal();
                    SoundManager.getInstancia().reproducirMusicaSecundaria("/resources/AudioPrincipal.wav");
                }

                frame.revalidate();
                frame.repaint();
            }
        });

        actualizarPregunta();

    }

    private JButton crearBoton(int x, int y, int ancho, int alto, int opcion) {
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);

        // Colores personalizados
        switch (opcion) {
            case 1 -> boton.setBackground(new Color(220, 120, 120));
            case 2 -> boton.setBackground(new Color(140, 200, 140));
            case 3 -> boton.setBackground(new Color(240, 190, 120));
            case 4 -> boton.setBackground(new Color(150, 200, 220));
        }
        boton.setForeground(Color.WHITE); // Texto blanco
        boton.setOpaque(true);
        boton.setBorderPainted(true);
        boton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 120), 2));
        boton.setFocusPainted(false);

        add(boton);
        boton.addActionListener((ActionEvent e) -> responder(opcion));
        return boton;
    }

    private void responder(int opcion) {
        boolean acierto = motor.comprobarRespuesta(opcion);
        if (acierto)
            partida.sumarPuntos(1);

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
        if (fondo != null)
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}