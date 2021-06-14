package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerNumerosOperaciones {
    float suma;
    float pro;
    boolean esSuma;
    boolean esFlotante;
    boolean esNegativo;
    int index;
    String esNumero = "";

    {
        index = 0;
        esSuma = false;
        esFlotante=false;
        esNegativo=false;
    }

    public void leer(){
        try(BufferedReader br = new BufferedReader(new FileReader("./Java/src/Ficheros/archivo.txt"))){
            String linea = "";
            String contenidoTotal = null;
            while(linea!=null){
                linea = br.readLine();
                contenidoTotal+=linea;
            }
            filtroNumeros(contenidoTotal);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void filtroNumeros(String contenidoTotal){
        for(; index < contenidoTotal.length()-1; index++){
            if (Character.toLowerCase(contenidoTotal.charAt(index)) == 's' &&
                    Character.toLowerCase(contenidoTotal.charAt(index+1))=='u' &&
                    Character.toLowerCase(contenidoTotal.charAt(index+2))=='m') {
                index+=2;
                esSum(contenidoTotal);
                if(esFlotante && !esNegativo){
                    System.out.print(esNumero+"f" + " = "+suma+"f");
                    esFlotante=false;
                }else{
                    System.out.print(esNumero + " = "+suma + "f");
                }
                esNumero = "";
            }else if(Character.toLowerCase(contenidoTotal.charAt(index)) == 'p' &&
                    Character.toLowerCase(contenidoTotal.charAt(index+1)) == 'r' &&
                    Character.toLowerCase(contenidoTotal.charAt(index+2)) == 'o'){
                index+=2;
                //esPro(contenidoTotal);
            }
        }
    }
    private void esFlotante(String contenidoTotal) {
        if (esNegativo){
            index++;
            esNumero+=contenidoTotal.charAt(index);
            index++;
            esNegativo=false;
        }else{
            esNumero = contenidoTotal.charAt(index)+".";
            esFlotante=true;
            index+=2;
        }
        while (Character.isDigit(contenidoTotal.charAt(index))){
            esNumero+=contenidoTotal.charAt(index);
            index++;
        }
        if(esNumero!=""){
            suma+=Float.parseFloat(esNumero);
        }
    }

    public void filtroNumeroNegativo(String contenidoTotal){
        esNegativo = true;
        System.out.print("(");
        String esNumeroNegativo ="-";
        index++;
        while(Character.isDigit(contenidoTotal.charAt(index))){
            if (Character.isDigit(contenidoTotal.charAt(index)) && contenidoTotal.charAt(index+1) =='.' && Character.isDigit(contenidoTotal.charAt(index+2))) {
                esNumeroNegativo+=contenidoTotal.charAt(index);
                esNumero = esNumeroNegativo;
                esFlotante(contenidoTotal);
            }else{
                esNumeroNegativo+=contenidoTotal.charAt(index);
                index++;
                System.out.print(esNumeroNegativo);
                esNumero="";
            }
            System.out.print(esNumero+"f)");
            if(esNumero!=""){
                suma+=Float.parseFloat(esNumero);
            }
            esNumeroNegativo="";
            esNumero="";
        }
    }

    public void esSum(String contenidoTotal){
        index+=2;
        System.out.print(
                "suma: "
        );
        while(Character.isDigit(contenidoTotal.charAt(index)) ||contenidoTotal.charAt(index)==' '||contenidoTotal.charAt(index)=='.' ||contenidoTotal.charAt(index)=='-'){
            if(Character.isDigit(contenidoTotal.charAt(index))){
                if (Character.isDigit(contenidoTotal.charAt(index)) && contenidoTotal.charAt(index+1) =='.'  && Character.isDigit(contenidoTotal.charAt(index+2))) {
                    esFlotante(contenidoTotal);
                }else{
                    esNumero+=contenidoTotal.charAt(index);
                    index++;
                }
            }else if(contenidoTotal.charAt(index)=='-' && Character.isDigit(contenidoTotal.charAt(index+1))){
                filtroNumeroNegativo(contenidoTotal);
            }else{
                if(esFlotante){
                    System.out.print(esNumero+"f");
                    esFlotante=false;

                }else{
                    System.out.print(esNumero);
                }
                if(!(index == contenidoTotal.length()-1) && contenidoTotal.charAt(index+1) != ' ' && Character.isDigit(contenidoTotal.charAt(index+1)) || Character.isDigit(contenidoTotal.charAt(index+2))){
                    System.out.print("+");
                }
                index++;
                if(esNumero!=""){
                    suma+=Float.parseFloat(esNumero);
                }
                esNumero = "";
            }
        }
    }
/*
    public void esPro(String contenidoTotal){

    }*/
}
