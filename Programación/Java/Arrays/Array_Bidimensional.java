
public class Array_Bidimensional {

	public static void main(String[] args) {
		
		String [] trimestres = {"mod", "1", "2", "3"};
		String [] asignaturas = {"SSF", "BAE", "PRO", "Ingles"};
        int[][] notas = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}, 
        };
        
        for(int k=0; k<trimestres.length; k++) {
        	System.out.print(trimestres[k] + "\t");
        }
        System.out.println();
        for(int row =0, i=0; row < notas.length; row++, i++ ) {
        	System.out.print(asignaturas[i]);
        	for(int colum=0; colum < notas[row].length; colum++ ) {
        		System.out.print("\t" + notas[row][colum]);
        	}
        	System.out.println();
        	
        }
    }

}
