package POO.alumnosYProfesores;

public abstract class Falta {
	boolean falta;
	int faltas;
	boolean darClase;
	
	public Falta(boolean falta, int faltas, boolean darClase) {
		this.falta = falta;
		this.faltas = faltas;
		this.darClase = darClase;
	}
	
	public static boolean getFalta() {
		boolean falta = false;
		return falta;
	}
}
