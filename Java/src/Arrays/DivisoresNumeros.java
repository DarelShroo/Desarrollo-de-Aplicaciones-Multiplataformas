package Arrays;

import java.util.Scanner;

public class DivisoresNumeros {

	public static void main(String[] args) {
		int numero;
		int divisores[] = new int[10];
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		numero = input.nextInt();
		input.close();
		
		System.out.println("\nDivisores de " + numero + "\n");
		
		for (int i=2; i<numero; i++) {
			
			if ((numero%i) == 0) {
				divisores[count] = i;
				System.out.print(divisores[count]+ ", ");
				count++;
			}
		}
		System.out.print(numero);
	}

}
