package clasePrueba;

import java.util.*;

public class BusquedaBinaria {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int[] listaNumeros = {1,2,3,4,5,6,7,8,9,10,11,12};
		int dato;
		int i=0, j=listaNumeros.length-1; 
		int medio = (i+j)/2;
		System.out.println("Introduce numero a buscar");
		dato = in.nextInt();
		
		while ((i<j) && dato != listaNumeros[medio]) {
			
			if(dato > listaNumeros[medio]) {
				i = medio;
				i++;
				
				medio = (i+j)/2;
			}
			
			if (dato <listaNumeros[medio]) {
				j = medio;
				j--;
				
				medio = (i+j)/2;
			}
		}
		
		if (dato == listaNumeros[medio]) {
			System.out.println("Encontrado");
		}else{
			System.out.println("Dato no encontrado");
		}
	}

}
