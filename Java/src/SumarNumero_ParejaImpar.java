public class SumarNumero_ParejaImpar {

	public static void main(String[] args) {

		int [] tablaNumeros = {1,2,3,4,5,6,7,8,9,10,11,12};
		int simetricoImpar = 0;
		
		for(int i = 0, j = tablaNumeros.length-1;i < tablaNumeros.length; i++, j--) {
			if((tablaNumeros[i]%2) != 0) {
				simetricoImpar += tablaNumeros[i];
				
			}else if((tablaNumeros[j]%2) != 0) {
				simetricoImpar += tablaNumeros[j];
			}
		}
		
		System.out.println("Tottal suma numeros impar " + simetricoImpar);
	}

}
