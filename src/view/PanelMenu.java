package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelMenu extends JPanel {

	private JButton boton;
	private JButton boton2;
	private JButton boton3;

	private Image fondo;
	private Clip clip; // clip de música

	private model.Partida partida;

	public PanelMenu(model.Partida partida) {
		this.partida = partida;

		setLayout(null); // Permite posiciones absolutas

		// Etiqueta para mostrar el nombre del jugador
		JLabel labelNombre = new JLabel("Jugador: " + partida.getNombreJugador());
		labelNombre.setBounds(20, 20, 300, 30);
		labelNombre.setForeground(Color.WHITE);
		labelNombre.setFont(new Font("Arial", Font.BOLD, 20));
		add(labelNombre);

		// Cargar la imagen original
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondo.png"));
		fondo = icon.getImage();

		// Botón encima de la imagen
		boton = new JButton();
		boton.setBounds(277, 215, 440, 138);
		boton.setBorderPainted(true);
		boton.setContentAreaFilled(false);
		boton.setOpaque(false);
		add(boton);

		boton.addActionListener((ActionEvent e) -> {
			System.out.println("Cargando panel Juego con selección de dificultad");

			String[] opciones = { "Fácil (10 preg.)", "Medio (20 preg.)", "Difícil (Todas)" };
			int seleccion = javax.swing.JOptionPane.showOptionDialog(
					this,
					"Elige la dificultad del juego:",
					"Selección de Dificultad",
					javax.swing.JOptionPane.DEFAULT_OPTION,
					javax.swing.JOptionPane.QUESTION_MESSAGE,
					null,
					opciones,
					opciones[0]);

			if (seleccion != -1) { // Si no cerró la ventana
				javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
				if (frame != null) {
					frame.getContentPane().removeAll();
					frame.getContentPane().add(new PanelJuego(partida, seleccion));
					frame.revalidate();
					frame.repaint();
				}
			}
		});

		boton2 = new JButton();
		boton2.setBounds(277, 398, 440, 138);
		boton2.setContentAreaFilled(false);
		boton2.setBorderPainted(true);
		boton2.setOpaque(false);
		add(boton2);

		boton2.addActionListener((ActionEvent e) -> {
			System.out.println("Cargando panel Categorías");
			javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(new PanelCategorias(partida));
				frame.revalidate();
				frame.repaint();
			}
		});

		// Botón encima de la imagen
		boton3 = new JButton();
		boton3.setBounds(277, 580, 440, 138);
		boton3.setContentAreaFilled(false);
		boton3.setBorderPainted(true);
		boton3.setOpaque(false);
		add(boton3);

		boton3.addActionListener((ActionEvent e) -> {
			System.out.println("Cargando panel Créditos");
			javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (frame != null) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(new PanelCreditos());
				frame.revalidate();
				frame.repaint();
			}
		});

		iniciarMusica("/resources/CancionFondo.wav");

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (fondo != null) {
			g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public void iniciarMusica(String ruta) {
		try {
			InputStream audioSrc = getClass().getResourceAsStream(ruta);
			InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY); // bucle infinito
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Método para detener la música
	private void detenerMusica() {
		if (clip != null && clip.isRunning()) {
			clip.stop();
		}
	}
}
