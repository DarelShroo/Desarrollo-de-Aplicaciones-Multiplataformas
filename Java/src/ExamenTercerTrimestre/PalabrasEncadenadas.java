package ExamenTercerTrimestre;

import java.util.Iterator;
import java.util.LinkedList;

public class PalabrasEncadenadas {
    public LinkedList<String> tabla = new LinkedList<String>();
    private int minPalabras = 4;
    public int aux = 0;
    public int length;

    public PalabrasEncadenadas(LinkedList<String> tabla) throws Exception {
        this.tabla = tabla;
        for (String palabra: tabla) {
            if(palabra == null || palabra == "" || tabla.isEmpty()){
                throw new Exception("PalabrasInvalidasException");
            }else{
                length++;
            }
        }if (length<minPalabras){
            throw new Exception("PalabrasInvalidasException");
        }
    }

    public PalabrasEncadenadas() {
        tabla.add("resulta");
        tabla.add("estudiar");
        tabla.add("alineante");
        tabla.add("alucinante");
    }

    public String iniciar(){
        if (aux < 1){
            String palabra = tabla.get((int)Math.floor(Math.random()*(0-(length-1+1))+(length-1+1)));
            aux++;
            return palabra;
        }
        return null;
    }

    public String siguiente() throws Exception {
        if(aux > 1){
            Iterator<String> i = tabla.iterator();
            if(i.hasNext()){
                return i.next();
            }else{
                throw new Exception("PalabrasInvalidasException");
            }
        }else{
            return null;
        }
    }
}
