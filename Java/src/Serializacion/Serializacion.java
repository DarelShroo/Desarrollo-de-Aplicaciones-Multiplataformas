package Serializacion;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Serializacion implements Serializable{
    public static void main(String[] args) {
        Gato gato = new Gato("Misu", 8, 20,10, "Mini garras");
        Gato gato2 = new Gato("Tales", 1,5, 15.2, "Super garras");

        //LinkedList<Gato> gatos = new LinkedList<Gato>();
        //gatos.add(gato);
        //gatos.add(gato2);
        //LinkedList<Gato> gatos = new LinkedList<Gato>();

        try(ObjectInputStream ObjetoFichero = new ObjectInputStream(new FileInputStream("./Java/src/Serializacion/objeto.dat"))){
            LinkedList<Gato> gatosRecuperados = (LinkedList<Gato>) ObjetoFichero.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

class Mascota {
    String nombre;
    int edad;
    double peso;
    double tamaño;
    public Mascota(String nombre, int edad, double peso, double tamaño, String garras){

        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = tamaño;
    }
}

class Gato extends Mascota implements Serializable {
    public Gato(String nombre, int edad, double peso, double tamaño, String garras) {
        super(nombre, edad, peso, tamaño, garras);
    }
}
