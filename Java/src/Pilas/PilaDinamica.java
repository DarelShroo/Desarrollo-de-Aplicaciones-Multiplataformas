package Pilas;

public class PilaDinamica<T> {
    private NodoPilaDinamica<T> top;
    private int tamanio;

    public PilaDinamica(){
        top = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }
    public int size () {
        return this.tamanio;
    }

    public T top() {
        if(isEmpty()) {
            return null;
        }else {
            return top.getElemento();
        }
    }

    public T pop () {
        if(isEmpty()){
            return null;
        }else {
            T elemento = top.getElemento();
            NodoPilaDinamica<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tamanio--;
            return elemento;
        }
    }

    public void push(T elemento){
        NodoPilaDinamica<T> aux = new NodoPilaDinamica<T>(elemento, top);
        top = aux;
        this.tamanio++;
    }

    public  String toString() {
        if(isEmpty()){
            return "La pila está vacia";
        }else {
            String resultado="";
            NodoPilaDinamica<T> aux = top;
            while(aux!=null){
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }
}
