import javax.swing.*;

public class Acceso_aplicacion {
    public static void main(String[] args) {

        String clave = "Darel";
        String pass = "";

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introduce la contraseÃ±a, por favor");

            if (clave.equals(pass) == false) {
                System.out.println("Contraseña incorrecta");
            }

        }

        System.out.println("Contraseña correcta. Acceso permitido");

    }

}
