package clasePrueba;


public class ordenamientoBurbuja {

	public static void main(String[] args) {
			
			
			int v[] = {3,4,5,6,7,8,9,9,2,1};
	        int aux;
	        boolean b = false;//desordenado
	        int i =0;
	        
	        while(i < v.length - 1 && b == false )
	        {
	            b = true;
	            
	            for(int j = v.length - 1; j > i; j--)
	            {
	                if(v[j - 1] > v[j])
	                {
	                    aux = v[j - 1];
	                    v[j - 1] = v[j];
	                    v[j] = aux;
	                    b = false;
	                }
	            }
	            i++;
	        }

	        for(i=0;i<v.length;i++) {
	        	System.out.println(v[i]);
	        }
	        

	}

}
