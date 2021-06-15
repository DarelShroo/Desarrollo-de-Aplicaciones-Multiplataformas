package pruebas.Nacho.Pila;

public class Cola{
    private Nodo cabeza, ultimo;

    public void encolar(Clima c){
        Nodo  nuevoNodo = new Nodo(c);
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else {
            this.ultimo.siguiente = nuevoNodo;
        }
        ultimo = nuevoNodo;
    }

    public void eliminar(){
        if(cabeza == null){
            Nodo eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;
            if(cabeza == null){
                ultimo = null;
            }
        }
    }

    public Clima obtener(){
        if(cabeza == null){
            return null;
        }else {
            return cabeza.clima;
        }
    }
}
