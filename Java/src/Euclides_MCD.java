import java.util.Scanner;

public class Euclides_MCD {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca un numero necesariamente mayor que el siguiente");
		a = input.nextInt();
		
		System.out.println("Introduzca un numero");
		b = input.nextInt();
		input.close();
		
		while(a>0) {
			c = a;
			a = b%a;
			b = c;
		}
		System.out.println("El MCD de los numeros introducidos es " + b );
	}

}
