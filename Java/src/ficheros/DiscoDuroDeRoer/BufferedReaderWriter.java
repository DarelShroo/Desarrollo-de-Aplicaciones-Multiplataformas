package ficheros.DiscoDuroDeRoer;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        leer();
    }

    public static void read(){
        String texto = "hola";
        String text2 = "adios";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ficheros\\fichero1.txt"))){

            bw.write(texto); /// Para linea a linea habría que poner /r/n
            bw.write(text2);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leer(){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\ficheros\\fichero1.txt"))){
            String linea;
            while((linea = br.readLine())!=null){
                System.out.println(linea);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
