package view;

import controller.MotorJuego;
import model.Partida;
import util.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelCategorias extends JPanel {

    private Partida partida;
    private Image fondo;

    public PanelCategorias(Partida partida) {
        this.partida = partida;

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // Fondo
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/MenuCategorias.jpeg"));
        fondo = icon.getImage();

        // Música de fondo (misma que el menú)
        SoundManager.getInstancia().reproducirMusica("/resources/AudioPrincipal.wav");

        // Array de imágenes y nombres
        String[] imagenes = {
                "/resources/programacion.png",
                "/resources/entornos.png",
                "/resources/lenguajedemarca.png",
                "/resources/digitalizacion.png",
                "/resources/sistemas.png",
                "/resources/sostenibilidad.png"
        };

        String[] nombres = {
                "Programación",
                "Entornos de Desarrollo",
                "Lenguaje de Marca",
                "Digitalización",
                "Sistemas Informático",
                "Sostenibilidad"
        };

        String[] claves = {
                "programacion",
                "entornos",
                "lenguaje de marca",
                "digitalizacion",
                "sistemas",
                "sostenibilidad"
        };

        int xInicial = 170, yInicial = 160;
        int ancho = 225, alto = 125;
        int separacionX = 400, separacionY = 180, margenTexto = 5;

        for (int i = 0; i < imagenes.length; i++) {
            int fila = i / 2;
            int col = i % 2;
            int x = xInicial + col * separacionX;
            int y = yInicial + fila * separacionY;
            addBotonCategoria(imagenes[i], nombres[i], claves[i], x, y, ancho, alto, margenTexto);
        }

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
    }

    private void addBotonCategoria(String rutaImagen, String nombreVisible, String claveCategoria,
            int x, int y, int ancho, int alto, int margenTexto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
        Image img = icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        JButton boton = new JButton(new ImageIcon(img));
        boton.setBounds(x, y, ancho, alto);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        add(boton);

        JLabel etiqueta = new JLabel(nombreVisible, SwingConstants.CENTER);
        etiqueta.setBounds(x, y + alto + margenTexto, ancho, 25);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        add(etiqueta);

        boton.addActionListener((ActionEvent e) -> {

            MotorJuego motor = new MotorJuego(claveCategoria);
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new PanelJuego(partida, motor));
                frame.revalidate();
                frame.repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fondo != null)
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}