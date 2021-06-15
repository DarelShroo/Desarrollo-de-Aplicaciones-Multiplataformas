package pruebas.Nacho.Pila;

public class Nodo <T>{
    private T valor; // siempre van a existir
    private Nodo siguiente;

    public Nodo(T valor, Nodo<T> siguiente){ // el tipo de objeto que se va a guardar
        this.valor = valor;
        siguiente = null; //valor de inicio a nulo
    }

    public Nodo<T> getSiguiente(){return siguiente;}
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getElemento() {
        return valor;
    }

    public void setElemento(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor+"\n";
    }
}
