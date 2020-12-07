package clasePrueba;

import java.util.Scanner;

public class ExamenEjercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[] numeros = { 23f, 1f, 5f, -12f, -12f, 30f, 54f, -34f, 27f, 12f };
		float minimo;
		int i = 0;
		int j = 0;
		float aux = 0;
		char five='0';
		String searchFive = null;
		System.out.println("Introduce el minimo");
		minimo = entrada.nextFloat();

		// Recorremos la tabla para cambiar sus posiciones
		for (i = 0, j = numeros.length - 1; i < numeros.length / 2; i++, j--) {
			
			System.out.println(searchFive);
			searchFive = String.valueOf(numeros[i]+numeros[j]);
			for (int k = 0; k < searchFive.length() && five == '.'; k++) {
				
				five = searchFive.charAt(k);
				System.out.println(searchFive.charAt(k));

			}
			//System.out.println(five);
			if ((numeros[i] + numeros[j]) > minimo && five-1 == '5') { // && ((numeros[i]+numeros[j])%10) !
				aux = numeros[i]; // guardo el valor de numeros[i]
				numeros[i] = numeros[j]; // pierdo el valor de i
				numeros[j] = aux; // aux devuelve el valor que tenia i a j
			}
		}

		// Mostramos la tabla

		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "  ");
		}

	}

}
