package pruebas.Nacho.Pila;

//import Pilas.Nodo;

import java.io.Serializable;

public class Pila<T> implements Serializable {
    private Nodo<T> top;
    private int tamanio;

    public Pila() {
        top = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return this.tamanio;
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElemento();
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = aux;
            this.tamanio--;
            return elemento;
        }
    }

    public void push(T elemento) {
        Nodo<T> aux = new Nodo<T>(elemento, top);
        top = aux;
        this.tamanio++;
    }

    public  String toString() {
        if(isEmpty()){
            return "La pila está vacia";
        }else {
            String resultado="";
            Nodo<T> aux = top;
            while(aux!=null){
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }

    public Pila invertirPila() {
        Pila pilaInvertida = new Pila();
        Nodo recorrido = top;
        int pos = 0;
        while (recorrido != null) {
            pilaInvertida.push(recorrido.getElemento());
            recorrido = recorrido.getSiguiente();
            pos++;
        }
        /*for(int i = 0; i < objetos.length/2; i++){
            Object temp = objetos[i];
            objetos[i] = objetos[objetos.length-1-i];
            objetos[objetos.length-1-i] = temp;
        }*/
        return pilaInvertida;
    }
}
