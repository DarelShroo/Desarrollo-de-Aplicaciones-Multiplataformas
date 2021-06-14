import java.util.Scanner;

public class Adivina_Numero {
    public static void main(String[] args) {
        int numero = 0;
        int aleatorio = (int) (Math.random() * 100);
        int intentos = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número, por favor");
        do {

            intentos++;
            numero = entrada.nextInt();

            if (aleatorio < numero) {
                System.out.println("Mas bajo");

            } else if (aleatorio > numero) {
                System.out.println("Más alto");
            }
        } while (numero != aleatorio);
        System.out.println("Correcto lo has conseguido en " + intentos + " intentos.");
    }
}
