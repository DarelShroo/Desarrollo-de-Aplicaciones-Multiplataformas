package ListasEnlazadas;

public class ListaEnlazada {
    Nodo cabeza;
    int size;

    public ListaEnlazada(){
        cabeza = null;
        size = 0;
    }

    public Object obtener(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while(contador < index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public void addPrimero(Object obj){ // Se utiliza object que es el tipo de valor almacenado en Nodo.java
        if(cabeza == null){
            cabeza = new Nodo(obj);
        }else {
            Nodo temp = cabeza; //Si la cabeza no está a null, quiere decir que ya hay algo en esa posición.
            // Principio de reemplazo utilizando un nodo temporal.
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp); // Ahora la cabeza cambia de posición. Quedando esa posición el nuevo nodo
            cabeza = nuevo;
        }
        size++;
    }

    public void cortar(int index){
        //1 -> 2 -> 3 ....
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index-1) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(null);
        size = index;
    }

    public void eliminar(int index){
        //1 -> 2 -> 3 -> 4 -> 5 -> 6
        //1 -> 2 -> 4
        //1 -> 2 -> 4 -> 5 -> 6
        if(index == 0){
            cabeza = cabeza.obtenerSiguiente();
        }else {
            int contador = 0;
            Nodo temporal = cabeza;
            while (contador < index - 1) {
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(
                    temporal.obtenerSiguiente().obtenerSiguiente()
            );
        }
        size--;
    }

    public void eliminarPrimero(){
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }

    public int size() {
        return size; //Devuelve el tamaño de la lista
    }

    public boolean estaVacia(){
        return (cabeza == null)?true:false;
    }
}
