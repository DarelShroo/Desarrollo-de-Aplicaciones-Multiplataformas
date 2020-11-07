import java.util.Scanner;

public class ReemplazarVocales {
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        System.out.println("Escribe una frase\n");
        String Sentence = Input.next();
        Input.close();

        Sentence = Sentence.replaceAll("[aeiouAEIOU]", "");

        System.out.println("\nTu frase sin vocales " + Sentence);
    }
}
