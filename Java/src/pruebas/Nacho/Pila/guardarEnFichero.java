package pruebas.Nacho.Pila;

import java.io.*;

public class guardarEnFichero {
    public static void guardar(Object objeto){
        try(ObjectOutputStream escribir_fichero =  new ObjectOutputStream(new FileOutputStream("C:\\ficheros\\Climas.dat"))){
            escribir_fichero.writeObject(objeto);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
