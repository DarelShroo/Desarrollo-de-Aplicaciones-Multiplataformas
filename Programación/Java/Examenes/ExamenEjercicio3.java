package clasePrueba;

public class ExamenEjercicio3 {

	public static void main(String[] args) {

		String sopaLetras[][] = { { "a", "b", "z", "k", "v" }, { ",", "c", "g", "z", "d" },
				{ "v", "o", "o", "i", "e" } };
		int numeros[][] = { { 2, 0 }, { 2, 4 }, { 2, 2 }, { 1, 0 }, { 0, 4 }, { 2, 4 }, { 2, 1 } };

		int columnas = 0;
		int filas = 0;

		// For que recorre numeros
		for (int i = 0, j = 0; i < numeros.length; i++) { // for filas
			System.out.print(sopaLetras[numeros[i][j]][numeros[i][j + 1]]);
		}

		System.out.println();

	}

}
