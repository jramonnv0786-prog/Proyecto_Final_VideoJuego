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

public class PanelCategorias extends JPanel {

    private JButton Programacion;
    private JButton EntornosDesarrollo;
    private JButton LenguajeMarca;
    private JButton Digitalizacion;
    private JButton SistemaInformatico;
    private JButton Sostenibilidad;

    private model.Partida partida;
    private Image fondo;

    public PanelCategorias(model.Partida partida) {

        this.partida = partida;

        // Cargar imagen de fondo
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondoMenu.png"));
        fondo = icon.getImage();

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // BOTON PROGRAMACION
        Programacion = crearBotonImagen("/resources/Programacion.png", 200, 175);
        add(Programacion);
        Programacion.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelProgramacion(partida));
        });

        // BOTON ENTORNOS
        EntornosDesarrollo = crearBotonImagen("/resources/Entornos.png", 600, 175);
        add(EntornosDesarrollo);
        EntornosDesarrollo.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelEntornos(partida));
        });

        // BOTON LENGUAJE
        LenguajeMarca = crearBotonImagen("/resources/Lenguajedemarca.png", 200, 350);
        add(LenguajeMarca);
        LenguajeMarca.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelLenguajeMarca(partida));
        });

        // BOTON DIGITALIZACION
        Digitalizacion = crearBotonImagen("/resources/Digitalizacion.png", 600, 350);
        add(Digitalizacion);
        Digitalizacion.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelDigitalizacion(partida));
        });

        // BOTON SISTEMAS
        SistemaInformatico = crearBotonImagen("/resources/Sistemas.png", 200, 525);
        add(SistemaInformatico);
        SistemaInformatico.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelSistemas(partida));
        });

        // BOTON SOSTENIBILIDAD
        Sostenibilidad = crearBotonImagen("/resources/Sostenibilidad.png", 600, 525);
        add(Sostenibilidad);
        Sostenibilidad.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelSostenibilidad(partida));
        });

        // BOTON VOLVER
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setBounds(30, 700, 200, 50);
        add(botonVolver);

        botonVolver.addActionListener((ActionEvent e) -> {
            cambiarPanel(new PanelMenu(partida));
        });
    }

    private JButton crearBotonImagen(String ruta, int x, int y) {

        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));

        JButton boton = new JButton(icon);
        boton.setBounds(x, y, 200, 125);

        return boton;
    }

    private JLabel crearEtiqueta(String texto, int x, int y) {

        JLabel etiqueta = new JLabel(texto, SwingConstants.CENTER);
        etiqueta.setBounds(x, y, 200, 30);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));

        return etiqueta;
    }

    private void cambiarPanel(JPanel panel) {

        javax.swing.JFrame ventana =
                (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        if (ventana != null) {

            ventana.getContentPane().removeAll();
            ventana.getContentPane().add(panel);

            ventana.revalidate();
            ventana.repaint();
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