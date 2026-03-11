package view;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	private JFrame ventana;

	public Ventana() {

		setTitle("MINIJUEGOS");

		// Ajustar el tamaño de la ventana
		setSize(1000, 800);

		// Cerrar todos los procesos
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Posicionarlo en mitad de la pantalla
		setLocationRelativeTo(null);

		setResizable(false);

		String name = javax.swing.JOptionPane.showInputDialog(this, "Introduce tu nombre:", "Nuevo Jugador", javax.swing.JOptionPane.QUESTION_MESSAGE);
		if (name == null || name.trim().isEmpty()) {
			name = "Jugador 1";
		}
		model.Partida partida = new model.Partida(name);

		PanelMenu panel = new PanelMenu(partida);
		add(panel);

		setVisible(true);

	}
}
