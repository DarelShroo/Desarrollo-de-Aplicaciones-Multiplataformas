package pruebas.Nacho;

import java.io.BufferedReader;

public class palabrasEncadenadas {
    protected static final int MINIMO_P = 4;
    protected String[] arrayPalabras;

    private palabrasEncadenadas() {

    }

    public palabrasEncadenadas(String[] palabras)  throws palabrasInvalidasException{
        if (palabras == null || palabras.length < MINIMO_P){
            throw new palabrasInvalidasException("No se puede");
        }

        for (int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
            if(palabras[i] == null || palabras[i].equals("")){
                throw new palabrasInvalidasException("No se puede");
            }
        }

        arrayPalabras = palabras;
        //arrrayPalabras.addAll(palabras)

    }

    //    protected String[] palabras = {"a", "b", "c", "", null};
}
