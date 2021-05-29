package ficheros.escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        Escribiendo escribiendo = new Escribiendo();
        escribiendo.escribir();
    }
}

class Escribiendo{
    public void escribir(){
        String frase = "Esto es una prueba de escritura2";
        try (FileWriter escritura = new FileWriter("./Java/src/ficheros/escribiendo/archivo.txt", true);){
            for (char c: frase.toCharArray()) {
                escritura.write(c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}