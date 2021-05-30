package ficheros.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LecturaEscritura {
    public static void main(String[] args) {
        try(FileInputStream archivoEntrada = new FileInputStream("./Java/src/ficheros/bytes/pokemon.jpg")){
            boolean finalArchivo = false;
            int contador = 0;
            int datos_entrada[] = new int[58044];
            while(!finalArchivo){
                int byte_entrada = archivoEntrada.read();
                if(byte_entrada!=-1){
                    datos_entrada[contador] = byte_entrada;
                }
               else{
                    finalArchivo = true;
                }
                System.out.println(datos_entrada[contador]);
                contador++;
            }
            System.out.println(contador);
            crearFichero(datos_entrada);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    static void crearFichero(int datos[]){
        try(FileOutputStream archivoSalida = new FileOutputStream("./Java/src/ficheros/bytes/pokemon2.jpg")){

            for (int dato: datos) {
                archivoSalida.write(dato);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
