package aplicaciones_graficas;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame() {
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Esto añade el panel y sus Widget en este caso el texto
		Panel myPanel = new Panel();
		add(myPanel);
	}
}
