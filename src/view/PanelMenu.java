package view;

import model.Partida;
import controller.MotorJuego;
import util.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel {

	private JButton botonJugar, botonCategorias, botonAjustes;
	private Image fondo;
	private Partida partida;

	public PanelMenu(Partida partida) {
		this.partida = partida;
		setLayout(null);

		// Nombre del jugador
		JLabel labelNombre = new JLabel("Jugador: " + partida.getNombreJugador());
		labelNombre.setBounds(20, 20, 300, 30);
		labelNombre.setForeground(Color.WHITE);
		labelNombre.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelNombre);

		// Fondo
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondoMenu.jpg"));
		fondo = icon.getImage();

		// Botón Jugar
		botonJugar = crearBoton(277, 215, 440, 138);
		botonJugar.addActionListener((ActionEvent e) -> {
			if (partida.isEfectosActivos())
				SoundManager.getInstancia().reproducirEfecto("/resources/EfectoSonido.wav");

			// Parar música del menú antes de PanelJuego
			SoundManager.getInstancia().pararMusicaSecundaria();

			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				TutorialDialog tutorial = new TutorialDialog(frame);
				tutorial.setVisible(true);

				String[] opciones = { "Fácil (10 preg.)", "Medio (20 preg.)", "Difícil (Todas)" };
				int seleccion = JOptionPane.showOptionDialog(this,
						"Elige la dificultad del juego:",
						"Selección de Dificultad",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						opciones,
						opciones[0]);

				if (seleccion != -1) {
					MotorJuego motor = new MotorJuego(seleccion);
					frame.getContentPane().removeAll();
					partida.reiniciarPuntuacion();
					frame.getContentPane().add(new PanelJuego(partida, motor));
					frame.revalidate();
					frame.repaint();
				}
			}
		});

		// Botón Categorías
		botonCategorias = crearBoton(277, 398, 440, 138);
		botonCategorias.addActionListener((ActionEvent e) -> {
			if (partida.isEfectosActivos())
				SoundManager.getInstancia().reproducirEfecto("/resources/EfectoSonido.wav");

			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				frame.getContentPane().removeAll();
				partida.reiniciarPuntuacion();
				frame.getContentPane().add(new PanelCategorias(partida));
				frame.revalidate();
				frame.repaint();
			}
		});

		// Botón Ajustes
		botonAjustes = crearBoton(277, 580, 440, 138);
		botonAjustes.addActionListener((ActionEvent e) -> {
			if (partida.isEfectosActivos())
				SoundManager.getInstancia().reproducirEfecto("/resources/EfectoSonido.wav");

			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(new PanelAjustes(partida));
				frame.revalidate();
				frame.repaint();
			}
		});

		// Música del menú solo si está activada
		if (partida.isMusicaActiva())
			SoundManager.getInstancia().reproducirMusicaSecundaria("/resources/AudioPrincipal.wav");

		setupKeyBindings();
	}

	private void setupKeyBindings() {
		JRootPane rootPane = SwingUtilities.getRootPane(this);
		if (rootPane == null)
			return;

		InputMap im = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap am = rootPane.getActionMap();
		im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "cerrar");
		am.put("cerrar", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelMenu.this);
				if (frame != null)
					frame.dispose();
			}
		});
	}

	private JButton crearBoton(int x, int y, int ancho, int alto) {
		JButton boton = new JButton();
		boton.setBounds(x, y, ancho, alto);
		boton.setBorderPainted(true);
		boton.setContentAreaFilled(false);
		boton.setOpaque(false);
		add(boton);
		return boton;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (fondo != null)
			g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
	}
}