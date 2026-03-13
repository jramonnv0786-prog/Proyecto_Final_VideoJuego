package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelCategorias extends JPanel {

	private JButton Programacion;
	private JButton EntornosDesarrollo;
	private JButton LenguajeMarca;
	private JButton Digitalizacion;
	private JButton SistemaInformatico;
	private JButton Sostenibilidad;

	private model.Partida partida;
	private Image fondo;

	public PanelCategorias(model.Partida partida) {
		this.partida = partida;

		// Cargar la imagen de fondo
		java.net.URL urlFondo = getClass().getResource("/resources/fondoMenu.png");
		if (urlFondo != null) {
			ImageIcon icon = new ImageIcon(urlFondo);
			fondo = icon.getImage();
		}

		setLayout(null);
		setBounds(0, 0, 1000, 800);

		// BOTON PROGRAMACION
		Programacion = crearBotonImagen("/resources/Programacion.png", 200, 175);
		add(Programacion);
		Programacion.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelProgramacion(partida));
		});

		// BOTON ENTORNOS
		EntornosDesarrollo = crearBotonImagen("/resources/Entornos.png", 600, 175);
		add(EntornosDesarrollo);
		EntornosDesarrollo.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelEntornos(partida));
		});

		// BOTON LENGUAJE
		LenguajeMarca = crearBotonImagen("/resources/Lenguajedemarca.png", 200, 350);
		add(LenguajeMarca);
		LenguajeMarca.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelLenguajeMarca(partida));
		});

		// BOTON DIGITALIZACION
		Digitalizacion = crearBotonImagen("/resources/Digitalizacion.png", 600, 350);
		add(Digitalizacion);
		Digitalizacion.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelDigitalizacion(partida));
		});

		// BOTON SISTEMA
		SistemaInformatico = crearBotonImagen("/resources/Sistemas.png", 200, 525);
		add(SistemaInformatico);
		SistemaInformatico.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelSistemas(partida));
		});

		// BOTON Sostenibilidad
		Sostenibilidad = crearBotonImagen("/resources/Sostenibilidad.png", 600, 525);
		add(Sostenibilidad);
		Sostenibilidad.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelSostenibilidad(partida));
		});

		// BOTON VOLVER
		JButton botonVolver = new JButton("Volver al Menú");
		botonVolver.setBounds(30, 700, 200, 50);
		add(botonVolver);
		botonVolver.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelMenu(partida));
		});
	}

	private JButton crearBotonImagen(String ruta, int x, int y) {
		java.net.URL url = getClass().getResource(ruta);
		if (url != null) {
			ImageIcon icon = new ImageIcon(url);
			Image img = icon.getImage().getScaledInstance(200, 125, Image.SCALE_SMOOTH);
			JButton boton = new JButton(new ImageIcon(img));
			boton.setBounds(x, y, 200, 125);
			boton.setContentAreaFilled(false);
			boton.setBorderPainted(true);
			boton.setFocusPainted(false);
			return boton;
		}
		JButton botonFallback = new JButton(ruta);
		botonFallback.setBounds(x, y, 200, 125);
		return botonFallback;
	}

	private JLabel crearEtiqueta(String texto, int x, int y) {
		JLabel etiqueta = new JLabel(texto, SwingConstants.CENTER);
		etiqueta.setBounds(x, y, 200, 30);
		etiqueta.setForeground(Color.WHITE); // Color blanco
		etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
		return etiqueta;
	}

	private void cambiarPanel(JPanel panel) {
		javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
		if (ventana != null) {
			ventana.getContentPane().removeAll();
			ventana.getContentPane().add(panel);
			ventana.revalidate();
			ventana.repaint();
		}
	}

	@Override // Pintar el fondo
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (fondo != null) {
			g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		}
	}
}