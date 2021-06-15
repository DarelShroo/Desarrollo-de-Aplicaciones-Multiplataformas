package Examenes.SegundoTrimestre.ejercicio1;

import java.awt.*;

public class Ejercicio1 {
    private String encontrada = "Frase no encontrada";
    private String array[][];
    private String frase;
    private Point c1;
    private Point c2;

    public Ejercicio1(String array[][], String frase, Point c1, Point c2){
        this.array = array;
        this.frase = frase;
        this.c1 = c1;
        this.c2 = c2;
        encontrarFrase();
    }

    private String encontrarFrase(){
        for (int y= c1.x;y<c2.x;y++) {
            for(int x = c1.x;x<c2.x;x++){
                if(array[x][y].equals(frase)){
                    encontrada = "Frase encontrada en posición x-"+x+" y-"+y;
                    return encontrada;
                }
            }
        }
        return encontrada;
    }

    @Override
    public String toString(){
        return encontrada;
    }
}
