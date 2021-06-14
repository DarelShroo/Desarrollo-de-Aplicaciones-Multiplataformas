import java.util.*;
public class calcularGasto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int litrosGastados;
		final int cuota = 6;
		int precio = 0;
		final int litrosGratis = 50;
		
		System.out.println("Introduce los litros gastados");
		litrosGastados = in.nextInt();
		if (litrosGastados < 50) {
			System.out.println("El precio es " + cuota);
		}else if (litrosGastados < 200) {
			precio = precio + (int) ((litrosGastados-litrosGratis)*0.1)+cuota;
			System.out.println("El precio es de " + precio);
			
		}else {
			precio = precio + (int) ((litrosGastados-litrosGratis)*0.3)+cuota;
			System.out.println("El precio es de " + precio);
		}
	}
}
