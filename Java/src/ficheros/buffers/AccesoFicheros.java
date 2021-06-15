package ficheros.buffers;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheros {
    public static void main(String[] args) {
        LeerFichero fichero = new LeerFichero();
        fichero.lee();
    }
}

class LeerFichero {
    FileReader fr;
    int posiciones;

    public void lee(){
        try {
            fr = new FileReader("./Java/src/ficheros/buffers/archivo.txt");
            BufferedReader buffer = new BufferedReader(fr);

            //int datos = 0;

            String linea="";
            String numerosString = "";


            while (linea!=null){
                //char letra=(char)datos;
                //int prueba = Integer.parseInt(String.valueOf(letra));
                linea= buffer.readLine();

                if(linea!=null){
                    numerosString += linea+" ";
                }

                //datos =fr.read();
            }
            System.out.println(numerosString);
            int numero = 0;
            String n ="";
            int suma = 0;
            int contador = 1;
            for(int i = 0; i< numerosString.length()-1;i++){
                if(Character.isDigit(numerosString.charAt(i))){
                    //numero = numero + Integer.parseInt(String.valueOf(numerosString.charAt(i)));
                    n += String.valueOf(numerosString.charAt(i));
                } else if(numerosString.charAt(i)== '-'){
                    suma+= esImpar(i, numerosString);
                    i+=posiciones;
                    posiciones = 0;
                }else if (numerosString.charAt(i)==' '){

                    numero = Integer.parseInt(n);

                    suma+=numero;
                    n = "";
                    numero=0;
                    contador++;
                }
            }
            System.out.println(suma);
            System.out.println(contador);
            System.out.println(suma/contador);

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            try {
                fr.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
    public int esImpar(int i, String numeros){
        String imparEsString = "";
        int j = 0;
        while(numeros.charAt(i)!=' '){
            imparEsString+=numeros.charAt(i);
            i++;
            j++;
        }
        int imparEsNumero = Integer.valueOf(imparEsString);
        posiciones=posSiguiente(j);
        return imparEsNumero;
    }

    public int posSiguiente(int j){
        return j;
    }
}
