package clasePrueba;

import java.util.Scanner;

public class busquedaAlturNombres {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String nombre;
		
		String nombres[] = {"Ana", "Alberto", "Juan"};
		int altura[] = {5,8,9};
		boolean continuar = true;
		int i = 0;
		System.out.println("Escribe el nombre para encontrar su altura");
		nombre = in.nextLine();
		
		while (i<nombres.length && continuar) {
			
			if (nombre.equalsIgnoreCase(nombres[i])) {
				
				continuar = false;
				
				System.out.println("La altura de " + nombre + " es " + altura[i]);
			}
			i++;
		}

	}

}
