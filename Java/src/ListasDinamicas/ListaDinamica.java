package ListasDinamicas;

import Pilas.Nodo;

public class ListaDinamica <T>{
    //atributos
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;

    public ListaDinamica(){
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return tamanio==0;
    }

    public int size(){
        return tamanio;
    }

    private Nodo<T> getNode(int index){
        if(isEmpty() || (index < 0 || index >= size() )) {
            return null;
        }else if (index == 0) {
            return primero;
        }else if (index == size()-1) {
            return ultimo;
        }else {
            Nodo<T> buscado = primero;
            int contador = 0;
            while(contador < index){
                contador++;
                buscado = buscado.getSiguiente();
            }

            return buscado;
        }
    }
    public T get (int index){
        if(isEmpty() || (index < 0 || index >= size() )) {
            return null;

        }else if (index == 0) {
            return primero.getElemento();
        }else if (index == size()-1) {
            return getLast();
        }else {
            Nodo<T> buscado= getNode(index);
            return buscado.getElemento();
        }
    }
    public T getFirst() {
        if(isEmpty()){
            return null;
        }else {
            return primero.getElemento();
        }
    }

    public T getLast() {
        if(isEmpty()){
            return null;
        }else {
            return ultimo.getElemento();
        }
    }

    public T addFirst(T elemento) {
        Nodo<T> aux;
        if(isEmpty()){
            aux = new Nodo<>(elemento, null);
            primero = aux;
            ultimo = aux;
        }else {
            aux = new Nodo<>(elemento, primero);
            primero = aux;
        }
        tamanio++;
        return primero.getElemento();
    }

    public T addLast(T elemento) {
        Nodo<T> aux;
        if(isEmpty()){
            addFirst(elemento);
        }else {
            aux = new Nodo<>(elemento, null);
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
        tamanio++;
        return ultimo.getElemento();
    }

    public T add (T elemento, int index){
        if(index == 0){
            return addFirst(elemento);
        }else if(index == size()) {
            return addLast(elemento);
        }else if(index < 0 || index >= size()) {
            return null;
        }else {
            Nodo<T> anterior = getNode(index-1);
            Nodo<T> actual = getNode(index);
            Nodo<T> aux = new Nodo<>(elemento, actual);
            anterior.setSiguiente(aux);

            tamanio++;

            return getNode(index).getElemento();
        }
    }

    public String toString() {
        String cadena = "";
        if(isEmpty()){
            cadena = "Lista Vacia";
        }else{
            Nodo<T> aux = primero;
            while (aux!=null) {
                cadena += aux.toString();
                aux =aux.getSiguiente();

            }
        }
        return cadena;
    }
}
