package Arrays;

import java.util.Scanner;

public class arrayIslasGrupos {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String islas[];
		
		String grupos[];
		int votosCandidatos[][];
		int tamanioGrupos;
		int tamanioIslas;
		String islasGrupos;
		int votos;
		int nFilas;
		int nCols;
		boolean continuar = true;
		int i;
		int j;
		
		System.out.println("Cuantas islas va a introducir?");
		tamanioIslas= in.nextInt();
		islas = new String[tamanioIslas];
		nCols = islas.length;
		
		System.out.println("Introduce en orden las islas -> ");
		islasGrupos = in.nextLine();
		islas[0] = islasGrupos;
		for(i=0;i<nCols;i++) {
			System.out.println(i);
			islasGrupos = in.nextLine();
			islas[i] = islasGrupos;
		}
		
		System.out.println("Cuantos grupos va a introducir?");
		tamanioGrupos= in.nextInt();
		grupos = new String[tamanioGrupos];
		nFilas = grupos.length;

		System.out.println("\nIntroduce en orden los grupos");
		islasGrupos = in.nextLine();
		grupos[0] = islasGrupos;
		for(j=0;j<nFilas;j++) {
			System.out.println(j);
			islasGrupos = in.nextLine();
			grupos[j] = islasGrupos;
		}	
		
		votosCandidatos = new int[nFilas][nCols];

		for (i = 0; i<nFilas; i++) {
			for(j=0; j<nCols; j++) {
				
				System.out.println("Introduce el voto para el grupo " + grupos[i] + " perteneciente a la isla " +islas[j] );
				votos = in.nextInt();
				votosCandidatos[i][j] = votos;
				
			}
		}
		
		System.out.print("\t");
		for (i = 0; i<nCols; i++) {
			System.out.print("\t"+islas[i]);
		}	
		
		System.out.println();
		
		for (i = 0; i<nFilas; i++) {
			System.out.print(grupos[i]);
			for(j=0; j<nCols; j++) {
				
				System.out.print("\t\t"+ votosCandidatos[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("Introduce Islas a buscar");
		islasGrupos = in.nextLine();
		i=0;
		j=0;
		int mayorVoto=0;
		
		while (i<islas.length && continuar) {
			if(islas[i].equalsIgnoreCase(islasGrupos)){
				while (j< grupos.length && continuar) {
					if(votosCandidatos[i][j]>mayorVoto) {
						mayorVoto = votosCandidatos[i][j];
					}
					j++;
				}
				i++;
			}
	
		}
		System.out.println(mayorVoto);
	}

}