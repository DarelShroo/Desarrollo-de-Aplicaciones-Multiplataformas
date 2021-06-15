package Colecciones;
import java.util.*;

public class PruebaLinkedLista {
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<String>();

        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Cristina");
        personas.add("Laura");

        System.out.println(personas.size());

        ListIterator<String> it = personas.listIterator();
        it.next();
        it.add("Darel");

        for(String persona : personas){
            System.out.println(persona);
        }
    }
}
