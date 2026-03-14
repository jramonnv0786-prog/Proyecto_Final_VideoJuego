package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class PanelCategorias extends JPanel {

    private model.Partida partida;
    private Image fondo;

    private static final int BOTON_ANCHO = 150;
private static final int BOTON_ALTO = 100;

    public PanelCategorias(model.Partida partida) {
        this.partida = partida;

        // Cargar imagen de fondo
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondoMenu.png"));
        fondo = icon.getImage();

        setLayout(new BorderLayout());

        // Panel contenedor centrado
        JPanel panelCentral = new JPanel();
        panelCentral.setOpaque(false); // Para que se vea el fondo
        panelCentral.setLayout(new GridBagLayout());
        add(panelCentral, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        // Incrementamos el margen superior a 80
        gbc.insets = new Insets(50, 30, 20, 30); // top, left, bottom, right
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Array con nombres de categorías y rutas de imagen
        String[][] categorias = {
                { "Programación", "/resources/Programacion.png" },
                { "Entornos", "/resources/Entornos.png" },
                { "Lenguaje de Marca", "/resources/Lenguajedemarca.png" },
                { "Digitalización", "/resources/Digitalizacion.png" },
                { "Sistemas", "/resources/Sistemas.png" },
                { "Sostenibilidad", "/resources/Sostenibilidad.png" }
        };

        for (int i = 0; i < categorias.length; i++) {
            String nombre = categorias[i][0];
            String ruta = categorias[i][1];

            // Crear botón con imagen
            JButton boton = crearBotonImagen(ruta);
            // Pie de foto
            JLabel label = new JLabel(nombre, SwingConstants.CENTER);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Arial", Font.BOLD, 16));

            // Panel que contiene botón + label
            JPanel panelBoton = new JPanel();
            panelBoton.setOpaque(false);
            panelBoton.setLayout(new BorderLayout());
            panelBoton.add(boton, BorderLayout.CENTER);
            panelBoton.add(label, BorderLayout.SOUTH);

            // Añadir al panel central
            panelCentral.add(panelBoton, gbc);

            // Manejo de columnas
            if (gbc.gridx == 0) {
                gbc.gridx = 1; // siguiente columna
            } else {
                gbc.gridx = 0;
                gbc.gridy++; // nueva fila
            }

            // ActionListener para cada botón
            final int index = i; // para usar dentro de lambda
            boton.addActionListener((ActionEvent e) -> {
                cambiarPanelPorIndice(index);
            });
        }

        // BOTON VOLVER
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setPreferredSize(new Dimension(200, 50));
        botonVolver.addActionListener((ActionEvent e) -> cambiarPanel(new PanelMenu(partida)));
        JPanel panelVolver = new JPanel();
        panelVolver.setOpaque(false);
        panelVolver.add(botonVolver);
        add(panelVolver, BorderLayout.SOUTH);
    }

    private JButton crearBotonImagen(String rutaImagen) {
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
        if (icon.getImage() == null) {
            System.err.println("No se encontró la imagen: " + rutaImagen);
            return new JButton();
        }

        Image imgEscalada = icon.getImage().getScaledInstance(BOTON_ANCHO, BOTON_ALTO, Image.SCALE_SMOOTH);
        JButton boton = new JButton(new ImageIcon(imgEscalada));
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(true);
        boton.setFocusPainted(false);
        return boton;
    }

    private void cambiarPanelPorIndice(int index) {
        switch (index) {
            case 0 -> cambiarPanel(new PanelProgramacion(partida));
            case 1 -> cambiarPanel(new PanelEntornos(partida));
            case 2 -> cambiarPanel(new PanelLenguajeMarca(partida));
            case 3 -> cambiarPanel(new PanelDigitalizacion(partida));
            case 4 -> cambiarPanel(new PanelSistemas(partida));
            case 5 -> cambiarPanel(new PanelSostenibilidad(partida));
        }
    }

    private void cambiarPanel(JPanel nuevoPanel) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame == null)
            return;

        Container content = frame.getContentPane();
        content.removeAll();
        content.add(nuevoPanel);
        content.revalidate();
        content.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fondo != null) {
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}