import java.util.*;
import javax.swing.*;

public class CalcularAreas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción; \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");

        int figura = entrada.nextInt();
        entrada.close();

        switch (figura) {

            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); // método estático
                System.out.println("El Área del cuadrado es " + Math.pow(lado, 2));

                break;

            case 2:

                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El Área del rectÃ¡ngulo es " + base * altura);

                break;

            case 3:

                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El Área del triÃ¡ngulo es " + (base * altura) / 2);

                break;

            case 4:

                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El Área del Círculo es ");

                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

                break;

            default:
                System.out.println("La opción no es correcta");

        }

    }
}
