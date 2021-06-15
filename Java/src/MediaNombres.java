import java.util.Scanner;

public class MediaNombres {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nombres ="";
		
		int totalLeng = 0;
		
		for(int i=0;i<5;i++) {
			
			
			System.out.println("Escriba un nombre");
			
			nombres = input.nextLine();
			totalLeng = (totalLeng+nombres.length());
			
		}
			
		System.out.println("\nTama�o total nombres " + totalLeng + " -> " + (totalLeng/5));

	}

}
