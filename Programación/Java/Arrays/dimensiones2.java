
public class dimensiones2 {

	public static void main(String[] args) {
		
		String [] alumnos = {"Asignaturas", "Darel", "Javier", "Cristina", "Yaiza", "Julia"};
		String [] asignaturas = {"PRO", "BAE", "SSF", "ETS"};
		float [] notas = {8.5f, 6f,3f,9f,10f,2f,5f,5f,9f,4f,2.1f,5f,5f,5f,4f,10f,5f,2f,4f,8f,4f,5f,6f,8f};
		
		for (int k = 0; k<alumnos.length; k++) {
			System.out.print(alumnos[k] + "     " );
		}
		System.out.println();
		for (int i = 0,j = 0; i<asignaturas.length; i++) {
			System.out.println();
			System.out.print(asignaturas[i] + "         ");
			for( int l = 0; l<alumnos.length-1; l++, j++) {
				
				System.out.print( "    " + notas[j] + "    ");
				
			}
			System.out.println();
		}

	}

}
