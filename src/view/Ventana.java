package view;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	private JFrame ventana;

	public Ventana() {

		setTitle("TRIVIALDAW");

		// Ajustar el tamaño de la ventana
		setSize(1000, 800);

		// Cerrar todos los procesos
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Posicionarlo en mitad de la pantalla
		setLocationRelativeTo(null);

		setResizable(false);

		String name = "";
		boolean nombreValido = false;

		while (!nombreValido) {
			name = javax.swing.JOptionPane.showInputDialog(this, "Introduce tu nombre:", "Nuevo Jugador",
					javax.swing.JOptionPane.QUESTION_MESSAGE);

			if (name == null) {
				// El usuario pulsó cancelar
				System.exit(0);
			}

			if (name.trim().isEmpty()) {
				javax.swing.JOptionPane.showMessageDialog(this, "El nombre de usuario es obligatorio.", "Error",
						javax.swing.JOptionPane.WARNING_MESSAGE);
			} else {
				nombreValido = true;
			}
		}

		model.Partida partida = new model.Partida(name.trim());

		PanelMenu panel = new PanelMenu(partida);
		add(panel);

		setVisible(true);

	}
}
