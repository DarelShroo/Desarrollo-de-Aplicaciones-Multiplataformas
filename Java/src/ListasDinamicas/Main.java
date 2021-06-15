package ListasDinamicas;

public class Main {
    public static void main(String[] args) {
        ListaDinamica <Integer> lista = new ListaDinamica<>();

        lista.add(1, 0);
        lista.add(2, 1);
        lista.addLast(3);
        lista.addFirst(4);
        lista.addFirst(5);

        System.out.println(lista.toString());

        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.get(10));
        System.out.println(lista.get(5));
        System.out.println(lista.size());
    }
}
