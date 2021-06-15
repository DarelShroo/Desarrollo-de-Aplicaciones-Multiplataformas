package ficheros.DiscoDuroDeRoer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeyendoConScanner {
    public static void main(String[] args) {
        File f = new File("C:\\ficheros\\numeros.txt");
        File f_salida = new File("C:\\ficheros\\numeros2.txt");
        PrintWriter pw = null;

        try {
            Scanner sc = new Scanner(f);
            Scanner sc_usuario = new Scanner(System.in);
            pw= new PrintWriter(f_salida);
            int numero = 0;
            int num_usuario =0;
            System.out.println("Introduce un numero");
            num_usuario = sc_usuario.nextInt();

            System.out.println();
            System.out.println("Fichero");

            while (sc.hasNext()) {
                numero= sc.nextInt();
                if(numero > num_usuario){
                    pw.write(numero);
                }
            }
            pw.flush();
            pw.close();
            sc.close();
            sc_usuario.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
