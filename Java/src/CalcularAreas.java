import java.util.*;
import javax.swing.*;

public class CalcularAreas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opci�n; \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo");

        int figura = entrada.nextInt();
        entrada.close();

        switch (figura) {

            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); // m�todo est�tico
                System.out.println("El �rea del cuadrado es " + Math.pow(lado, 2));

                break;

            case 2:

                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El �rea del rectángulo es " + base * altura);

                break;

            case 3:

                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El �rea del triángulo es " + (base * altura) / 2);

                break;

            case 4:

                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El �rea del C�rculo es ");

                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

                break;

            default:
                System.out.println("La opci�n no es correcta");

        }

    }
}
