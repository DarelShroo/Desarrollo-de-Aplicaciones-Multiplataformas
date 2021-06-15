package ListasEnlazadas;

public class Main {
    public static void main(String[] args) {
       /* Nodo primero = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercero = new Nodo("Hola");

        primero.enlazarSiguiente(segundo);
        primero.obtenerSiguiente().enlazarSiguiente(tercero);

        System.out.println(primero.obtenerSiguiente().obtenerValor().toString());*/

        /*ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Está vacía "+lista.estaVacia());
        lista.addPrimero("Jorge");
        lista.addPrimero(20);
        lista.addPrimero("Hola que tal");
        lista.addPrimero(3);

        System.out.println("Primer elemento "+lista.obtener(0));
        System.out.println("Ultimo "+ lista.obtener(lista.size()-1));
        System.out.println("Index 2: "+ lista.obtener(2));

        System.out.println("Está vacía "+lista.estaVacia());
        System.out.println("Tamaño "+lista.size());*/

        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Está vacia: "+ lista.estaVacia());
        lista.addPrimero(6);
        lista.addPrimero(5);
        lista.addPrimero(4);
        lista.addPrimero(3);
        lista.addPrimero(2);
        lista.addPrimero(1);

        lista.cortar(3);

        System.out.println("Primero: " +lista.obtener(0));
        System.out.println("Index 2: "+ lista.obtener(2));
        System.out.println("Ultimo: " + lista.obtener(lista.size()-1));
        System.out.println("Tamaño: "+ lista.size());
        System.out.println("Está vacia: "+ lista.estaVacia());

    }
}
