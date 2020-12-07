package clasePrueba;

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
	        switch (unidades) { //UNIDADES en Romano
	        case 1:
	            romanUni = "I";
	            break;
	        case 2:
	            romanUni = "II";
	            break;
	        case 3:
	            romanUni = "III";
	            break;
	        case 4:
	            romanUni = "IV";
	            break;
	        case 5:
	            romanUni = "V";
	            break;
	        case 6:
	            romanUni = "VI";
	            break;
	        case 7:
	            romanUni = "VII";
	            break;
	        case 8:
	            romanUni = "VIII";
	            break;
	        case 9:
	            romanUni = "IX";
	            break;
	        default:
	            romanUni = "";
	            break;
	        }
	        switch (decenas) { //DECENAS en Romano
	        case 1:
	            romanDec = "X";
	            break;
	        case 2:
	            romanDec = "XX";
	            break;
	        case 3:
	            romanDec = "XXX";
	            break;
	        case 4:
	            romanDec = "XL";
	            break;
	        case 5:
	            romanDec = "L";
	            break;
	        case 6:
	            romanDec = "LX";
	            break;
	        case 7:
	            romanDec = "LXX";
	            break;
	        case 8:
	            romanDec = "LXXX";
	            break;
	        case 9:
	            romanDec = "XC";
	            break;
	        default:
	            romanDec = "";
	            break;
	        }
	        System.out.println(""+romanDec+romanUni);
	 }
}

