package trianguloIscoceles;

import java.util.Scanner;

public class Main {
	public static double mayorArea(TrianguloIscoceles triangulos[]) {
		double area;
		
		area = triangulos[0].obtenerArea();
		for(int i = 0; i<triangulos.length; i++) {
			if (triangulos[i].obtenerArea()>area) {
				area = triangulos[i].obtenerArea();
			}
		}
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double base, lado;
		int nTriangulos;
		
		System.out.print("Introduce el numero de triangulos a ingresar: ");
		nTriangulos = in.nextInt();
		
		TrianguloIscoceles triangulos[] = new TrianguloIscoceles[nTriangulos];
		
		for(int i = 0; i< triangulos.length; i++) {
			System.out.println("Introduce los valores para el triangulo " + (i+1) + ":");
			System.out.print("Introduzca la base: ");
			base = in.nextDouble();
			System.out.print("Introduzca el lado: ");
			lado = in.nextDouble();
			
			triangulos[i] = new TrianguloIscoceles(base, lado);
			
			System.out.println("\nEl perimetro del triangulo es: " + triangulos[i].obtenerPerimetro());
			System.out.println("\nEl area del triangulo es: " + triangulos[i].obtenerArea()+ "\n");
		}
		
		System.out.println("\nEl area del triangulo de mayor superficie es: " + mayorArea(triangulos));
	}

}
