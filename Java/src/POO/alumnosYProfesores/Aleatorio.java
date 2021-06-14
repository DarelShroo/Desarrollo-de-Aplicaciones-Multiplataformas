package POO.alumnosYProfesores;

public class Aleatorio extends Falta{
	public Aleatorio(boolean falta, int faltas, boolean darClase) {
		super(falta, faltas, darClase);
	}

	private final static String nombreChicos[] = { "Juan", "Alberto", "Francisco", "Ruben", "Felix", "Cristian" };
	private final static String nombreChicas[] = { "Sofia", "Cristina", "Sara", "Carla", "Carlota", "Ana" };
	private final static String SEX[] = { "chico", "chica" };
	private final static String[] MATERIAS = { "matematicas", "filosofia", "fisica" };

	public static int generarNumeroAleatorio(int minimo, int maximo) {
		int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	public static Alumno[] getGenerarAlumnos(Alumno[] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {
			if (getSexo().equals("chico")) {
				alumnos[i] = new Alumno(getNombre("chico"), getEdad("alumno"), "chico", getNota());
			} else {
				alumnos[i] = new Alumno(getNombre("chica"), getEdad("alumno"), "chica", getNota());
			}
		}
		return alumnos;
	}

	public static Profesor[] getProfesores(Profesor[] profesores) {

		for (int i = 0; i < profesores.length; i++) {
			if (getSexo().equals("chico")) {
				profesores[i] = new Profesor(getNombre("chico"), getEdad("profesor"), "chico", getMateria());
			} else {
				profesores[i] = new Profesor(getNombre("chica"), getEdad("profesor"), "chica", getMateria());
			}
		}
		return profesores;
	}

	public static Aula[] getAulas(Aula[] aulas, Profesor[] profesores, Alumno[] alumnos) {
		Alumno[] alumnosMates = new Alumno[getMaximoEstudiantesAula(alumnos)];
		Alumno[] alumnosFilosofia = new Alumno[getMaximoEstudiantesAula(alumnos)];
		Alumno[] alumnosFisica = new Alumno[getMaximoEstudiantesAula(alumnos)];
		Profesor profesor;

		for (int i = 0; i < aulas.length; i++) {
			profesor = profesores[generarNumeroAleatorio(0, profesores.length - 1)];
			if (profesor.getMateria().equals("matematicas")) {
				for (int j = 0; j < alumnosMates.length; j++) {
					alumnosMates[j] = getAlumno(alumnos);
					
				}
				aulas[i] = new Aula(i, alumnosMates.length, "matematicas", alumnosMates, profesor);
			} else if (profesor.getMateria().equals("filosofia")) {
				for (int j = 0; j < alumnosFilosofia.length; j++) {
					alumnosFilosofia[j] = getAlumno(alumnos);
					
				}
				aulas[i] = new Aula(i, alumnosFilosofia.length, "filosofia", alumnosFilosofia, profesor);
			} else if (profesor.getMateria().equals("fisica")) {
				for (int j = 0; j < alumnosFisica.length; j++) {
					alumnosFisica[j] = getAlumno(alumnos);

				}
				aulas[i] = new Aula(i, alumnosFisica.length, "fisica", alumnosFisica, profesor);
			}

		}

		return aulas;
	}

	public static String getNombre(String nombreGenero) {
		String nombre;
		if (nombreGenero.equals("chico")) {
			nombre = nombreChicos[generarNumeroAleatorio(0, nombreChicos.length - 1)];
		} else {
			nombre = nombreChicas[generarNumeroAleatorio(0, nombreChicos.length - 1)];
		}
		return nombre;
	}

	public static int getEdad(String edadProfesorOAlumno) {
		int edad;
		if (edadProfesorOAlumno.equals("profesor")) {
			edad = generarNumeroAleatorio(30, 50);
		} else {
			edad = generarNumeroAleatorio(14, 16);
		}
		return edad;
	}

	public static String getSexo() {
		String sexo = SEX[generarNumeroAleatorio(0, SEX.length - 1)];
		return sexo;
	}

	public static String getMateria() {
		String materia = MATERIAS[generarNumeroAleatorio(0, MATERIAS.length - 1)];
		return materia;
	}

	public static int getNota() {
		return generarNumeroAleatorio(0, 10);
	}

	public static int getMaximoEstudiantesAula(Alumno[] alumnos) {
		int maximo = generarNumeroAleatorio(5,10);
		return maximo;
	}

	public static Alumno getAlumno(Alumno[] alumnos) {
		Alumno alumno = alumnos[generarNumeroAleatorio(0, alumnos.length - 1)];
		return alumno;
	}

	public Profesor getProfesor(Profesor[] profesores) {
		Profesor profesor = profesores[generarNumeroAleatorio(0, profesores.length - 1)];
		return profesor;
	}
	
	public static boolean faltaProfesor() {
		boolean falta=false;
		if(generarNumeroAleatorio(0,100) <=20) {
			falta = true;
		}
		return falta;
	}
	public static boolean faltaAlumno() {
		boolean falta=false;
		if(generarNumeroAleatorio(0,100) <=50) {
			falta = true;
		}
		return falta;
	}
	
}
