package pruebas.Nacho.Pila;

import java.io.*;

public class Main implements Serializable{
    public static void main(String[] args) {
        Pila pilaClima = new Pila();
        Pila pilaInvertidaClima = new Pila();

        pilaClima.push(new Clima("Tacoronte", 20, 70));
        pilaClima.push(new Clima("La matanza", 22, 60));
        pilaClima.push(new Clima("La victoria", 18, 80));
        pilaClima.push(new Clima("Valle guerra", 25, 50));

        System.out.println("Pila sin invertir");
        System.out.println(pilaClima.toString());

        pilaInvertidaClima = pilaClima.invertirPila();

        System.out.println("Pila invertida");
        System.out.println(pilaInvertidaClima);

        pilaInvertidaClima.pop();
        System.out.println("Pila invertida con el ultimo elemento borrado");
        System.out.println(pilaInvertidaClima.toString());


        guardarEnFichero.guardar(pilaInvertidaClima);

        Pila recuperada = (Pila) leerFichero.leer("C:\\Ficheros\\Climas.dat");


        System.out.println("Pila recuperada de fichero");
        System.out.println(recuperada.toString());

    }
}
