package ListasEnlazadas.libros;

public class Main {
    public static void main(String[] args) {
        Libro libro0 = new Libro("Contra dragones", "Rubén", "485696874");
        Libro libro1 = new Libro("Malicia", "Juanita", "856749864");
        Libro libro2 = new Libro("Fluorescentes incandescentes", "Anthony", "5468746854");
        Libro libro3 = new Libro("Dragones", "Rubén", "7967985644");

        Lista lista = new Lista();

        lista.insertarPrincipio(libro0);
        lista.insertarFinal(libro1);
        lista.insertarPrincipio(libro2);

        System.out.println(lista.obtener(2).getAutor());
    }
}
