package POO.alumnosYProfesores;

public class Profesor extends Persona{
	private String materia;
	
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
	}
	
	public String getMateria() {
		return materia;
	}
}
