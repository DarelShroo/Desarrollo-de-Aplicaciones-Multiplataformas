import javax.swing.*;

public class Acceso_aplicacion {
    public static void main(String[] args) {

        String clave = "Darel";
        String pass = "";

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (clave.equals(pass) == false) {
                System.out.println("Contrase�a incorrecta");
            }

        }

        System.out.println("Contrase�a correcta. Acceso permitido");

    }

}
