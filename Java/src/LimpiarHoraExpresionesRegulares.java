import javax.swing.*;

public class LimpiarHoraExpresionesRegulares {
    public static void main(String[] argv) {

        String inputTimeString = String.valueOf(JOptionPane.showInputDialog("Escriba una hora en formato 10h 20m 55s"));
        String outputTimeString = inputTimeString.replaceAll("([6-9]|[0-5]\\d)\\d+", "$1");
        System.out.println(outputTimeString);

    }
}
