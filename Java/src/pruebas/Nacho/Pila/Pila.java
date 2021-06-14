package pruebas.Nacho.Pila;

import Pilas.Nodo;

import java.io.Serializable;

public class Pila <T> implements Serializable {
    private Pilas.Nodo<T> top;
    private int tamanio;

    public Pila(){
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
            Pilas.Nodo<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tamanio--;
            return elemento;
        }
    }

    public void push(T elemento){
        Pilas.Nodo<T> aux = new Pilas.Nodo<T>(elemento, top);
        top = aux;
        this.tamanio++;
    }



    public String toString(){
        if(isEmpty()){
            System.out.println( "La pila está vacia");
        }else {
            Nodo<T> aux = top;
            while(aux!=null){
                System.out.println(aux.toString());
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
/*
    public Pila invertirPila(){
        Pila pilaInvertida = new Pila();
        Nodo recorrido = ultimoElementoIngresado;
        Object[] objetos = null;
        int pos = 0;
        if(getTamanio() ==0){
            System.out.println("Está vacia");

        }else {
            while(recorrido!=null){
                objetos[pos] = recorrido.getElemento();
                recorrido = recorrido.getSiguiente();
            }

            for(int i = objetos.length-1; i > objetos.length-1; i--){
                pilaInvertida.apilar(objetos[i]);
            }
        }
        /*for(int i = 0; i < objetos.length/2; i++){
            Object temp = objetos[i];
            objetos[i] = objetos[objetos.length-1-i];
            objetos[objetos.length-1-i] = temp;
        }
        return pilaInvertida;
    }*/
}
