package Colecciones;

import java.util.*;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "00002", 25000);
        Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
        Cliente cl4 = new Cliente("Julio Iglesias", "00004", 500000);
        Cliente cl5 = new Cliente("Julio Iglesias", "00007", 500000);
        // ¿Se pueden repetir los datos?
        // ¿Agregar, borrar?
        //¿Solo lectura?

        Set<Cliente> clientesBanco=new HashSet<Cliente>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        //HashCode numero que referencia la localización del objeto almacenado en la memoria Heap

        /*for (Cliente cliente: clientesBanco) {
            /*System.out.println(cliente.getNombre() + " "+
                               cliente.getN_cuenta() +" "+
                               cliente.getSaldo());
            if(cliente.getNombre().equals("Julio Iglesias")){
                clientesBanco.remove(cliente);
            }
        }*/

        for (Cliente cliente: clientesBanco) {
            System.out.println(cliente.getNombre() + " "+
                               cliente.getN_cuenta() +" "+
                               cliente.getSaldo());

        }

        Iterator<Cliente> it = clientesBanco.iterator();

        while(it.hasNext()){
            String nombreCliente = it.next().getNombre();
            if(nombreCliente.equals("Julio Iglesias")){
                it.remove();
            }
        }

        /*Iterator<Cliente> it = clientesBanco.iterator();

        while(it.hasNext()){
            String nombreCliente = it.next().getNombre();
            System.out.println(nombreCliente);
        }*/
    }
}
