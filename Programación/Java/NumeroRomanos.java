import java.util.Scanner;

public class NumeroRomanos {

	public static void main(String[] args) {
		
		Scanner InputNumber = new Scanner(System.in);
		
		System.out.println("Escriba un numero ");
		int numero = InputNumber.nextInt();
		int decenas, unidades;
		InputNumber.close();
		
		decenas = numero/10;
		unidades=numero%10;
		
		System.out.println("Unidades " + unidades);
		System.out.println("Decenas " + decenas);
		
		switch(decenas) {
	    case 3:
	        System.out.print("X");
	        
	    case 2:
	        System.out.print("X");
	        
	    case 1:
	        System.out.print("X");
	        break;
	    case 4:
	        System.out.print("XL");
	        break;
	    case 5:
	        System.out.print("L");
	        break;
	    case 6:
	        System.out.print("LX");
	        break;
	    case 7:
	        System.out.print("LXX");
	        break;
	    case 8:
	        System.out.print("LXXX");
	        break;
	    case 9:
	        System.out.print("XC");
	        break;
		
		}
		switch(unidades) {
	    case 3:
	        System.out.print("I");
	        
	    case 2:
	        System.out.print("I");
	        
	    case 1:
	        System.out.print("I");
	        break;
	    case 4:
	        System.out.print("IV");
	        break;
	    case 5:
	        System.out.print("V");
	        break;
	    case 6:
	        System.out.print("VI");
	        break;
	    case 7:
	        System.out.print("VII");
	        break;
	    case 8:
	        System.out.print("VIII");
	        break;
	    case 9:
	        System.out.print("IX");
	        break;
		
		}
		
	}

}
