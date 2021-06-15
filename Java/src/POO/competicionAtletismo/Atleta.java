package POO.competicionAtletismo;

public class Atleta {
    private int nAtleta;
    private String nombreAtleta;
    private float tiempoCarrera;
    
    public Atleta(int nAtleta, String nombreAtleta, float tiempoCarrera) {
        this.nAtleta = nAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float gettiempoCarrerat() {
        return tiempoCarrera;
    }

    public String mejorAtleta() {
        return "El mejor atleta es " + nombreAtleta + " con numero " + nAtleta + " y un tiempo de " + tiempoCarrera + "s";
    }
}
