package POO.areaPerimetroCuadrilatero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float lado1;
		float lado2;
		Cuadrilatero c1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce el lado 1");
		lado1 = in.nextFloat();
		System.out.println("Introduce el lado 2");
		lado2 = in.nextFloat();
		
		if(lado1 == lado2) {
			c1 = new Cuadrilatero(lado1);
		}else {
			c1 = new Cuadrilatero(lado1, lado2);
		}
		
		System.out.println("El area del cuadrilatero es " + c1.getArea());
		System.out.println("El perimetro del cuadrilatero es " + c1.getPerimetro());
	}

}
