import javax.swing.*;

public class correo_ {
    public static void main(String[] args) {
        
        boolean arroba=false;
        String email= JOptionPane.showInputDialog("Introduce tu correo");
        
        for (int i=0; i<email.length();i++){

            if (email.charAt(i) == '@') {

                arroba = true;
                break;
            }
        }
        if (arroba){
        	
        	System.out.println("Es correcto");
        	
        }
        else {
        	System.out.println("No es correcto");
        }
    }
}

