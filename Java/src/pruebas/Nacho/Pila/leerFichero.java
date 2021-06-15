package pruebas.Nacho.Pila;

import java.io.*;

public class leerFichero implements Serializable {
    public static Object leer(String ruta){
        try{
            ObjectInputStream leer_fichero =  new ObjectInputStream(new FileInputStream(ruta));
            return  leer_fichero.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
