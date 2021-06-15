package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner buscar = new Scanner(System.in);
		Boolean continuar = true;
		String datoString;
		String datoBusqueda;
		int datoInt;
		ArrayList<String> islas = new ArrayList<String>();
		ArrayList<String> grupos = new ArrayList<String>();
		int[][] matriz;
		int nCols, nFilas;
		int i, j, k;
		int acumulador;

		// Generando columna de islas
		System.out.println("Introduce islas para finalizar escribe fin");
		while (continuar) {

			datoString = in.nextLine();

			if ("fin".equals(datoString)) {
				continuar = false;
			} else {

				islas.add(datoString);

			}

		}

		// Generando filas de grupos
		System.out.println("Introduce grupo para finalizar escribe fin");
		continuar = true;

		while (continuar) {

			datoString = in.nextLine();

			if ("fin".equals(datoString)) {
				continuar = false;
			} else {

				grupos.add(datoString);

			}

		}

		nCols = islas.size();
		nFilas = grupos.size();

		matriz = new int[nFilas][nCols];

		for (j = 0; j < nFilas; j++) {
			// generando matriz con votos
			for (k = 0; k < nCols; k++) {
				System.out.println("Introduce el dato para " + islas.get(k) + " " + grupos.get(j));

				datoInt = in.nextInt();
				matriz[j][k] = datoInt;

			}
		}

		System.out.print("\t");

		for (i = 0; i < nCols; i++) {
			// imprimiendo por consola la islas
			System.out.print("\t" + islas.get(i));
		}

		System.out.println();

		for (j = 0; j < nFilas; j++) {
			// imprimiendo por consola los grupos

			System.out.print(grupos.get(j) + "\t");

			for (k = 0; k < nCols; k++) {

				// imprimiendo por consola la matriz

				System.out.print("\t" + matriz[j][k] + "\t");

			}

			System.out.println();

		}

		System.out.println("\nIntroduce la Isla a buscar\n");
		datoBusqueda = buscar.nextLine();

		System.out.println("\nIsla buscada " + datoBusqueda);

		// Primer for busqueda posicion isla
		for (i = 0, continuar = true, acumulador = 0; i < nCols && continuar; i++) {
			if (datoBusqueda.equals(islas.get(i))) {
				for (j = 0; j < nFilas; j++) {
					// Buscar grupo con mayor voto
					if (acumulador < matriz[j][i]) {

						acumulador = matriz[j][i];

					}

				}
			}
		}

		System.out.println("\nEl " + grupos.get(j - 1) + " es el que mas votos tiene para la isla "
				+ datoBusqueda + " con un total de " + acumulador + " votos");

	}

}
