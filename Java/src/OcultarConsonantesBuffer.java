import java.util.Scanner;
import java.lang.StringBuilder;

public class OcultarConsonantesBuffer {
	public static void main(String[] args) {
		Scanner InputText = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		System.out.println("Escribe una frase\n");
		String Sentence = InputText.nextLine();
		InputText.close();
		
		char Vocal;
		for (int i=0;i < Sentence.length();i++){
			
			Vocal = Sentence.charAt(i);

			if ( Vocal == 'a' || Vocal == 'b' || Vocal == 'c' || Vocal == 'd' || Vocal == 'e'){
				str.append(Vocal);
			}else if (Character.isSpaceChar(Vocal)) {
				str.append(" ");
			}else {
				str.append("*");
			}
		}
		System.out.println("\nTu frase sin consonantes " + str);
	}
}
