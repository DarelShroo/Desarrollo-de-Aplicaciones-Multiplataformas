package Serializacion;

import java.io.Serializable;

public class Mascota implements Serializable {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private static final long serialVersionUID = 1L;
    private  String nombre;
    private  int edad;
    private  double peso;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, double peso, String garras) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + ", edad: " + this.edad;
    }
}

class Gato extends Mascota {

    public Gato(String nombre, int edad, double peso, String garras) {
        super(nombre, edad, peso, garras);
    }
}