package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TutorialDialog extends JDialog {

    public TutorialDialog(JFrame owner) {
        super(owner, "Tutorial", true); // Modal para bloquear ventana padre
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(owner);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // X deshabilitada

        // Texto explicativo del tutorial
        JTextArea texto = new JTextArea(
                "Bienvenido al juego!\n\n" +
                        "Botones del menú:\n" +
                        "- Jugar: Inicia el juego.\n" +
                        "- Categorías: Elegir preguntas por categoría.\n" +
                        "- Ajustes: Activar/desactivar sonido y efectos.\n\n" +
                        "Para cerrar esta ventana usa la tecla ESC, el juego se cierra con X pero los paneles se cierra con esc.");
        texto.setBounds(20, 20, 700, 500);
        texto.setWrapStyleWord(true);
        texto.setLineWrap(true);
        texto.setEditable(false);
        texto.setFocusable(false);
        add(texto);

        // Botón Siguiente
        JButton siguiente = new JButton("Siguiente");
        siguiente.setBounds(180, 300, 120, 40);
        add(siguiente);

        // Cierre con ESC
        getRootPane().registerKeyboardAction(
                e -> dispose(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        // Acción del botón siguiente
        siguiente.addActionListener(e -> dispose());
    }
}