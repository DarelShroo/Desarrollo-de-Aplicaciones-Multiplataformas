import java.util.Scanner;

public class EjercicioHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int Horas, Minutos, Segundos;
		
		System.out.println("Escribe las horas");
		Horas = entrada.nextInt();
		
		System.out.println("Escribe los minutos");
		Minutos = entrada.nextInt();
		
		System.out.println("Escribe los segundos");
		Segundos = entrada.nextInt();
		entrada.close();
		
		Minutos = (Minutos + (Segundos%60));
		Horas = (Horas + (Minutos%60));
		if (Minutos > 60) {
			Horas = (Horas + (Horas%60));
		}
		
		System.out.println(Horas + "h " + Minutos + "m " + Segundos + "s");
		
	}

}
