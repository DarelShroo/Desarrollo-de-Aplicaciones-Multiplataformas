import javax.swing.JOptionPane;

public class EjercicioClase4 {
	public static void main(String[] args) {

		for (boolean Condition = true; Condition;) {
			String LargeWord = JOptionPane.showInputDialog("introduce una palabra");
			String ShortWord = JOptionPane.showInputDialog("Introduce una palabra mas corta");

			int LargeWordInt = LargeWord.length();
			int ShortWordInt = ShortWord.length();

			if (LargeWordInt < ShortWordInt) {
				System.out.println("La segunda palabra no es mas corta");
			} else {
				int HowLongWord = LargeWordInt - ShortWordInt;

				System.out.println("La palabra " + LargeWord + " es mas larga que " + ShortWord + " por " + HowLongWord
						+ " caracteres");
						
				Condition = false;
			}
		}
	}
}
