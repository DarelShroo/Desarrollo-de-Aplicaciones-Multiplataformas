package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {
    public static void main(String[] args) {
        int contador = 0;
        int datos_entrada[] = new int[253825];
        try{
            FileInputStream archivo_lectura = new FileInputStream("./Java/src/leyendo_escribiendo_bytes/imagen.jpg");
            boolean final_ar = false;

            while(!final_ar){
                int byte_entrada = archivo_lectura.read();

                if(byte_entrada!= -1){
                    datos_entrada[contador] = byte_entrada;
                }else{
                    final_ar = true;
                }
                System.out.println(datos_entrada[contador]);
                contador++;
            }
            archivo_lectura.close();
            crea_fichero(datos_entrada);
        }catch (IOException e){
            System.out.println("No se encuentra la imágen");
        }
        System.out.println(contador);
    }
    static  void crea_fichero(int datos_nuevo_fichero[]){
        try {
            FileOutputStream fichero_nuevo = new FileOutputStream("./Java/src/leyendo_escribiendo_bytes/imagen_generada.jpg");
            for(int i = 0; i< datos_nuevo_fichero.length;i++){
                fichero_nuevo.write(datos_nuevo_fichero[i]);
            }
        fichero_nuevo.close();
        }catch (IOException e){
            System.out.println("Error al crear el archivo");
        }
    }
}
