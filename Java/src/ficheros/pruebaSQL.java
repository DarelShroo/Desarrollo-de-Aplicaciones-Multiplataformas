package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pruebaSQL {
    public static void main(String[] args) {
        lee();
    }

    static FileReader fr;
    public static void lee(){
        String contenidoSQL = "";
        boolean esComentario = false;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("./Java/src/Ficheros/originalSQL.sql"))){
                String leerlinea;
                leerlinea = br.readLine();
                while(leerlinea !=null){
                    leerlinea = br.readLine();
                    if(leerlinea.substring(0,1) == "/*" ||leerlinea.substring(0,1) == "--"){
                       if(leerlinea.substring(0,1) == "/*" ){
                           esComentario = true;
                       }
                    }else if(leerlinea.substring(leerlinea.length()-2,leerlinea.length()-1) == "*/" && esComentario){
                        esComentario=false;
                    }else if(esComentario) {
                        contenidoSQL+=leerlinea;
                        System.out.println(leerlinea);
                    }
                }
                //escribir(contenidoSQL);
            } catch (IOException e) {
                e.printStackTrace();
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
   /* public static void escribir(String contenidoSQL){
        try (FileWriter escritura = new FileWriter("./Java/src/ficheros/archivoSQL.txt");){
            for (char c: contenidoSQL.toCharArray()) {
                escritura.write(c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }*/
}
