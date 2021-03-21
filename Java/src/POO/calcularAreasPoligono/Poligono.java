package POO.calcularAreasPoligono;

public abstract class Poligono {
    protected int numeroLados;
    
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;    
    }

    public int getNumeroLados() {
        return numeroLados;
    }
    
    @Override
    public String toString() {
        return "Numero Lados = " + numeroLados;
    }
    
    public abstract double area();
    
}
