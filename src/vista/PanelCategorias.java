package vista;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCategorias extends JPanel {

    private JButton historia;
    private JButton arte;
    private JButton programacion;
    private JButton ciencia;
    private JButton geografia;
    private JButton deportes;

    public PanelCategorias() {

        setLayout(null);
        setBounds(0, 0, 1000, 800);

        // BOTON HISTORIA
        historia = new JButton("Historia");
        historia.setBounds(200, 150, 200, 80);
        add(historia);

        historia.addActionListener((ActionEvent e) -> {
            System.out.println("Categoria Historia");
        });

        // BOTON ARTE
        arte = new JButton("Arte");
        arte.setBounds(600, 150, 200, 80);
        add(arte);

        arte.addActionListener((ActionEvent e) -> {
            System.out.println("Categoria Arte");
        });

        // BOTON PROGRAMACION
        programacion = new JButton("Programacion");
        programacion.setBounds(200, 300, 200, 80);
        add(programacion);

        programacion.addActionListener((ActionEvent e) -> {
            System.out.println("Categoria Programacion");
        });

        // BOTON CIENCIA
        ciencia = new JButton("Ciencia");
        ciencia.setBounds(600, 300, 200, 80);
        add(ciencia);

        ciencia.addActionListener((ActionEvent e) -> {
            System.out.println("Categoria Ciencia");
        });

        // BOTON GEOGRAFIA
        geografia = new JButton("Geografia");
        geografia.setBounds(200, 450, 200, 80);
        add(geografia);

        geografia.addActionListener((ActionEvent e) -> {
            System.out.println("Categoria Geografia");
        });

        // BOTON DEPORTES
        deportes = new JButton("Deportes");
        deportes.setBounds(600, 450, 200, 80);
        add(deportes);

        deportes.addActionListener((ActionEvent e) -> {
            System.out.println("Categoria Deportes");
        });

    }
}