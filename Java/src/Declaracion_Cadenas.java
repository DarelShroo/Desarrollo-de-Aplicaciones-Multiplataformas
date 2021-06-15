import javax.swing.*;

import static java.lang.System.out;

public class Declaracion_Cadenas {

	public static void main(String[] args) {
		String saludo = "Hoy es un estupendo día para aprender a programar en Java";
		System.out.println(saludo);
		
		String NombreUsuario = JOptionPane.showInputDialog("texto"); // Muestra un cuadro de diálogo
		out.println(NombreUsuario);
		
		double num1=5.85;
		double resultado=(int)Math.round(num1);

		out.println(resultado);
	}
}
