package view;

import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

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
		Programacion = crearBotonImagen("/resources/Programacion.png", 200, 150);
		add(Programacion);
		Programacion.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelProgramacion(partida));
		});

		// BOTON ENTORNOS
		EntornosDesarrollo = crearBotonImagen("/resources/Entornos.png", 600, 150);
		add(EntornosDesarrollo);
		EntornosDesarrollo.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelEntornos(partida));
		});

		// BOTON LENGUAJE
		LenguajeMarca = crearBotonImagen("/resources/Lenguajedemarca.png", 200, 300);
		add(LenguajeMarca);
		LenguajeMarca.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelLenguajeMarca(partida));
		});

		// BOTON DIGITALIZACION
		Digitalizacion = crearBotonImagen("/resources/Digitalizacion.png", 600, 300);
		add(Digitalizacion);
		Digitalizacion.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelDigitalizacion(partida));
		});

		// BOTON SISTEMA
		SistemaInformatico = crearBotonImagen("/resources/Sistemas.png", 200, 450);
		add(SistemaInformatico);
		SistemaInformatico.addActionListener((ActionEvent e) -> {
			cambiarPanel(new PanelSistemas(partida));
		});

		// BOTON Sostenibilidad
		Sostenibilidad = crearBotonImagen("/resources/Sostenibilidad.png", 600, 450);
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
			Image img = icon.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
			JButton boton = new JButton(new ImageIcon(img));
			boton.setBounds(x, y, 200, 80);
			boton.setContentAreaFilled(false);
			boton.setBorderPainted(false);
			boton.setFocusPainted(false);
			return boton;
		}
		JButton botonFallback = new JButton(ruta);
		botonFallback.setBounds(x, y, 200, 80);
		return botonFallback;
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

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (fondo != null) {
			g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		}
	}
}