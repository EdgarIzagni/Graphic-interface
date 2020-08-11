package aplicaciones_graficas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
	//Sobreescribimos el metodo paintComponent y pasamos como parametro un objeto Graphics con este dibujaremos elementos en pantalla
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//Con esto pasamos el parametro g a la clase padre para que trabaje con el. 
		g.drawString("Hola mundo", 100, 100); // Usando el método drawString("texto",x,y)  dibujamos el string
		setBackground(Color.CYAN); // Modificamos el color de fondo con setBackground(Color) el parametro color puede ser en formato de palabra clave o rgb()
	}
}
