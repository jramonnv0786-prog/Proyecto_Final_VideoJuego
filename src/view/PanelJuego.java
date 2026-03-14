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

        // Música
        SoundManager.getInstancia().reproducirMusica("/resources/AudioPrincipal.wav");

        // Pregunta
        preguntaLabel = new JLabel("", SwingConstants.CENTER);
        preguntaLabel.setBounds(100, 120, 800, 100);
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(preguntaLabel);

        // Puntuación
        puntuacionLabel = new JLabel("Puntuación Global: " + partida.getPuntuacionTotal());
        puntuacionLabel.setBounds(30, 30, 300, 40);
        puntuacionLabel.setForeground(Color.WHITE);
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(puntuacionLabel);

        // BOTONES DE RESPUESTA (horizontal y más anchos)

        boton1 = crearBoton(200, 270, 600, 60, 1, new Color(52, 152, 219)); // azul
        boton2 = crearBoton(200, 370, 600, 60, 2, new Color(231, 76, 60)); // rojo
        boton3 = crearBoton(200, 470, 600, 60, 3, new Color(46, 204, 113)); // verde
        boton4 = crearBoton(200, 570, 600, 60, 4, new Color(241, 196, 15)); // amarillo

        boton1.setForeground(Color.WHITE); // Texto blanco
        boton1.setOpaque(true);
        boton1.setBorderPainted(true);
        boton1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 120), 2));
        boton1.setFocusPainted(false);

        boton2.setForeground(Color.WHITE); // Texto blanco
        boton2.setOpaque(true);
        boton2.setBorderPainted(true);
        boton2.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 120), 2));
        boton2.setFocusPainted(false);

        boton3.setForeground(Color.WHITE); // Texto blanco
        boton3.setOpaque(true);
        boton3.setBorderPainted(true);
        boton3.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 120), 2));
        boton3.setFocusPainted(false);

        boton4.setForeground(Color.WHITE); // Texto blanco
        boton4.setOpaque(true);
        boton4.setBorderPainted(true);
        boton4.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 120), 2));
        boton4.setFocusPainted(false);

        // Botón volver
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setBounds(30, 700, 200, 50);
        add(botonVolver);

        botonVolver.addActionListener((ActionEvent e) -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new PanelMenu(partida));
                frame.revalidate();
                frame.repaint();
            }
        });

        actualizarPregunta();
    }

    private JButton crearBoton(int x, int y, int ancho, int alto, int opcion, Color color) {

        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);

        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 16));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);

        add(boton);

        boton.addActionListener((ActionEvent e) -> {
            SoundManager.getInstancia().reproducirEfecto("/resources/EfectoSonido.wav");
            responder(opcion);
        });

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
