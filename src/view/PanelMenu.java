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
import javax.swing.JPanel;

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

		// Cargar la imagen original
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondo.png.png"));
		fondo = icon.getImage();

		// Botón encima de la imagen
		boton = new JButton();
		boton.setBounds(277, 215, 440, 138);
		boton.setBorderPainted(true);
		boton.setContentAreaFilled(false);
		boton.setOpaque(false);
		add(boton);

		boton.addActionListener((ActionEvent e) -> {
			System.out.println("Cargando panel");

			PanelJuego preguntados = new PanelJuego(partida);
			preguntados.setBounds(0, 0, getWidth(), getHeight());

			add(preguntados);
			revalidate();
			repaint();
		});

		boton2 = new JButton();
		boton2.setBounds(277, 380, 440, 138);
		boton2.setContentAreaFilled(false);
		boton2.setBorderPainted(false);
		add(boton2);

		boton2.addActionListener((ActionEvent e) -> {
			System.out.println("Cargando panel 2");
			PanelCategorias categorias = new PanelCategorias(partida);
			categorias.setBounds(0, 0, getWidth(), getHeight());

			add(categorias);
			revalidate();
			repaint();
		});

		// Botón encima de la imagen
		boton3 = new JButton();
		boton3.setBounds(277, 500, 440, 138);
		boton3.setBorderPainted(false);
		boton3.setContentAreaFilled(false);
		add(boton3);

		boton3.addActionListener((ActionEvent e) -> {
			System.out.println("Cargando panel 3");
			PanelCreditos creditos = new PanelCreditos();
			creditos.setBounds(0, 0, 1000, 800); // tamaño de tu ventana
			add(creditos);

			revalidate();
			repaint();
		});

		iniciarMusica("/resources/CancionFondo.wav");

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g); // pinta primero el panel
		Dimension dimension = this.getSize();

		// Dibujar la imagen escalada suavemente
		g.drawImage(fondo, 0, 0, dimension.width, dimension.height, this);

		// Pintar los botones encima
		super.paintChildren(g);

	}

	// Método para iniciar música de fondo en bucle
	public void iniciarMusica(String ruta) {
		try {
			InputStream audioSrc = getClass().getResourceAsStream("/resource/CancionFondo.wav");
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
