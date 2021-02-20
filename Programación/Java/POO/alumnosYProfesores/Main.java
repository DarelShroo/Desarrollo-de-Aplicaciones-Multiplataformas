package alumnosYProfesores;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cantidadAGenerar;
		int nAlumnosFaltan = 0 ;
		boolean faltaProfesor =false;
		
		System.out.println("Cuantos profesores vas a generar?");
		cantidadAGenerar = in.nextInt();
		
		Profesor[] profesores = new Profesor[cantidadAGenerar];
		
		System.out.println("Cuantos alumnos vas a generar?");
		cantidadAGenerar = in.nextInt();

		Alumno[] alumnos = new Alumno[cantidadAGenerar];
		
		System.out.println("Cuantas aulas vas a generar?");
		cantidadAGenerar = in.nextInt();
		Aula[] aulas = new Aula[cantidadAGenerar];
		System.out.println();
		
		Aleatorio.getGenerarAlumnos(alumnos);
		Aleatorio.getProfesores(profesores);
		Aleatorio.getAulas(aulas, profesores, alumnos);
		
		for(int i=0; i< alumnos.length; i++) {
			System.out.println("Alumno: " +alumnos[i].getNombre() + " Su edad: " + alumnos[i].getEdad() + " sexo: " + alumnos[i].getSexo());
		}
		System.out.println();
		for(int i=0; i< aulas.length; i++) {

			System.out.println("Aula de " +aulas[i].getMateriaImpartida());
		}
		System.out.println();


		for(int i=0; i< profesores.length; i++) {

			System.out.println("Profesor "+profesores[i].getNombre() + " imparte la materia " + profesores[i].getMateria() + " su edad es: "+ profesores[i].getEdad());

		}
		for(int i =0;i<aulas.length;i++) {
			for(int j =0;  j<aulas[i].getAlumnos().length; j++) {
				if(Aleatorio.generarNumeroAleatorio(0,100) <=50) {
					nAlumnosFaltan++; 
				}
			}
			if(Aleatorio.generarNumeroAleatorio(0, 100)<=20) {
				faltaProfesor = true;
			}
			if (nAlumnosFaltan > aulas[i].getAlumnos().length/2) {
				System.out.println("El aula con id " + aulas[i].getIdentificador() + " no puede impartir clase por que han faltado " + nAlumnosFaltan + " alumnos, mas de la mitad total de alumnos("+(aulas[i].getAlumnos().length)+")");
				if(faltaProfesor) {
					System.out.println("El aula con id " + aulas[i].getIdentificador() + " no puede impartir clase por que han faltado " + nAlumnosFaltan + " alumnos, mas de la mitad total de alumnos("+(aulas[i].getAlumnos().length)+") y el profesor " + aulas[i].getProfesor().getNombre());
				}
			}else if(faltaProfesor) {
				System.out.println("El aula con id " + aulas[i].getIdentificador() + " no puede impartir clase por que ha faltado el profesor " +aulas[i].getProfesor().getNombre());
				if(faltaProfesor) {
					System.out.println("El aula con id " + aulas[i].getIdentificador() + " no puede impartir clase por que han faltado " + nAlumnosFaltan + " alumnos, mas de la mitad total de alumnos("+(aulas[i].getAlumnos().length)+") y el profesor " + aulas[i].getProfesor().getNombre());
				}
			}
			nAlumnosFaltan =0;
		}
		
		
		
		aulas[0].verAlumnos(1).getNombre();
	}

}
