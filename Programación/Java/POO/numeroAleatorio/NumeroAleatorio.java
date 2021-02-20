package numeroAleatorio;

public class NumeroAleatorio {
	
	public static void main(String[] args) {
		System.out.println(generarNumeroAleatorio(1,100));
	}
	
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		int num = (int)Math.floor(Math.random()*(minimo-(maximo+1)) + (maximo+1));
		return num;
	}
}
