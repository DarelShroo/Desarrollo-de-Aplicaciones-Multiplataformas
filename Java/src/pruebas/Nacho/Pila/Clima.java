package pruebas.Nacho.Pila;

import java.io.Serializable;

public class Clima implements Serializable {
    String lugar;
    int temperatura;
    int humedad;

    public Clima() {
    }

    public Clima(String lugar, int temperatura, int humedad){
        this.lugar = lugar;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    @Override
    public String toString() {
        return "Clima{" +
                "lugar= '" + lugar + '\'' +
                ", temperatura= " + temperatura + "º+"+"C"+
                ", humedad= " + humedad +"%" +
                '}';
    }
}
