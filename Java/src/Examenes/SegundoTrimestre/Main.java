package Examenes.SegundoTrimestre;
import Examenes.SegundoTrimestre.ejercicio1.Ejercicio1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //  PRIMER EJERCICIO
        Point c1 = new Point();
        Point c2 = new Point();

        //INICIO
        c1.x = 1; //x columnas
        c1.y = 1; //y filas

        //FIN
        c2.x = 4; // x columnas
        c2.y = 2; //y filas

        String frase = "Frase oculta";

        String[][] array = {{"0,0", "0,1", "0,2", "0,3", "0,4", "0,5"},
                {"1,0", "1,1", "1,2", "1,3", "1,4", "1,5"},
                {"2,0", "2,1", "Frase oculta", "2,3", "2,4", "2,5"},
                {"3,0", "3,1", "3,2", "3,3", "3,4", "3,5"}};


        Ejercicio1 ejercicio1 = new Ejercicio1(array, frase, c1, c2);
        System.out.println(ejercicio1.toString());

        //SEGUNDO EJERCICIO

    }

}
