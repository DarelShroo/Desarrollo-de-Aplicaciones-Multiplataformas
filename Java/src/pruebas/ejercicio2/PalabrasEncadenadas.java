package pruebas.ejercicio2;

import java.util.Random;

public class PalabrasEncadenadas{
    protected String [] tabla;
    protected final int minPalabras = 4;
    protected boolean iniciado;
    protected char letra;

    public PalabrasEncadenadas(){
        this.tabla = new String[]{"resulta", "estudiar", "alineante", "alucinante"};
    }

    public PalabrasEncadenadas(String[] tabla) throws PalabrasInvalidasException {
        this.tabla = tabla;
        compruebaTabla(tabla);
    }

    protected String iniciar(){
        String palabra;
        if(iniciado){
            return null;
        }else{
            palabra = tabla[new Random().nextInt(tabla.length)];
            iniciado = true;
        }
        this.letra = palabra.charAt(palabra.length()-1);
        return palabra;
    }

    protected String siguiente() throws PalabrasInvalidasException {
        String siguientePalabra = null;
        int i = 0;

        if(!iniciado){
            return null;
        }

        while(tabla[i].charAt(0) != this.letra && i < tabla.length-1){
            i++;
        }
        if(tabla[i].charAt(0) == this.letra){
            siguientePalabra = tabla[i];
        }
        if(siguientePalabra == null){
            throw new PalabrasInvalidasException("No encuentra siguiente palabra");
        }
        this.letra = siguientePalabra.charAt(siguientePalabra.length()-1);
        return siguientePalabra;
    }

    protected void compruebaTabla(String[] tabla) throws PalabrasInvalidasException{
        if (tabla != null){
            if(tabla.length < minPalabras){
                throw new PalabrasInvalidasException("No se puede");
            }
            for(String p: tabla){
                if(p==null || p.length() == 0){
                    throw new PalabrasInvalidasException("No se puede");
                }
            }
        }else {
            throw new PalabrasInvalidasException("No se puede");
        }
    }

}
