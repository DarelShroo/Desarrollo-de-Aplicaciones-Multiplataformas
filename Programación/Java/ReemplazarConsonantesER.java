import java.util.Scanner;

public class ReemplazarConsonantesER {
    public static void main(String[] args) {
        
        Scanner InputText = new Scanner(System.in);

        System.out.println("Escribe una frase\n");
        String Sentence = InputText.nextLine().toLowerCase();
        InputText.close();
        
        Sentence = Sentence.replaceAll("[bcdfghjklmn�pqrstxyz]", "*");

        System.out.println("\nTu frase sin vocales " + Sentence);
    }
}
