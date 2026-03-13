package view;

import controller.MotorSistemas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.Pregunta;

public class PanelSistemas extends JPanel {

    private JLabel tituloLabel;
    private JLabel preguntaLabel;
    private JLabel puntuacionLabel;

    private JButton boton1, boton2, boton3, boton4, botonVolver;

    private MotorSistemas motor;
    private model.Partida partida;
    private Image fondo;

    public PanelSistemas(model.Partida partida) {
        this.partida = partida;

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // Cargar imagen de fondo directamente
        fondo = new ImageIcon(getClass().getResource("/resources/fondoPreguntas.png")).getImage();

        motor = new MotorSistemas();

        // Título de la categoría
        tituloLabel = new JLabel("SISTEMAS INFORMÁTICOS");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 32));
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setHorizontalAlignment(JLabel.CENTER);
        tituloLabel.setBounds(200, 40, 600, 50);
        add(tituloLabel);

        // Puntuación global
        puntuacionLabel = new JLabel("Puntuación Global: " + partida.getPuntuacionTotal());
        puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        puntuacionLabel.setForeground(Color.WHITE);
        puntuacionLabel.setBounds(30, 30, 250, 40);
        add(puntuacionLabel);

        // Pregunta
        preguntaLabel = new JLabel("Cargando pregunta...");
        preguntaLabel.setFont(new Font("Arial", Font.PLAIN, 22));
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setHorizontalAlignment(JLabel.CENTER);
        preguntaLabel.setBounds(100, 150, 800, 100);
        add(preguntaLabel);

        // Botones de respuestas
        boton1 = crearBoton(200, 300, 250, 60, 1);
        boton2 = crearBoton(550, 300, 250, 60, 2);
        boton3 = crearBoton(200, 400, 250, 60, 3);
        boton4 = crearBoton(550, 400, 250, 60, 4);

        // Botón Volver
        botonVolver = new JButton("Volver a Categorías");
        botonVolver.setBounds(30, 700, 200, 50);
        add(botonVolver);
        botonVolver.addActionListener(e -> {
            JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (ventana != null) {
                ventana.getContentPane().removeAll();
                ventana.add(new PanelCategorias(partida));
                ventana.revalidate();
                ventana.repaint();
            }
        });

        // Cargar la primera pregunta
        actualizarPregunta();
    }

    // Método auxiliar para crear botones de respuesta
    private JButton crearBoton(int x, int y, int width, int height, int opcion) {
        JButton boton = new JButton();
        boton.setBounds(x, y, width, height);
        add(boton);
        boton.addActionListener(e -> responder(opcion));
        return boton;
    }

    private void responder(int opcion) {
        if (motor.comprobarRespuesta(opcion)) {
            partida.sumarPuntos(1);
            System.out.println("¡Acierto en Sistemas! Puntos globales: " + partida.getPuntuacionTotal());
        }
        puntuacionLabel.setText("Puntuación Global: " + partida.getPuntuacionTotal());
        actualizarPregunta();
    }

    private void actualizarPregunta() {
        if (motor.hayPreguntas()) {
            Pregunta p = motor.getPreguntaActual();
            preguntaLabel.setText("<html>" + p.getPregunta() + "</html>");
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}