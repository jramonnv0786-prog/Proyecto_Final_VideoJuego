package vista;

import javax.swing.JFrame;

	public class Ventana extends JFrame {

	   private JFrame ventana;
	   
	    
	    public Ventana() {

	    	setTitle("MINIJUEGOS");
	        
	        //Ajustar el tamaño de la ventana
	        setSize(1000, 800);
	        
	        //Cerrar todos los procesos
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
	        //Posicionarlo en mitad de la pantalla
	        setLocationRelativeTo(null);
	        
	        setResizable(false);
	        	        
	        PanelMenu panel = new PanelMenu();
	        add(panel);
	        
	        setVisible(true);

}
	}
