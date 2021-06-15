package pruebas.Nacho.Pila;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Pila pilaClima = new Pila();
        Pila climaPilaInvertida = new Pila();

        pilaClima.push(new Clima("Tacoronte", 20, 70));
        pilaClima.push(new Clima("La matanza", 22, 60));
        pilaClima.push(new Clima("La victoria", 18, 80));
        pilaClima.push(new Clima("Valle guerra", 25, 50));

        //climaPilaInvertida= pilaClima.invertirPila();

        //climaPilaInvertida.mostrarPila();
        pilaClima.toString();
        //guardarEnFichero.guardar(climaPilaInvertida);
        Pila recuperada;
       //recuperada= (Pila)leer("C:\\Ficheros\\Climas.dat");


        //recuperada.getTamanio();
        //recuperada.pilaIsEmpty();
    }
/*
    public static Object leer(String ruta) {
        Object objeto = null;
        try(ObjectInputStream recuperar_objeto = new ObjectInputStream((new FileInputStream(ruta)))){
            objeto = (Object) recuperar_objeto.readObject();
            return (Object) recuperar_objeto.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objeto;
    }

 */
}
