import java.util.Scanner;
import java.lang.StringBuilder;

public class OcultarConsonantes {
    public static void main(String[] args) {
        Scanner InputText = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        
        System.out.println("Escribe una frase\n");
        String Sentence = InputText.nextLine();
        InputText.close();

        char Consonant;
        for (int i=0;i < Sentence.length();i++){

        	Consonant = Sentence.charAt(i);
            
            if ( Consonant == 'a' || Consonant == 'e' || Consonant == 'i' || Consonant == 'o' || Consonant == 'u'){
                str.append(Consonant);
            }else if (Character.isSpaceChar(Consonant)) {
            	str.append(Consonant);
            }else {
            	str.append("*");
            }
        }

        System.out.println("\nTu frase sin vocales " + str);

    }
}        