package vista;

import javax.swing.*;
import java.awt.*;

public class PanelCreditos extends JPanel {

    private JTextArea creditos;

    public PanelCreditos() {
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        // Crear JTextArea
        creditos = new JTextArea();
        creditos.setEditable(false); // No editable
        creditos.setLineWrap(true);  // Salto de línea automático
        creditos.setWrapStyleWord(true);
        creditos.setFont(new Font("Arial", Font.PLAIN, 16));
        creditos.setForeground(Color.WHITE);
        creditos.setBackground(Color.DARK_GRAY);

        // Texto de créditos
        creditos.setText(
            "CREDITOS DEL JUEGO\n\n" +
            "Desarrollador: Juan Manuel Francisco Mendoza\n José Ramón Neira Vega\n José\n " +
            "Diseño Gráfico: Juan Manuel Francisco Mendoza\\n José Ramón Neira Vega\\n José Fernández Díaz   \"" +
            "Música de fondo: CancionFondo.wav\n" +
            "Idea original: Proyecto Educativo\n" +
            "Gracias por jugar nuestro juego!"
        );

        // Scroll para el JTextArea
        JScrollPane scroll = new JScrollPane(creditos);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        add(scroll, BorderLayout.CENTER);
    }
}