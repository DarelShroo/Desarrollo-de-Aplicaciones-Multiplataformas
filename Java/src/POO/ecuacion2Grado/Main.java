package POO.ecuacion2Grado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escribe a");
		a = in.nextDouble();
		System.out.println("Escribe b");
		b = in.nextDouble();
		System.out.println("Escribe c");
		c = in.nextDouble();
		
		Raices ecuacion=new Raices(a,b,c);
		ecuacion.calcular();
	}

}
