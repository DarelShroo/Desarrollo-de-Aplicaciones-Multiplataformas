package Pilas;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mi pila de Dinamica");

        PilaDinamica<Integer> pilaNumeros = new PilaDinamica<>();
        System.out.println("La pila está vacía? (Inicio) " + pilaNumeros.isEmpty());

        pilaNumeros.push(5);
        pilaNumeros.push(10);
        pilaNumeros.push(15);
        pilaNumeros.push(20);

        System.out.println("La pila está vacía? (Agregados) " + pilaNumeros.isEmpty());

        System.out.println("El tamaño ahora es de "+pilaNumeros.size());
        System.out.println("El top es "+pilaNumeros.top());

        int elemento = pilaNumeros.pop();

        System.out.println("He sacado el numero "+ elemento);
        System.out.println("El tamaño de la pila ahora es de "+pilaNumeros.size());
        System.out.println("\n"+pilaNumeros);


        System.out.println("\n Stack de Java");
        Stack<Integer> pilaStack = new Stack<>();

        System.out.println("La pila está vacía? (Inicio)"+pilaStack.empty());

        pilaStack.push(5);
        pilaStack.push(10);
        pilaStack.push(15);
        pilaStack.push(20);

        System.out.println("La pila está vacía? (Agregados)"+pilaStack.empty());

        System.out.println("El top es "+pilaStack.peek());
        System.out.println("El tamaño de la pila ahora es de "+pilaStack.size());

        int elemento2 = pilaStack.pop();

        System.out.println("He sacado el numero "+ elemento2);
        System.out.println("El tamaño de la pila ahora es de "+pilaStack.size());
        System.out.println("El top es "+pilaStack.peek());

        System.out.println("\n"+pilaStack);
    }
}
