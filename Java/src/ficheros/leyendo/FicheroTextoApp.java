package ficheros.leyendo;

import java.io.*;
//Importamos todas las clases de java.io.
public class FicheroTextoApp {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("./Java/src/ficheros/leyendo/archivo.txt");
            FileReader fr=new FileReader("./Java/src/ficheros/leyendo/archivo.txt")){
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write("Esto es una prueba ");
            fw.write(97);
            //Guardamos los cambios del fichero
            fw.flush();
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}