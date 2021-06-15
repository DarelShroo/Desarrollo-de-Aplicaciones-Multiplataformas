package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<String>();

        paises.add("España");
        paises.add("Colombia");
        paises.add("México");
        paises.add("Perú");

        LinkedList<String> capitales = new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("DF");
        capitales.add("Lima");

        //System.out.println(paises);
        //System.out.println(capitales);

        ListIterator itP = paises.listIterator();
        ListIterator  itC = capitales.listIterator();

        while(itC.hasNext()){ //¿Existe el siguiente de capitales?
            if(itP.hasNext()){ //¿Existe el siguiente de paises?
                 itP.next(); //Si existe el siguiente de paises pues cambia de posición al siguiente.
            }
            itP.add(itC.next()); //Si el siguiente de capitales existe entonces añadelo a paises
        }
        System.out.println(paises);

        itC = capitales.listIterator();

        while (itC.hasNext()){
            itC.next();
            if(itC.hasNext()){
                itC.next();
                itC.remove();
            }
        }
        System.out.println(capitales);

        paises.removeAll(capitales);
        System.out.println(paises);
    }
}
