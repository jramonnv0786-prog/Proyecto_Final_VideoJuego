package view;

import controller.MotorJuego;
import model.Partida;
import model.Pregunta;

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

    // PanelJuego recibe MotorJuego ya creado
    public PanelJuego(Partida partida, MotorJuego motor) {
        this.partida = partida;
        this.motor = motor;

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // Fondo
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondoPreguntas.png"));
        if (icon != null)
            fondo = icon.getImage();

        // Label de pregunta
        preguntaLabel = new JLabel("", SwingConstants.CENTER);
        preguntaLabel.setBounds(100, 150, 800, 100);
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(preguntaLabel);

        // Label puntuación
        puntuacionLabel = new JLabel("Puntuación Global: " + partida.getPuntuacionTotal());
        puntuacionLabel.setBounds(30, 30, 300, 40);
        puntuacionLabel.setForeground(Color.WHITE);
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(puntuacionLabel);

        // Botones de respuestas
        boton1 = crearBoton(200, 300, 250, 60, 1);
        boton2 = crearBoton(550, 300, 250, 60, 2);
        boton3 = crearBoton(200, 400, 250, 60, 3);
        boton4 = crearBoton(550, 400, 250, 60, 4);

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

    private JButton crearBoton(int x, int y, int ancho, int alto, int opcion) {
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
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