package Colecciones;

public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Java", "Darel", 20);
        Libro libro2 = new Libro("Java", "Darel", 15);

        //libro1=libro2;

        if(libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }else{
            System.out.println("No es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
}
