package alumnosYProfesores;

public class Aula {
	private int identificador;
	private int nMaximoEstudiantes;
	private String materiaImpartida;
	private Alumno[] alumnos;
	private Profesor profesor;
	
	public Aula(int identificador, int nMaximoEstudiantes, String materiaImpartida, Alumno[] alumnos,Profesor profesor) {
		this.identificador = identificador;
		this.nMaximoEstudiantes = nMaximoEstudiantes;
		this.materiaImpartida = materiaImpartida;
		this.alumnos = alumnos;
		this.profesor= profesor;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public int getnMaximoEstudiantes() {
		return nMaximoEstudiantes;
	}
	public String getMateriaImpartida() {
		return materiaImpartida;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}
	public Alumno verAlumnos(int i) {
		return alumnos[i];
	}
}
