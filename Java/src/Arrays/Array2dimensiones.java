package Arrays;

public class Array2dimensiones {

	public static void main(String[] args) {
		
		String [] alumnos = {"Jos�","Cristina", "Fernando","Kevin"};
		String []asignaturas = {"BAE","PRO","SSF"};
		final int espaciado = 8;//alumnos
		final int espaciado2 = 15;//notas
		//final int espaciado3 = 12; //alumnos
		float [][] notas = {{8,9,10,5},
						  {5f,4,9,8},
						  {2,5,6,9}};
		int i;
		int j;
		System.out.printf("%"+espaciado+"s  ","");
		for (i =0 ; i<alumnos.length;i++) {
			System.out.printf("%"+espaciado2 + "s ", alumnos[i]);
		}
		
		System.out.println();
		
		for (i=0; i<asignaturas.length; i++) {
			System.out.printf("%-"+espaciado + "s ", asignaturas[i]);
			for(j = 0;j<alumnos[0].length() ;j++) {
				System.out.printf("%"+espaciado2+".1f " , notas[i][j]);
			}
			System.out.println();
		}
	}

}
