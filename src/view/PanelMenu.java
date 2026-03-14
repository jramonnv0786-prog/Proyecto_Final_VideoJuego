package view;

import model.Partida;
import controller.MotorJuego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import javax.sound.sampled.*;

public class PanelMenu extends JPanel {

	private JButton botonJugar, botonCategorias, botonCreditos;
	private Image fondo;
	private Clip clip;
	private Partida partida;

	public PanelMenu(Partida partida) {
		this.partida = partida;
		setLayout(null);

		// Nombre jugador
		JLabel labelNombre = new JLabel("Jugador: " + partida.getNombreJugador());
		labelNombre.setBounds(20, 20, 300, 30);
		labelNombre.setForeground(Color.WHITE);
		labelNombre.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelNombre);

		// Fondo
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondo.png"));
		fondo = icon.getImage();

		// -----------------
		// Botón Jugar
		// -----------------
		botonJugar = crearBoton(277, 215, 440, 138);
		botonJugar.setBorderPainted(false);
		botonJugar.addActionListener((ActionEvent e) -> {
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
				JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
				if (frame != null) {
					frame.getContentPane().removeAll();
					// Antes de iniciar el juego, reiniciamos la puntuación
					partida.reiniciarPuntuacion();
					frame.getContentPane().add(new PanelJuego(partida, motor));
					frame.revalidate();
					frame.repaint();
				}
			}
		});

		// -----------------
		// Botón Categorías
		// -----------------
		botonCategorias = crearBoton(277, 398, 440, 138);
		botonCategorias.setBorderPainted(false);
		botonCategorias.addActionListener((ActionEvent e) -> {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				frame.getContentPane().removeAll();
				// Reiniciar puntuación antes de ir a categorías
				partida.reiniciarPuntuacion();
				frame.getContentPane().add(new PanelCategorias(partida));
				frame.revalidate();
				frame.repaint();
			}
		});

		// -----------------
		// Botón Créditos
		// -----------------
		botonCreditos = crearBoton(277, 580, 440, 138);
		botonCreditos.setBorderPainted(false);
		botonCreditos.addActionListener((ActionEvent e) -> {
			JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(new PanelCreditos());
				frame.revalidate();
				frame.repaint();
			}
		});

		// Música de fondo
		iniciarMusica("/resources/CancionFondo.wav");
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

	public void iniciarMusica(String ruta) {
		try {
			InputStream audioSrc = getClass().getResourceAsStream(ruta);
			InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void detenerMusica() {
		if (clip != null && clip.isRunning())
			clip.stop();
	}
}