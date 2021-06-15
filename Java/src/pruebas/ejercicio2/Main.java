package pruebas.ejercicio2;

import java.io.File;

public class Main {
    public static void main(String[] args) throws PalabrasInvalidasException {
        PalabrasEncadenadas palabras = new PalabrasEncadenadas();
        File f = new File("C:\\ficheros\\examen.dat");
        EncadenadasPersistente juego = new EncadenadasPersistente();

        System.out.println(palabras.iniciar());

        System.out.println(palabras.siguiente());
        System.out.println(palabras.siguiente());
        System.out.println(palabras.siguiente());
        System.out.println(palabras.siguiente());
        System.out.println(palabras.siguiente());


        juego.iniciar();
        juego.siguiente();

        juego.guardar(f);

        System.out.println("despues de cargar "+juego.cargar(f));
    }
}
