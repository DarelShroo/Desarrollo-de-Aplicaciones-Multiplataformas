import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una frase para saber si es palindromo o no");
		String frase = input.nextLine().toLowerCase();
		input.close();
		
		int diferencia = 0;
		
		for (int i = 0, j = frase.length()-1; i <= j; i++, j--) {
			if (frase.charAt(i) != frase.charAt(j)) {
				
				diferencia++;
				
			}
		}
		
		if (diferencia > 0) {
			
			System.out.println("No es palindromo");
			
		}else {
			
			System.out.println("Si es palindromo");
			
		}

	}

}
