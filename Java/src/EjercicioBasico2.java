import javax.swing.*;

public class EjercicioBasico2 {
    public static void main(String[] args) {
        int ExpenditureWater = Integer.parseInt(JOptionPane.showInputDialog("Escriba el gasto en litros de agua "));
            
            if (ExpenditureWater < 50){
                
                System.out.println("Te sale gratis!");
                
            }else if (ExpenditureWater <= 200) {

                ExpenditureWater = (int)(ExpenditureWater*0.1+6);
                
                System.out.println("El gasto de agua es de " + ExpenditureWater + "€");

            }else {

                ExpenditureWater = (int)(ExpenditureWater*0.3+6);
                
                System.out.println("El gasto de agua es de " + ExpenditureWater + "€");

            }
    }
}

