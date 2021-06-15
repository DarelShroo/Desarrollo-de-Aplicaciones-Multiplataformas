package Pilas;

public class NodoPilaDinamica<T> {
    private T elemento;
    private NodoPilaDinamica<T> siguiente;

    public NodoPilaDinamica(T elemento, NodoPilaDinamica<T> siguiente){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public NodoPilaDinamica<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPilaDinamica<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return elemento+"\n";
    }
}
