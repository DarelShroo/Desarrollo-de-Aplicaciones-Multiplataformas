package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class LeerNumerosCreciente {

    public void leer (){
        try (BufferedReader br = new BufferedReader(new FileReader("./Java/src/Ficheros/archivo2.txt"))){
            String leerlinea;
            leerlinea = br.readLine();
            while(leerlinea !=null){
                filtroDeNumeros(leerlinea);
                leerlinea = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void filtroDeNumeros(String StringConNumeros) {
        String esNumero="";
        Float anteriorNumero = 0f;

        int index = 0;
        try {
            for(;index<StringConNumeros.length();index++){
                if(Character.isDigit(StringConNumeros.charAt(index))){
                    esNumero+= StringConNumeros.charAt(index);
                }else if(StringConNumeros.charAt(index)=='-' && Character.isDigit(StringConNumeros.charAt(index+1))){
                    filtroDeNumerosNegativos(index, StringConNumeros, anteriorNumero);
                }else if(!(esNumero == "")){
                    comparaNumero(Float.parseFloat(esNumero), anteriorNumero);
                    anteriorNumero =Float.parseFloat(esNumero);
                    esNumero= "";
                }
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
    public void filtroDeNumerosNegativos(int index, String stringNumeroNegativo, Float anteriorNumero){
        String negativo = Character.toString(stringNumeroNegativo.charAt(index));
        index++;
        while (Character.isDigit(stringNumeroNegativo.charAt(index))){
            negativo += Character.toString(stringNumeroNegativo.charAt(index));
            index++;
        }
        comparaNumero(Float.parseFloat(negativo), anteriorNumero);
    }

    public void comparaNumero(Float siguienteNumero, Float anteriorNumero){
        if((anteriorNumero <= siguienteNumero)){
            System.out.print(siguienteNumero+ " ");
        }else {
            System.out.print("\n"+siguienteNumero + " ");
        }
        anteriorNumero = siguienteNumero;
    }
}

