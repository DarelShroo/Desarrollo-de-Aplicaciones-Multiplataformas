package pruebas.Nacho.Pila;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;

public class Pila implements Serializable {
    private Nodo ultimoValorIngresado;
    int tamanio = 0; // tamaño de la pila

    public Pila(){
        ultimoValorIngresado = null; // El apuntador del final debe contener null
        this.tamanio = 0;
    }

    public boolean pilaIsEmpty(){ // Método para saber si la pila está vacia
        return  ultimoValorIngresado == null;
    }

    /*Un nodo tiene dos campos uno con información y el otro el apuntador que nos indica el siguiente nodo*/
    //Introducimos elementos
    public void apilar(Object nodo){
        Nodo nuevoNodo = new Nodo (nodo); // se crea el nuevo nodo, este contiene el objeto nuevo
        nuevoNodo.siguiente = ultimoValorIngresado; // el nuevo nodo pasa a ser el siguiente
        ultimoValorIngresado = nuevoNodo; // el nuevo nodo pasa a ser el ultimo valor ingresado
        tamanio++;
    }

    // Eliminar un nodo
    public Object borrarElemento(){
        Object aux = ultimoValorIngresado.valor; // guardamos el nodo a eliminar(último al ser una pila)
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        /* avanzamos en la pila para que el ultimo nodo sea el siguiente y se pueda eliminar */
        tamanio--;
        return aux;
    }

    public Object extraerElemento(){
        return ultimoValorIngresado.toString();
    }

    public int getTamanio (){
        return tamanio;
    }

    public void vaciarPila(){ // vaciamos la Pila
        while(!pilaIsEmpty()){
            borrarElemento();
        }
    }

    public void mostrarPila(){
        Nodo recorrido = ultimoValorIngresado;
        while (recorrido != null) {
            System.out.println(recorrido.valor.toString());
            recorrido = recorrido.siguiente;
        }
    }

    public Pila invertirPila(){
        Pila pilaInvertida = new Pila();
        Nodo recorrido = ultimoValorIngresado;
        Object[] objetos = null;
        int pos = 0;
        if(objetos !=null){
        while(recorrido!=null){
            objetos[pos] = recorrido.valor;
            recorrido = recorrido.siguiente;
        }

            for(int i = objetos.length-1; i > objetos.length-1; i--){
                pilaInvertida.apilar(objetos[i]);
            }
        }
        /*for(int i = 0; i < objetos.length/2; i++){
            Object temp = objetos[i];
            objetos[i] = objetos[objetos.length-1-i];
            objetos[objetos.length-1-i] = temp;
        }*/
        return pilaInvertida;
    }
}
