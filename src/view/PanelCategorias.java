package view;

import controller.MotorJuego;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import model.Partida;

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

        // Array de imágenes y claves de categorías correctas
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

        // Claves que coinciden con BancoPreguntas
        String[] claves = {
                "programacion",
                "entornos",
                "lenguaje de marca",
                "digitalizacion",
                "sistemas",
                "sostenibilidad"
        };

        // Distribución automática: 2 columnas, 3 filas
        int xInicial = 170;
        int yInicial = 160;
        int ancho = 225;
        int alto = 125;
        int separacionX = 400; // espacio horizontal entre columnas
        int separacionY = 180; // espacio vertical entre filas
        int margenTexto = 5; // espacio entre botón y etiqueta

        for (int i = 0; i < imagenes.length; i++) {
            int fila = i / 2;
            int col = i % 2;
            int x = xInicial + col * separacionX;
            int y = yInicial + fila * separacionY;

            addBotonCategoria(imagenes[i], nombres[i], claves[i], x, y, ancho, alto, margenTexto);
        }

        // Botón Volver
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setBounds(30, 700, 200, 50);
        add(botonVolver);
        botonVolver.addActionListener((ActionEvent e) -> {
            // Reiniciar puntuación
            partida.reiniciarPuntuacion();

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
        // Crear botón con imagen
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
        Image img = icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        JButton boton = new JButton(new ImageIcon(img));
        boton.setBounds(x, y, ancho, alto);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        add(boton);

        // Crear etiqueta debajo con el nombre visible
        JLabel etiqueta = new JLabel(nombreVisible, SwingConstants.CENTER);
        etiqueta.setBounds(x, y + alto + margenTexto, ancho, 25);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        add(etiqueta);

        // Acción del botón
        boton.addActionListener((ActionEvent e) -> {
            MotorJuego motor = new MotorJuego(claveCategoria); // clave correcta
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