package ficheros.leyendo;

import java.io.*;
//Importamos todas las clases de java.io.
public class FicheroTextoApp {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("./Java/src/ficheros/originalSQL.sql"), "UTF-8"));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./Java/src/ficheros/salida.SQL."), "utf-8"))){
           // BufferedReader br = new BufferedReader(fr);
            boolean esComentario = false;
            //Leemos el fichero y lo mostramos por pantalla
            String contenido = "";
            String valor=br.readLine();
            int i = 0;
            //while(){
                while(valor!=null){
                if(valor.length()-1<0){
                    contenido+="\n";
                }
                if(valor.length()>0){
                System.out.println(valor);
                if(valor.charAt(0) =='/') {
                    esComentario = true;
                    if (valor.charAt(valor.length()-1) == '/') {
                        contenido += valor;
                        esComentario = false;
                    }
                    contenido += valor;
                }

                if(valor.charAt(0)=='-'){
                    contenido+=valor;
                }
                if(esComentario){
                    contenido += valor;
                }
                if(valor.charAt(valor.length()-1)=='/'){
                    esComentario = false;
                }
                }
                    valor=br.readLine();
            }
                out.write(contenido);
                out.flush();
                //fw.write(contenido);
            //Guardamos los cambios del fichero
            //fw.flush();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}