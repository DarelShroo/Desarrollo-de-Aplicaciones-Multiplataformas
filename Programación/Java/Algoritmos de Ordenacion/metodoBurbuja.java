package clasePrueba;

public class metodoBurbuja {

	public static void main(String[] args) {
        int [] matriz1 = {9,5,2,1,8,7,6,3,4};
        //METODO DE ORDENAMIENTO DEL METODO BURBUJA
        int i,j,aux=0;
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1.length; j++) {
                if(matriz1[i] < matriz1[j]) {
                    aux=matriz1[i];
                    matriz1[i]=matriz1[j];
                    matriz1[j]=aux;
                }
            }
        }
        for (int k = 0; k < matriz1.length; k++) {
            System.out.println(matriz1[k]);
        }
	}
}
