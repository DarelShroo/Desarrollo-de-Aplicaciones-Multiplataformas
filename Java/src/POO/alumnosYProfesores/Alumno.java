package POO.alumnosYProfesores;

public class Alumno extends Persona{
	private int calificaciones;
	
	public Alumno(String nombre, int edad, String sexo, int calificaciones) {
		super(nombre,edad,sexo);
		this.calificaciones = calificaciones;
	}

	public int getCalificaciones() {
		return calificaciones;
	}
	
}
