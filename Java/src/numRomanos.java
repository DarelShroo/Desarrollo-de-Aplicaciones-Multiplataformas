import java.util.Scanner;

public class numRomanos {

	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int num,unidades,decenas;
	        String romanUni = "", romanDec = "";
	        System.out.println("Introduzca un numero (1-99)");
	        num=teclado.nextInt();
	        unidades=num%10;
	        decenas=num/10;
		//UNIDADES en Romano
		romanUni = switch (unidades) {
			case 1 -> "I";
			case 2 -> "II";
			case 3 -> "III";
			case 4 -> "IV";
			case 5 -> "V";
			case 6 -> "VI";
			case 7 -> "VII";
			case 8 -> "VIII";
			case 9 -> "IX";
			default -> "";
		};
		//DECENAS en Romano
		romanDec = switch (decenas) {
			case 1 -> "X";
			case 2 -> "XX";
			case 3 -> "XXX";
			case 4 -> "XL";
			case 5 -> "L";
			case 6 -> "LX";
			case 7 -> "LXX";
			case 8 -> "LXXX";
			case 9 -> "XC";
			default -> "";
		};
	        System.out.println(""+romanDec+romanUni);
	 }
}

