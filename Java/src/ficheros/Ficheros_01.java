package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros_01 {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("./archivo2.txt");

            fw.write("Hola mundo");

            fw.close();
        } catch (IOException e) {
            Logger.getLogger(Ficheros_01.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
