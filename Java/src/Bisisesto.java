import java.util.Scanner;

public class Bisisesto {

	public static void main(String[] args) {
		
		Scanner InputBisiesto = new Scanner(System.in);
		System.out.println("Escribe un año para saber si es bisiesto");
		int anio = InputBisiesto.nextInt();
		InputBisiesto.close();
		
		if ((anio%4) == 0) {
			if ((anio%100 == 0)) {
			System.out.println("El a�o " + anio + " no es bisiesto" );
			}else {
				if ((anio%400) == 0) {
					System.out.println("El a�o " + anio + " a�o no es bisiesto");
				}else {
					System.out.println("El a�o " + anio + " si es bisiesto ");
				}
			}
		}else {
			System.out.println("El a�o " + anio + " no es bisiesto");
		}
	}

}
