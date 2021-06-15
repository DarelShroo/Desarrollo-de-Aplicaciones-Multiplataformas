package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {
    public static void main (String[] args){
        Leer_Fichero accediendo = new Leer_Fichero();

        accediendo.leer();
    }

    static class  Leer_Fichero{
        public void leer()  {
            try {
                entrada = new FileReader("./Java/src/Ficheros/archivo2.txt");
                BufferedReader mibuffer = new BufferedReader(entrada);
                /*int c =entrada.read();*/
                String linea ="";

                while(linea !=null){
                    /*char letra = (char) c;*/
                    linea = mibuffer.readLine();
                    /*System.out.print(letra);*/
                    /*c = entrada.read();*/
                    if(linea!=null){
                        System.out.println(linea);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    entrada.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileReader entrada;
    }
}
