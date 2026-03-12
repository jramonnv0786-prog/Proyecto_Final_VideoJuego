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
			System.out.println("Cargando panel Juego");
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelJuego(this.partida));
				ventana.revalidate();
				ventana.repaint();
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
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelCategorias(this.partida));
				ventana.revalidate();
				ventana.repaint();
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
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelCreditos());
				ventana.revalidate();
				ventana.repaint();
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

	// Método para iniciar música de fondo en bucle
	public void iniciarMusica(String ruta) {
		try {
			// Nota: la ruta en el getResourceAsStream debe coincidir con la ubicación real
			InputStream audioSrc = getClass().getResourceAsStream(ruta);
            if (audioSrc == null) {
                // Intento fallback si la ruta tiene un error de tipografía (visto /resource vs /resources)
                audioSrc = getClass().getResourceAsStream("/resources/CancionFondo.wav");
            }
            
            if (audioSrc != null) {
                InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
                clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.loop(Clip.LOOP_CONTINUOUSLY); // bucle infinito
                clip.start();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
