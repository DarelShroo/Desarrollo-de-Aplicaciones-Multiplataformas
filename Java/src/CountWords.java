import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase = input.nextLine();
		input.close();
		
		int countWords = 1;
		
		for (int i=0; i<frase.length(); i++) {
			if((Character.isLetter(frase.charAt(i))==false) && (Character.isLetter(frase.charAt(i+1)))) {
				countWords++;
			}
		}
		System.out.println("Esta frase tiene en total " + countWords + " palabras." );
	}

}
