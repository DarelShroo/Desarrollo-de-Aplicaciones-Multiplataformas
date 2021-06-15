import java.util.*;

public class ReemplazarConsonantesConSubstring {
	public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence: ");

        String word = input.nextLine();
        input.close();
        
        for(int count = 0; count < word.length(); count ++){

            char c = word.charAt(count);
            c = Character.toLowerCase(c);

            if(Character.isLetter(c) & (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))){

            String front = word.substring(0, count);
            String back = word.substring(count + 1);

            word = front + "*" + back;
            }
        }
        System.out.println(word);
	}
}
