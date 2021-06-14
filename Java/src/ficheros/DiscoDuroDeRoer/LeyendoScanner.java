package ficheros.DiscoDuroDeRoer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeyendoScanner {
    public static void main(String[] args) {
        File f = new File("C:\\ficheros\\numeros.txt");
        File  f_salida = new File("C:\\ficheros\\numeros_mayores.txt");

        try (Scanner sc = new Scanner(f);Scanner sc_usuario = new Scanner(System.in)){
            PrintWriter pw = new PrintWriter(f_salida);

            int num;
            System.out.println("Introduce un numero");
            int num_usuario = sc_usuario.nextInt();

            System.out.println("");
            System.out.println("Fichero");
            while(sc.hasNext()){
                num = sc.nextInt();
                if(num > num_usuario){
                    pw.println(num);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
