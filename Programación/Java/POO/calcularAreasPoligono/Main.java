package calcularAreasPoligono;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		//llenar un poligono
		llenarPoligono();
		
		//mostrar los datos y el area de cada poligono
		mostrarResultados();
	}
	
	public static void llenarPoligono() {
		char respuesta;
		int opcion;
		do {
			do {
				System.out.println("Digite que poligono desea");
				System.out.println("1. Triangulo");
				System.out.println("2. Rectangulo");
				System.out.println("Opcion: ");
				opcion = in.nextInt();
				}while(opcion<1 || opcion>2);
			
			switch(opcion) {
			case 1: llenarTriangulo(); //llenar un triangulo
				break;
				
			case 2: llenarRectangulo();//llenar un rectangulo
				break;
			}
			
			System.out.println("\nDesea introducir otro poligono(s/n): ");
			respuesta = in.next().charAt(0);
			System.out.println("");
			
		}while(respuesta=='s' || respuesta=='S');
	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		
		System.out.print("\nDigite el lado1 del triangulo:");
		lado1 = in.nextDouble();
		System.out.print("\nDigite el lado2 del triangulo:");
		lado2 = in.nextDouble();
		System.out.print("\nDigite el lado3 del triangulo:");
		lado3 = in.nextDouble();
		
		//Guardamos un triangulo dentro del arreglo poligono
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		poligono.add(triangulo);
	}
	
	public static void llenarRectangulo () {
		double lado1, lado2;
		
		System.out.print("\nDigite el lado1 del rectangulo:");
		lado1 = in.nextDouble();
		System.out.print("\nDigite el lado2 del rectangulo:");
		lado2 = in.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		poligono.add(rectangulo);
		
	}
	
	public static void mostrarResultados() {
		for (Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("Area= " + poli.area());
			System.out.println("");
		}
	}
}
