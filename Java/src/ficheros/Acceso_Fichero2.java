package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class  Acceso_Fichero2{
    FileReader entrada;
    int cantidadNumeros = 0;
    public void leer()  {
        try {
            entrada = new FileReader("./Java/src/Ficheros/archivo2.txt");
            BufferedReader mibuffer = new BufferedReader(entrada);
            /*int c =entrada.read();*/
            String linea ="";
            String totalLineas = "";
            while(linea !=null){
                //char c;
                //letra = (char) c;
                linea = mibuffer.readLine();
                //System.out.print(letra);
                //c = (char) entrada.read();
                if(linea!=null){
                    totalLineas += linea;
                }
                totalLineas += " ";
            }
            esNumero(totalLineas);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void esNumero(String totalLineas){
        String esNumero="";
        int suma = 0;
        for(int i = 0; i<totalLineas.length();i++){
            if(Character.isDigit(totalLineas.charAt(i))){
                esNumero += totalLineas;
            }else {
                suma += Integer.parseInt(esNumero);
                esNumero = "";
                this.cantidadNumeros++;
            }
        }
        media(suma, cantidadNumeros);
    }
    public void media(int suma, int cantidadNumeros){
        System.out.println(suma/cantidadNumeros);
    }
}

