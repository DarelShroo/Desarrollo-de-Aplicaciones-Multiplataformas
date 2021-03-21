package Examenes;

import java.util.Scanner;

public class ExamenEjercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;
		int aux = 0;
		int i = 0;
		boolean continuar = true;

		System.out.println("Introduce un n�mero mayor que 0 para saber si es triangular");
		numero = entrada.nextInt();

		// Bucle suma hasta llegar o sobrepasar a numero
		while (continuar) {
			if (aux > numero) {
				System.out.println("Este numero no es triangular");
				continuar = false;
			} else if (aux == numero) {
				System.out.println("Este numero es triangular");
				continuar = false;
			} else {
				aux = aux + i;
				i++;
			}
		}

	}

}
