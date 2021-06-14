package ficheros.leyendo;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheros {
    public static void main(String[] args) {
        LeerFichero fichero = new LeerFichero();
        fichero.lee();
    }
}

class LeerFichero {
    FileReader fr;
    public void lee(){
        try {
            fr = new FileReader("./Java/src/ficheros/leyendo/archivo.txt");

            int datos = 0;

            while (datos != -1){
                char letra=(char)datos;

                //int prueba = Integer.parseInt(String.valueOf(letra));
                System.out.println(letra);
                datos = fr.read();
            }

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        }finally {
            try {
                fr.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
