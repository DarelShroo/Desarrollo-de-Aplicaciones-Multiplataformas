import java.util.Scanner;
import java.lang.StringBuilder;

public class FraseSinConsonantes {
    public static void main(String[] args) {
        Scanner InputText = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        
        System.out.println("Escribe una frase\n");
        String Sentence = InputText.nextLine();
        InputText.close();

        char Consonant;
        for (int i=0;i < Sentence.length();i++){

        	Consonant = Sentence.charAt(i);
            
            if ( Consonant == 'a' || Consonant == 'b' || Consonant == 'c' || Consonant == 'd' || Consonant == 'e'){
                str.append(Consonant);
            }else if (Character.isWhitespace(Consonant)) {
                
            }
        }

        System.out.println("\nTu frase sin consonantes " + str);

    }
}        