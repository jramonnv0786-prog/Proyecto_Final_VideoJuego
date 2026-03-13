package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelMenu extends JPanel {

    private final model.Partida partida;
    private final Image fondo;
    private Clip clip;

    public PanelMenu(model.Partida partida) {
        this.partida = partida;

        setLayout(null);
        fondo = new ImageIcon(getClass().getResource("/resources/fondo.png")).getImage();

        crearEtiquetaJugador();
        crearBotones();
        iniciarMusica("/resources/CancionFondo.wav");
    }

    private void crearEtiquetaJugador() {
        JLabel labelNombre = new JLabel("Jugador: " + partida.getNombreJugador());
        labelNombre.setBounds(20, 20, 300, 30);
        labelNombre.setForeground(Color.WHITE);
        labelNombre.setFont(new Font("Arial", Font.BOLD, 20));
        add(labelNombre);
    }

    private void crearBotones() {
        // Botón Jugar
        addBoton(277, 215, 440, 138, e -> mostrarPanelJuego());

        // Botón Categorías
        addBoton(277, 398, 440, 138, e -> mostrarPanelCategorias());

        // Botón Créditos
        addBoton(277, 580, 440, 138, e -> mostrarPanelCreditos());
    }

    private void addBoton(int x, int y, int width, int height, ActionListener accion) {
        JButton boton = new JButton();
        boton.setBounds(x, y, width, height);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(true);
        boton.setOpaque(false);
        boton.addActionListener(accion);
        add(boton);
    }

    private void mostrarPanelJuego() {
        String[] opciones = { "Fácil (10 preg.)", "Medio (20 preg.)", "Difícil (Todas)" };
        int seleccion = JOptionPane.showOptionDialog(
                this,
                "Elige la dificultad del juego:",
                "Selección de Dificultad",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion != -1) {
            JFrame ventanaJuego = new JFrame("Juego");
            ventanaJuego.setSize(1000, 800);
            ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaJuego.setLocationRelativeTo(null);
            ventanaJuego.add(new PanelJuego(partida, seleccion));
            ventanaJuego.setVisible(true);

            // Cerrar menú actual
            JFrame menu = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
            if (menu != null) menu.dispose();
        }
    }

    private void mostrarPanelCategorias() {
        JFrame ventana = new JFrame("Categorías");
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.add(new PanelCategorias(partida));
        ventana.setVisible(true);

        JFrame menu = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (menu != null) menu.dispose();
    }

    private void mostrarPanelCreditos() {
        JFrame ventana = new JFrame("Créditos");
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.add(new PanelCreditos());
        ventana.setVisible(true);

        JFrame menu = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (menu != null) menu.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }

    public void iniciarMusica(String ruta) {
        try {
            InputStream audioSrc = getClass().getResourceAsStream(ruta);
            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void detenerMusica() {
        if (clip != null && clip.isRunning()) clip.stop();
    }
}