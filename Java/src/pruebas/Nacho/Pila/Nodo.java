package pruebas.Nacho.Pila;

public class Nodo {
    Object valor; // siempre van a existir
    Nodo siguiente;

    public Nodo(Object valor){ // el tipo de objeto que se va a guardar
        this.valor = valor;
        siguiente = null; //valor de inicio a nulo
    }
}
