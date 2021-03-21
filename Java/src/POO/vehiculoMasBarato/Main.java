package POO.vehiculoMasBarato;

import java.util.Scanner;

public class Main {
	public static int indiceCocheMBarato(Vehiculo vehiculos[]) {
		int indice = 0;
		float precio;

		
		precio = vehiculos[0].getPrecio();
		for(int i = 0; i<vehiculos.length; i++) {
			if(vehiculos[i].getPrecio()<precio) {
				precio = vehiculos[i].getPrecio();
				indice = i;
			}
		}
		
		return indice;
	}
	
	public static void main(String[] args) {
		String marca;
		String modelo;
		float precio;
		int nVehiculos, indiceBarato;
		Scanner in = new Scanner(System.in);
		
		System.out.println("�Cuantos vehiculos va a introducir?");
		nVehiculos = in.nextInt();
		Vehiculo vehiculos[] = new Vehiculo[nVehiculos];
		
		for(int i = 0;i<vehiculos.length;i++) {
			in.nextLine();
			System.out.println("\nIntroduce las caracteristicas del vehiculo " + (i+1));
			System.out.println("marca");
			marca = in.nextLine();
			System.out.println("modelo");
			modelo = in.nextLine();
			System.out.println("precio");
			precio = in.nextFloat();
			System.out.println();
			vehiculos[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceBarato = indiceCocheMBarato(vehiculos);
		System.out.println("El coche mas barato es: ");
		System.out.println(vehiculos[indiceBarato].mostrarDatos());
		
	}

}
