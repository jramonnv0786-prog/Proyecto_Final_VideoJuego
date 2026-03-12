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
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/fondoMenu.png.png"));
		fondo = icon.getImage();

		setLayout(null);
		setBounds(0, 0, 1000, 800);

		// BOTON PROGRAMACION
		ImageIcon iconProgramacion = new ImageIcon(getClass().getResource("/resources/Programacion.png.png"));
		Image imgProgramacion = iconProgramacion.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
		Programacion = new JButton(new ImageIcon(imgProgramacion));
		Programacion.setBounds(200, 150, 200, 80);
		// Opcional: hacer que el botón se vea solo como la imagen
		Programacion.setContentAreaFilled(false);
		Programacion.setBorderPainted(false);
		Programacion.setFocusPainted(false);
		add(Programacion);

		Programacion.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Programación");
			// Cambiar la vista al panel de programación
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelProgramacion(partida));
				ventana.revalidate();
				ventana.repaint();
			}
		});

		// BOTON ENTORNOS
		ImageIcon iconEntornos = new ImageIcon(getClass().getResource("/resources/Entornos.png.png"));
		Image imgEntornos = iconEntornos.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
		EntornosDesarrollo = new JButton(new ImageIcon(imgEntornos));
		EntornosDesarrollo.setBounds(600, 150, 200, 80);
		EntornosDesarrollo.setContentAreaFilled(false);
		EntornosDesarrollo.setBorderPainted(false);
		EntornosDesarrollo.setFocusPainted(false);
		add(EntornosDesarrollo);

		EntornosDesarrollo.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Entornos de Desarrollo");
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelEntornos(partida));
				ventana.revalidate();
				ventana.repaint();
			}
		});

		// BOTON LENGUAJE
		ImageIcon iconLenguaje = new ImageIcon(getClass().getResource("/resources/Lenguajedemarca.png.png"));
		Image imgLenguaje = iconLenguaje.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
		LenguajeMarca = new JButton(new ImageIcon(imgLenguaje));
		LenguajeMarca.setBounds(200, 300, 200, 80);
		LenguajeMarca.setContentAreaFilled(false);
		LenguajeMarca.setBorderPainted(false);
		LenguajeMarca.setFocusPainted(false);
		add(LenguajeMarca);

		LenguajeMarca.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Lenguaje de Marcas");
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelLenguajeMarca(partida));
				ventana.revalidate();
				ventana.repaint();
			}
		});

		// BOTON DIGITALIZACION
		ImageIcon iconDigitalizacion = new ImageIcon(getClass().getResource("/resources/Digitalizacion.png.png"));
		Image imgDigitalizacion = iconDigitalizacion.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
		Digitalizacion = new JButton(new ImageIcon(imgDigitalizacion));
		Digitalizacion.setBounds(600, 300, 200, 80);
		Digitalizacion.setContentAreaFilled(false);
		Digitalizacion.setBorderPainted(false);
		Digitalizacion.setFocusPainted(false);
		add(Digitalizacion);

		Digitalizacion.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Digitalización");
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelDigitalizacion(partida));
				ventana.revalidate();
				ventana.repaint();
			}
		});

		// BOTON SISTEMA
		ImageIcon iconSistema = new ImageIcon(getClass().getResource("/resources/Sistemas.png.png"));
		Image imgSistema = iconSistema.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
		SistemaInformatico = new JButton(new ImageIcon(imgSistema));
		SistemaInformatico.setBounds(200, 450, 200, 80);
		SistemaInformatico.setContentAreaFilled(false);
		SistemaInformatico.setBorderPainted(false);
		SistemaInformatico.setFocusPainted(false);
		add(SistemaInformatico);

		SistemaInformatico.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Sistema Informatico");
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
				ventana.add(new PanelSistemas(partida));
				ventana.revalidate();
				ventana.repaint();
			}
		});

		// BOTON Sostenibilidad
		ImageIcon iconSostenibilidad = new ImageIcon(getClass().getResource("/resources/Sostenibilidad.png.png"));
		Image imgSostenibilidad = iconSostenibilidad.getImage().getScaledInstance(200, 80, Image.SCALE_SMOOTH);
		Sostenibilidad = new JButton(new ImageIcon(imgSostenibilidad));
		Sostenibilidad.setBounds(600, 450, 200, 80);
		Sostenibilidad.setContentAreaFilled(false);
		Sostenibilidad.setBorderPainted(false);
		Sostenibilidad.setFocusPainted(false);
		add(Sostenibilidad);

		Sostenibilidad.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Sostenibilidad");
			javax.swing.JFrame ventana = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
			if (ventana != null) {
				ventana.getContentPane().removeAll();
                ventana.add(new PanelSostenibilidad(partida)); // Agregando el Panel Sostenibilidad
				ventana.revalidate();
				ventana.repaint();
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Dibujamos la imagen asegurando que ocupe todo el panel
		if (fondo != null) {
			g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		}
	}
}