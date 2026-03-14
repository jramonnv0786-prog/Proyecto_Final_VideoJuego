/*
 * package view;
 * 
 * import controller.MotorLenguajeDeMarca;
 * import java.awt.Color;
 * import java.awt.Font;
 * import java.awt.Graphics;
 * import java.awt.Image;
 * import java.awt.event.ActionEvent;
 * import javax.swing.ImageIcon;
 * import javax.swing.JButton;
 * import javax.swing.JLabel;
 * import javax.swing.JPanel;
 * import model.Pregunta;
 * 
 * public class PanelLenguajeMarca extends JPanel {
 * 
 * private JLabel tituloLabel;
 * private JLabel preguntaLabel;
 * private JLabel puntuacionLabel;
 * 
 * private JButton boton1;
 * private JButton boton2;
 * private JButton boton3;
 * private JButton boton4;
 * private JButton botonVolver;
 * 
 * private MotorLenguajeDeMarca motor;
 * 
 * private model.Partida partida;
 * private Image fondo;
 * 
 * public PanelLenguajeMarca(model.Partida partida) {
 * this.partida = partida;
 * // 1. Configuración básica del panel
 * setLayout(null);
 * setBounds(0, 0, 1000, 800);
 * 
 * // Cargar la imagen de fondo
 * java.net.URL urlFondo =
 * getClass().getResource("/resources/fondoPreguntas.png");
 * if (urlFondo != null) {
 * ImageIcon icon = new ImageIcon(urlFondo);
 * fondo = icon.getImage();
 * }
 * 
 * motor = new MotorLenguajeDeMarca();
 * 
 * // 2. Título de la Categoría
 * tituloLabel = new JLabel("LENGUAJES DE MARCAS");
 * tituloLabel.setFont(new Font("Arial", Font.BOLD, 32));
 * tituloLabel.setForeground(Color.WHITE);
 * tituloLabel.setHorizontalAlignment(JLabel.CENTER);
 * tituloLabel.setBounds(200, 40, 600, 50);
 * add(tituloLabel);
 * 
 * // 3. Etiqueta de la Puntuación
 * puntuacionLabel = new JLabel("Puntuación Global: " +
 * partida.getPuntuacionTotal());
 * puntuacionLabel.setFont(new Font("Arial", Font.BOLD, 18));
 * puntuacionLabel.setForeground(Color.WHITE);
 * puntuacionLabel.setBounds(30, 30, 250, 40);
 * add(puntuacionLabel);
 * 
 * // 4. Etiqueta de la Pregunta
 * preguntaLabel = new JLabel("Cargando pregunta...");
 * preguntaLabel.setFont(new Font("Arial", Font.PLAIN, 22));
 * preguntaLabel.setForeground(Color.WHITE);
 * preguntaLabel.setHorizontalAlignment(JLabel.CENTER);
 * preguntaLabel.setBounds(100, 150, 800, 100);
 * add(preguntaLabel);
 * 
 * // 5. Botones de Respuestas
 * boton1 = new JButton();
 * boton1.setBounds(200, 300, 250, 60);
 * add(boton1);
 * boton1.addActionListener((ActionEvent e) -> responder(1));
 * 
 * boton2 = new JButton();
 * boton2.setBounds(550, 300, 250, 60);
 * add(boton2);
 * boton2.addActionListener((ActionEvent e) -> responder(2));
 * 
 * boton3 = new JButton();
 * boton3.setBounds(200, 400, 250, 60);
 * add(boton3);
 * boton3.addActionListener((ActionEvent e) -> responder(3));
 * 
 * boton4 = new JButton();
 * boton4.setBounds(550, 400, 250, 60);
 * add(boton4);
 * boton4.addActionListener((ActionEvent e) -> responder(4));
 * 
 * // 6. Botón para Volver
 * botonVolver = new JButton("Volver a Categorías");
 * botonVolver.setBounds(30, 700, 200, 50);
 * add(botonVolver);
 * 
 * botonVolver.addActionListener((ActionEvent e) -> {
 * javax.swing.JFrame ventana = (javax.swing.JFrame)
 * javax.swing.SwingUtilities.getWindowAncestor(this);
 * if (ventana != null) {
 * ventana.getContentPane().removeAll();
 * ventana.add(new PanelCategorias(partida));
 * ventana.revalidate();
 * ventana.repaint();
 * }
 * });
 * 
 * // 7. Cargar la primera pregunta
 * actualizarPregunta();
 * }
 * 
 * private void responder(int opcion) {
 * boolean acierto = motor.comprobarRespuesta(opcion);
 * if (acierto) {
 * partida.sumarPuntos(1);
 * System.out.println("¡Acierto en Lenguaje de Marcas! Puntos globales: " +
 * partida.getPuntuacionTotal());
 * }
 * puntuacionLabel.setText("Puntuación Global: " +
 * partida.getPuntuacionTotal());
 * actualizarPregunta();
 * }
 * 
 * private void actualizarPregunta() {
 * if (motor.hayPreguntas()) {
 * Pregunta p = motor.getPreguntaActual();
 * preguntaLabel.setText("<html>" + p.getPregunta() + "</html>"); // Así hace
 * salto de línea si es larga
 * 
 * boton1.setText(p.getOpcion1());
 * boton2.setText(p.getOpcion2());
 * boton3.setText(p.getOpcion3());
 * boton4.setText(p.getOpcion4());
 * } else {
 * preguntaLabel.setText("¡Categoría completada! Puntuación Global: " +
 * partida.getPuntuacionTotal());
 * boton1.setEnabled(false);
 * boton2.setEnabled(false);
 * boton3.setEnabled(false);
 * boton4.setEnabled(false);
 * }
 * }
 * 
 * @Override
 * protected void paintComponent(Graphics g) {
 * super.paintComponent(g);
 * if (fondo != null) {
 * g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
 * }
 * }
 * }
 */