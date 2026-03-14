package view;

import model.Partida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelAjustes extends JPanel {

    private Partida partida;

    private JCheckBox cbMusica;
    private JCheckBox cbEfectos;

    public PanelAjustes(Partida partida) {
        this.partida = partida;
        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // Casilla Música
        cbMusica = new JCheckBox("Activar Música de Fondo");
        cbMusica.setBounds(350, 200, 300, 30);
        cbMusica.setSelected(partida.isMusicaActiva());
        cbMusica.setFont(new Font("Arial", Font.PLAIN, 18));
        add(cbMusica);

        // Casilla Efectos
        cbEfectos = new JCheckBox("Activar Efectos de Sonido");
        cbEfectos.setBounds(350, 250, 300, 30);
        cbEfectos.setSelected(partida.isEfectosActivos());
        cbEfectos.setFont(new Font("Arial", Font.PLAIN, 18));
        add(cbEfectos);

        // Botón Volver
        JButton botonVolver = new JButton("Volver al Menú");
        botonVolver.setBounds(350, 350, 200, 50);
        add(botonVolver);

        botonVolver.addActionListener((ActionEvent e) -> {
            // Guardar los ajustes en la partida
            partida.setMusicaActiva(cbMusica.isSelected());
            partida.setEfectosActivos(cbEfectos.isSelected());

            // Volver al menú principal
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            if (frame != null) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new PanelMenu(partida));
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}