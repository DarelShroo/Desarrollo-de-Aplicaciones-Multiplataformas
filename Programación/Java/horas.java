package clasePrueba;

import java.util.Scanner;

public class horas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int horas = 0;
		int minutos = 0;
		int segundos = 0;

		System.out.println("Escriba las horas");
		horas = in.nextInt();

		System.out.println("Escriba las minutos");
		minutos = in.nextInt();

		System.out.println("Escriba las segundos");
		segundos = in.nextInt();

		while (segundos > 59) {

			segundos = segundos % 60;
			minutos++;

		}
		while (minutos > 59) {
			minutos = minutos % 60;
			horas++;
		}
		System.out.println(horas + "H " + minutos + "M " + segundos + "S");
	}

}
