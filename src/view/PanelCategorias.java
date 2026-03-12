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
		Programacion = new JButton("Programación");
		Programacion.setBounds(200, 150, 200, 80);
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
		EntornosDesarrollo = new JButton("Entornos de Desarrollo");
		EntornosDesarrollo.setBounds(600, 150, 200, 80);
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
		LenguajeMarca = new JButton("Lenguaje de Marcas");
		LenguajeMarca.setBounds(200, 300, 200, 80);
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
		Digitalizacion = new JButton("Digitalización");
		Digitalizacion.setBounds(600, 300, 200, 80);
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
		SistemaInformatico = new JButton("Sistema Informatico");
		SistemaInformatico.setBounds(200, 450, 200, 80);
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
		Sostenibilidad = new JButton("Sostenibilidad");
		Sostenibilidad.setBounds(600, 450, 200, 80);
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