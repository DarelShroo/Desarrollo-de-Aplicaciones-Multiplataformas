import javax.swing.*;

public class DeclaracionOperadores {

	public static void main(String[] args) {

		String nombre = "Darel";

		System.out.println(nombre);

		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");

		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));

		int ultima_letra;

		ultima_letra = nombre.length();

		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra - 1));

		String LargeWord;
		String ShortWord;
		do {
			LargeWord = JOptionPane.showInputDialog("introduce una palabra");
			ShortWord = JOptionPane.showInputDialog("Introduce una palabra mas corta");

			if (LargeWord.length() > ShortWord.length()) {
				System.out.println("La segunda palabra no es mas corta");
			}

		} while (LargeWord.length() > ShortWord.length());


	}

}
