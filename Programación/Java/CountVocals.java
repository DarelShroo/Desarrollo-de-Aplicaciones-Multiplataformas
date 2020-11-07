import java.util.Scanner;

public class CountVocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String Sentence = sc.nextLine().toLowerCase();
        sc.close();

        char Letters;
        int CountLetters = 0; 
        int CountA = 0;
        int CountE = 0;
        int CountI = 0;
        int CountO = 0;
        int CountU = 0;

        for (int i=0; i< Sentence.length(); i++){
        
            Letters = Sentence.charAt(i);

            if (Character.isLetter(Letters)){

                CountLetters++;
                
                if (Letters == 'a'){
                    CountA++;
                }else {
                    if (Letters == 'e'){
                        CountE++;
                    }else{
                        if (Letters == 'i'){
                            CountI++;
                        }else {
                            if (Letters == 'o'){
                                CountO++;
                            }else {
                                if (Letters == 'u'){
                                    CountU++;
                                }
                            }
                        }
                    }
                }

            }
        
        }
        
        System.out.println("Hay " + CountLetters + " letras.");
        System.out.println("Hay " + CountA + " A");
        System.out.println("Hay " + CountE + " E");
        System.out.println("Hay " + CountI + " I");
        System.out.println("Hay " + CountO + " O");
        System.out.println("Hay " + CountU + " U");
        
        System.out.println("En total hay " + (CountA +CountE + CountI + CountO + CountU) + " Vocales");

    }
}
