package Colecciones;

import javax.sound.midi.Soundbank;
import java.util.*;

public class PruebaMapas {
    public static void main(String[] args) {
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        personal.put("101",new Empleado("Javier"));
        personal.put("102",new Empleado("Laura"));
        personal.put("103",new Empleado("Gonzalo"));
        personal.put("104",new Empleado("Cristina"));

        System.out.println(personal);

        personal.remove("101");

        System.out.println(personal);

        personal.put("102", new Empleado("Alejandra"));

        System.out.println(personal);
        System.out.println(personal.entrySet());

        for (Map.Entry<String, Empleado> entrada:
                personal.entrySet()) {
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();

            System.out.println("Clave="+clave+", Valor="+valor);
        }
    }
}

class Empleado {
    public Empleado(String nombre){
        this.nombre = nombre;
        sueldo = 100;
    }

    public String toString(){
        return "[Nombre="+nombre+", sueldo="+sueldo+"]";
    }
    private String nombre;
    private double sueldo;
}
