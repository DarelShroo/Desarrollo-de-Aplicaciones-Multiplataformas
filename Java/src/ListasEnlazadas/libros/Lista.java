package ListasEnlazadas.libros;

public class Lista {

    private Nodo cabeza =null; //4º
    private int longitud = 0; //23º

    private class Nodo{
        public Libro libro;  //1º Referencia al libro
        public Nodo siguiente=null; // 2º Nodo siguiente.

        public Nodo(Libro libro){
            this.libro = libro; //3º
        }
    }

    public void insertarPrincipio(Libro libro){
        Nodo nodo = new Nodo(libro); //5º Se instancia el nodo
        nodo.siguiente=cabeza; //6º El nodo siguiente pasa a ser la cabeza (null)
        cabeza = nodo; //7º la cabeza ahora vale nodo (1º pos, null 2ºpos)
        longitud++; //22º
    }

    public void insertarFinal(Libro libro){ //Se inserta al final de la lista
        Nodo nodo = new Nodo(libro); //8º
        if (cabeza == null){
            cabeza = nodo;
        }else {
            Nodo puntero = cabeza; //9º puntero de la lista
            while(puntero.siguiente !=null){ //10º
                puntero = puntero.siguiente; // 11º
            }
            puntero.siguiente = nodo; //12ª
        }
        longitud++; //22º
    }

    public void insertarDespues(int n, Libro libro){ //Se inserta en una posición específica
        Nodo nodo = new Nodo(libro); //13º
        if (cabeza == null){ //14º Si se encuentra al final ya lo hemos encontrado.
            cabeza = nodo; //15º
        }else {//16º
            Nodo puntero = cabeza;
            int contador = 0; //17º el contador nos dice que numero de libro está en puntero
            while(contador < n && puntero.siguiente !=null){ //10º
                puntero = puntero.siguiente; // 11º
                contador++;//12º
            }
            nodo.siguiente =puntero.siguiente;//18º conectamos nodo recién creado con la lista por la derecha.
            puntero.siguiente = nodo; //19º Luego lo conectamos por la izquierda
        }
        longitud++; //22º
    }

    public Libro obtener(int n){ //Obtener información de la lista.
        if(cabeza == null){ //Comprobar si la lista está vacía.
            return null;  //20º
        }else {
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente !=null){
                puntero = puntero.siguiente; //21º Buscamos el libro
                contador++;
            }
            if(contador != n){ //22º
                return null; //Se termina el recorrido de forma prematura si se piede un libro en
                            // X posición y hay Y posiciones menos.
            }else {
                return puntero.libro;
            }
        }
    }
    public int contar() { //22º
        return longitud;
    }

    public  boolean estaVacio() { //24º
        return cabeza ==  null;
    }

    public void eliminarPrincipio(){ //23º
        if (cabeza != null){
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }
    }

    public void eliminarUltimo(){
        if(cabeza!=null){
            if(cabeza.siguiente == null){
                cabeza = null;
            }else {
                Nodo puntero = cabeza;
                while(puntero.siguiente.siguiente !=null){ //25º El siguiente del siguiente si vale nulo es el penultimo.
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }

        }
    }

    public void eliminarLibro(int n){ // 26º Eliminar un libro en una posición específica.
        if(cabeza != null){
            if (n == 0) {
                Nodo primero = cabeza;
                cabeza = cabeza.siguiente;
                primero.siguiente = null;
                longitud--;
            }else if(n<longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (n-1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }
        }
    }
}
