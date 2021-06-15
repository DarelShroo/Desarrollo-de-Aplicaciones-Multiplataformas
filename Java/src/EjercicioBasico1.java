import javax.swing.*;

public class EjercicioBasico1 {
    public static void main(String[] args) {
        int PriceProd = Integer.parseInt(JOptionPane.showInputDialog("Precio del producto"));
        int PriceProdIncrement = (int) (PriceProd * 0.11 + PriceProd);

        if (PriceProdIncrement < 1000) {

            System.out.println("El precio del producto es " + PriceProdIncrement);

        } else {
            System.out.println('"' + "Cariiisimo..." + '"');
        }
    }
}