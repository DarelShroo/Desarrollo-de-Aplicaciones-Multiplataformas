package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;


class LeerNumerosCreciente {
    int cantidadNumeros=0;
    int suma = 0;
    int index = 0;
    int anteriorNumero;

    public void leer (){
        try (BufferedReader br = new BufferedReader(new FileReader("./Java/src/Ficheros/archivo2.txt"))){
            String Leerlinea ="";
            String stringConNumeros = "";
            while(Leerlinea !=null){
                Leerlinea = br.readLine();
                if(Leerlinea!=null){
                    stringConNumeros+= Leerlinea;
                }
                stringConNumeros += " ";
            }
            filtroDeNumeros(stringConNumeros);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void filtroDeNumeros(String StringConNumeros) throws ArrayIndexOutOfBoundsException {
        String esNumero="";
        try {
            for(;index<StringConNumeros.length();index++){
                if(Character.isDigit(StringConNumeros.charAt(index))){
                    esNumero+= StringConNumeros.charAt(index);
                }else if(StringConNumeros.charAt(index)=='-' && Character.isDigit(StringConNumeros.charAt(index+1))){
                    filtroDeNumerosNegativos(index, StringConNumeros);
                }else if(!(esNumero == "") && esNumero.chars().allMatch( Character::isDigit )){
                    suma(Integer.parseInt(esNumero));
                    comparaNumero(Integer.parseInt(esNumero));
                    esNumero= "";
                    cantidadNumeros++;
                }
            }
            media(suma, cantidadNumeros);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
    public void filtroDeNumerosNegativos(int pos, String stringNumeroNegativo){
        String negativo = Character.toString(stringNumeroNegativo.charAt(pos));
        pos++;
        while (Character.isDigit(stringNumeroNegativo.charAt(pos))){
            negativo += Character.toString(stringNumeroNegativo.charAt(pos));
            pos++;
        }
        suma(Integer.parseInt(negativo));
        comparaNumero(Integer.parseInt(negativo));
        posSiguiente(pos);
    }

    public void posSiguiente(int pos){
        index = pos;
    }

    public void comparaNumero(int siguienteNumero){
        if((anteriorNumero <= siguienteNumero)){
            //System.out.println(anteriorNumero);
            System.out.print(siguienteNumero+ " ");
        }else {
            System.out.print("\n"+siguienteNumero + " ");
        }
        anteriorNumero = siguienteNumero;
    }

    public void suma(int numero){
        suma+=numero;
    }
    public void media(int suma, int cantidadNumeros){ System.out.println("\n\nmedia de los numeros: \t"+suma/cantidadNumeros);}
}

