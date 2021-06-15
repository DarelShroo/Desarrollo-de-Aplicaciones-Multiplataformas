package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumerosCreciente2 {
    public static void main(String[] args) {
        File f = new File("C:\\ficheros\\numeros.txt");
        try {
            Scanner sc = new Scanner(f);

            int numSiguiente = 0;
            int numAnterior = 0;
            while (sc.hasNext()) {
                numSiguiente=sc.nextInt();
                if (numAnterior<=numSiguiente){
                    System.out.print(numSiguiente+"\t");
                    numAnterior = numSiguiente;
                }else{
                    System.out.print("\n"+numSiguiente+"\n");
                    numAnterior = numSiguiente;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
