package ListasEnlazadas;

public class Nodo {
    Object valor; //Elemento guardado
    Nodo siguiente = null ; // Puntero tipo  NODO

    public Nodo(Object valor){
        this.valor = valor;
    }

    public Object obtenerValor(){
        return valor;
    }

    public void enlazarSiguiente(Nodo n){
        siguiente = n; //apuntamos a otro nodo
    }

    public Nodo obtenerSiguiente(){
        return siguiente; //regresa el valor siguiente
    }
}
