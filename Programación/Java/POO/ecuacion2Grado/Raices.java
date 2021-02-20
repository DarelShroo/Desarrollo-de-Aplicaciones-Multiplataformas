package ecuacion2Grado;

public class Raices {
    
    private double a;
    private double b;
    private double c;
    
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void obtenerRaices() {
        double x1 =(-b+Math.sqrt(getDescriminante())) / (2*a);
        double x2 =(-b-Math.sqrt(getDescriminante())) / (2*a);
        System.out.println("Solucion X1");
        System.out.println(x1);
        System.out.println("Solucion X2");
        System.out.println(x2);
        
    }
    
    private void obtenerRaiz() {
        double x1 =(-b) / (2*a);
        System.out.println("Unica solucion");
        System.out.println(x1);
    }
    
    private double getDescriminante() {
        return Math.pow(b, 2)-(4*a*c); // pow b elevado a 2.
    }
    
    private boolean tieneRaices() {
        return getDescriminante()>0;
    }
    
    private boolean tieneRaiz() {
        return getDescriminante()==0;
    }
    
    public void calcular() {
        if(tieneRaices()) {
            obtenerRaices();
        }else if(tieneRaiz()) {
            this.obtenerRaiz();
        }else {
            System.out.println("No tiene solucion");
        }
    }
}
