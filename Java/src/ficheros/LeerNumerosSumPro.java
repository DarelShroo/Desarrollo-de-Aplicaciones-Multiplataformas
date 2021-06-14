package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;

public class LeerNumerosSumPro {
    int index;
    float suma;
    boolean operacionSuma;
    boolean operacionMulti;
    boolean dentroParentesis;
    LinkedList<String> operacion;

    {
        index =0;
        suma = 0F;
        operacion =new LinkedList<>();
        operacionSuma = false;
        operacionMulti = false;
        dentroParentesis=false;
    };

    public void leer (){
        try (BufferedReader br = new BufferedReader(new FileReader("./Java/src/Ficheros/archivo.txt"))){
            String Leerlinea ="";
            String stringConNumeros = "";
            while(Leerlinea !=null){
                Leerlinea = br.readLine();
                if(Leerlinea!=null){
                    stringConNumeros+= Leerlinea;
                }
                stringConNumeros += " ";
            }
            filtroNumeros(stringConNumeros);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void filtroNumeros(String contenido) throws StringIndexOutOfBoundsException{
           while(index<contenido.length()-1){
               if(Character.toLowerCase(contenido.charAt(index)) == 's' &&
                       Character.toLowerCase(contenido.charAt((index+1 > contenido.length()-1) ? contenido.length()-1:index+1 ))=='u' &&
                       Character.toLowerCase(contenido.charAt((index+2 > contenido.length()-1) ? contenido.length()-1:index+2 ))=='m'){
                   //sumaNumeros(contenido);
               }else if(Character.toLowerCase(contenido.charAt(index)) == 'p' &&
                       Character.toLowerCase(contenido.charAt((index+1 > contenido.length()-1) ? contenido.length()-1:index+1 ))=='r' &&
                       Character.toLowerCase(contenido.charAt((index+2 > contenido.length()-1) ? contenido.length()-1:index+2 ))=='o'){
                   multiplicaNumeros(contenido);
               }
               index++;
           }
    }

    private void multiplicaNumeros(String contenido){
        String stringNumeros = "";
        operacionMulti = true;
        suma =1F;
        System.out.print("multiplicacion: ");
        while(index < contenido.length()-1 && operacionMulti)
        {
            if(contenido.charAt(index)=='-' && Character.isDigit(contenido.charAt((index+1 > contenido.length()-1) ? contenido.length()-1:index+1 ))){
                if(index != contenido.length()-1){
                    stringNumeros ="";
                    stringNumeros+=numerosNegativos(contenido);
                    operacion.add("("+stringNumeros+"f)");
                    stringNumeros="";
                };
            }else if(contenido.charAt(index)==' ' && stringNumeros.length() > 0){
                suma*=Float.parseFloat(stringNumeros);
                operacion.add(stringNumeros);
                stringNumeros="";
            }else if(contenido.charAt(index)=='.'){
                stringNumeros+=contenido.charAt(index);
            }else if(Character.isDigit(contenido.charAt(index))){
                stringNumeros+=contenido.charAt(index);
            }
            index++;
            if(Character.toLowerCase(contenido.charAt(index)) == 's' &&
                    Character.toLowerCase(contenido.charAt((index+1 > contenido.length()-1) ? contenido.length()-1:index+1 ))=='u' &&
                    Character.toLowerCase(contenido.charAt((index+2 > contenido.length()-1) ? contenido.length()-1:index+2 ))=='m'){
                operacionMulti=false;
                visualizarDatos();
                //sumaNumeros(contenido);
            }
        }
        if (operacionMulti){
            visualizarDatos();
        }
    }

    private float numerosNegativos(String contenido) {
        String numeroNegativo="";
        while((contenido.charAt(index)!=' ') &&
                !(contenido.charAt(index)=='-' ) &&
                Character.isDigit(contenido.charAt(index))
                 && index < contenido.length()-1 || contenido.charAt(index)=='.'){

            numeroNegativo+=contenido.charAt(index);
            System.out.println(numeroNegativo);
            index++;
        }
        suma*=Float.parseFloat(numeroNegativo);
        return Float.parseFloat(numeroNegativo);
    }

    /*private void sumaNumeros(String contenido) throws StringIndexOutOfBoundsException{
        String stringNumeros = "";
        operacionSuma = true;
        System.out.print("suma: ");
        while(index < contenido.length()-1 && operacionSuma){
            if(contenido.charAt(index)=='-' && Character.isDigit(contenido.charAt(index+1))){
                if(index != contenido.length()-1){
                    stringNumeros ="";
                    stringNumeros+=numerosNegativos(contenido);
                    operacion.add("("+stringNumeros+"f)");
                    stringNumeros="";
                };
            }else if(contenido.charAt(index)==' ' &&
                    stringNumeros.length() > 0 &&
                    Character.isDigit(contenido.charAt(index-1))){
                suma+=Float.parseFloat(stringNumeros);
                operacion.add(stringNumeros);
                stringNumeros="";
            }else if(contenido.charAt(index)=='.'){
                stringNumeros+=contenido.charAt(index);
            }else if(Character.isDigit(contenido.charAt(index))){
                stringNumeros+=contenido.charAt(index);
            }
            index++;
            if(Character.toLowerCase(contenido.charAt(index)) == 'p' &&
                    Character.toLowerCase(contenido.charAt((index+1 > contenido.length()-1) ? contenido.length()-1:index+1 ))=='r' &&
                    Character.toLowerCase(contenido.charAt((index+2 > contenido.length()-1) ? contenido.length()-1:index+2 ))=='o'){
                operacionSuma=false;
                visualizarDatos();
                multiplicaNumeros(contenido);
            }
        }
        if(operacionSuma){
            visualizarDatos();
        }
    }*/

    private void visualizarDatos(){
        Iterator i = operacion.iterator();
        String anterior;
        String imprime = "";
        for (String caracter: operacion) {
            anterior = caracter;
            imprime+=caracter;
            if(caracter.charAt(0)=='('){
                imprime+="*";
            }
            if(Character.isDigit(anterior.charAt(anterior.length()-1)) &&
                    Character.isDigit(caracter.charAt(caracter.length()-1))){
                imprime+="*";
            }
        }
        if (imprime.length()>1)
            System.out.print(imprime.substring(0,imprime.length()-1)+" = "+suma);
        System.out.print("\n");
        operacion.clear();
        suma = 0f;
    }
}
