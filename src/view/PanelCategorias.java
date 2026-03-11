package view;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCategorias extends JPanel {

	private JButton Programacion;
	private JButton EntornosDesarrollo;
	private JButton LenguajeMarca;
	private JButton Digitalizacion;
	private JButton SistemaInformatico;
	private JButton Sostenibilidad;

	public PanelCategorias() {

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
                ventana.add(new PanelProgramacion());
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
                ventana.add(new PanelLenguajeMarca());
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
                ventana.add(new PanelDigitalizacion());
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
		});

		// BOTON Sostenibilidad
		Sostenibilidad = new JButton("Sostenibilidad");
		Sostenibilidad.setBounds(600, 450, 200, 80);
		add(Sostenibilidad);

		Sostenibilidad.addActionListener((ActionEvent e) -> {
			System.out.println("Categoria Sostenibilidad");
		});

	}
}