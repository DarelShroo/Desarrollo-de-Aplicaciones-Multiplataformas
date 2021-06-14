package POO.competicionAtletismo;

import java.util.Scanner;

public class Main {
	
	public static int indiceAtletaMRapido(Atleta atletas[]) {
		float tiempoCarrera;
		int indice = 0;
		
		tiempoCarrera = atletas[0].gettiempoCarrerat();
		for (int i = 0; i<atletas.length; i++) {
			if (atletas[i].gettiempoCarrerat()<tiempoCarrera) {
				tiempoCarrera = atletas[i].gettiempoCarrerat();
				indice = i;
			}
		}
		return indice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int nAtleta, indiceMejorTiempo, numeroCompetidores;
		String nombreAtleta;
		float tiempoCarrera;
		
		System.out.println("�Cuantos competidores?");
		numeroCompetidores = in.nextInt();
		
		Atleta atletas[] = new Atleta[numeroCompetidores];
		
		for (int i = 0; i<atletas.length; i++) {
			System.out.println("\nEscribe los datos del competidor "  + (i+1) +":");
			System.out.print("Introduce el numero de atleta: ");
			nAtleta = in.nextInt();
			in.nextLine();
			System.out.print("Introduce el nombre del atleta: ");
			nombreAtleta = in.nextLine();
			System.out.print("Introduce el tiempo de carrera: ");
			tiempoCarrera = in.nextFloat();
			
			atletas[i] = new Atleta(nAtleta, nombreAtleta, tiempoCarrera);
			
		}
		
		indiceMejorTiempo = indiceAtletaMRapido(atletas);
		System.out.println("\nEl atleta con mejor tiempo es: ");
		System.out.println(atletas[indiceMejorTiempo].mejorAtleta());
	}

}
