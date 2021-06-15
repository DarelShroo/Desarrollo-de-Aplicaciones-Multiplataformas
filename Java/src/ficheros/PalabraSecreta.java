package ficheros;

import java.io.*;
import java.util.Scanner;

public class PalabraSecreta {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("./Java/src/ficheros/palabrasSecretas.txt"), "UTF-8"))){

            String valor=br.readLine();
            int totalPalabras = Integer.parseInt(valor);
            int contador = 0;
            int aleatorio =(int)(Math.random()*totalPalabras) ;

            String palabrasCandidatas[] = new String[totalPalabras];

            while(contador < totalPalabras){
                valor=br.readLine();
                palabrasCandidatas[contador] = valor;
                contador++;
            }
           String palabraSecreta = palabrasCandidatas[aleatorio];
            char palabraPorAdivinar [] = new char[palabraSecreta.length()];
            for(int index = 0; index < palabraSecreta.length();index++){
                palabraPorAdivinar[index]='-';
            }

            int intentos = 10;
            char letraCandidata = ' ';
            Scanner in = new Scanner(System.in);

            while(intentos > 0 && !(String.valueOf(palabraPorAdivinar).equals(palabraSecreta))){
                System.out.println("Palabra Secreta: " + new String(palabraPorAdivinar));
                System.out.println("Escribe una letra - Te quedan "+intentos +" intentos");
                letraCandidata =  in.next().charAt(0);
                for(int index = 0; index < palabraSecreta.length();index++){
                    if(palabraSecreta.charAt(index) == letraCandidata){
                        palabraPorAdivinar[index] = letraCandidata;
                    }
                }
                intentos--;
            }

            if(String.valueOf(palabraPorAdivinar).equals(palabraSecreta)){
                System.out.println("Felicidades has acertado la palabra secreta \"" + palabraSecreta+"\"");
            }else {
                System.out.println("Vaya! no has acertado la palabra");
            }
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}
