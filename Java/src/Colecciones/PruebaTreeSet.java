package Colecciones;

import java.util.*;

public class PruebaTreeSet {
    public static void main(String[] args) {
        /*TreeSet<String> ordenaPersonas = new TreeSet<String>();

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");

        for(String persona: ordenaPersonas){
            System.out.println(persona);
        }*/

        Articulo primero = new Articulo(1, "Primer articulo");
        Articulo segundo = new Articulo(200, "Segundo Articulo");
        Articulo tercer = new Articulo(3, "Este es el tercer artículo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        ordenaArticulos.add(tercer);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);

        for (Articulo articulo:
             ordenaArticulos) {
            System.out.println(articulo.getDescripcion());
        }
        /*Articulo comparadorArticulos= new Articulo();

        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);
        // el orden de ordenamiento en función del método comparadorArticulos
        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercer);

        System.out.println();

        for (Articulo articulo:
             ordenaArticulos2) {
            System.out.println(articulo.getDescripcion());
        }*/

        //ComparadorArticulos comparaArticulo = new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>(){
            @Override
            public int compare(Articulo o1, Articulo o2) {
                String desc1= o1.getDescripcion();
                String desc2 = o2.getDescripcion();

                return desc1.compareTo(desc2);
            }
        });
        System.out.println();

        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercer);

        for (Articulo articulo:
                ordenaArticulos2) {
            System.out.println(articulo.getDescripcion());
        }
        //String i = (3==3) ? "verdadero": "falso";
        //System.out.println(i);
    }
}

class Articulo implements Comparable<Articulo>{

    private int numeroArticulo;
    private String descripcion;

    public Articulo(int num, String desc){
        numeroArticulo=num;
        descripcion= desc;
    }

    @Override
    public int compareTo(Articulo o) {
        return numeroArticulo-o.numeroArticulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

   /* @Override
    public int compare(Articulo arg0, Articulo arg1) {
       String descripcionA = arg0.getDescripcion();
       String descripcionB = arg1.getDescripcion();

       return descripcionA.compareTo(descripcionB);
    }*/
}

/*class ComparadorArticulos implements  Comparator<Articulo>{

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String desc1= o1.getDescripcion();
        String desc2 = o2.getDescripcion();

        return desc1.compareTo(desc2);
    }
}*/