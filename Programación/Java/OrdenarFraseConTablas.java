package clasePrueba;


public class OrdenarFraseConTablas {

	public static void main(String[] args) {
		
		int [] posiciones = {2, 3, 1, 4, 0};
		String [] palabras = {"?", "tal", "hola", "que", "amigo"};
		
		for (int i=0;i<posiciones.length;i++) {
			
			//System.out.println(posiciones[i]);
			System.out.print(" " + palabras[posiciones[i]]);
			
		}

	}

}

//Leer una frase y saber si es un palindromo o no