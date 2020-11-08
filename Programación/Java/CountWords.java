import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		String text = input.nextLine().trim();
		input.close();
		
		int countWords = 1;
		
		for (int i=0; i<text.length(); i++) {
			
			if (Character.isLetter(text.charAt(i)) == false && Character.isLetter(text.charAt(i+1))) {
				countWords++;
			}
			
		}
		
		System.out.println("Hay " + countWords + " palabras");

	}

}
