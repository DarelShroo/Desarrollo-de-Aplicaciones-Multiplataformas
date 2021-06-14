package ficheros.DiscoDuroDeRoer;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DataOutputInputStream {
    public static void main(String[] args) {


        try(DataInputStream dis = new DataInputStream(new FileInputStream("C:\\ficheros\\candidatos.txt"));){
            System.out.println("DNI\t\tNombre\t\tEdad\\Expectativa");
            String DNI, nombre;
            int edad;
            double exp_sal;

            while (true){
                DNI = dis.readUTF();
                nombre = dis.readUTF();
                edad = dis.readInt();
                exp_sal = dis.readDouble();

                System.out.println(DNI+"\t\t");
                System.out.println(nombre+"\t\t");
                System.out.println(edad+"\t\t");
                System.out.println(exp_sal+"\t\t");

            }
        }catch (EOFException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("");
        System.out.println("");


    }
    public static void dataInput(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);
        boolean salir = false;
        do {


            System.out.println("DNI");
            String DNI = sc.next();

            System.out.println("Escribe un nombre");
            String nombre = sc.next();

            System.out.println("Edad");
            int edad = sc.nextInt();

            System.out.println("Escribe un valor de la expectativa salarial");
            Double expectativa_salarial = sc.nextDouble();



            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\ficheros\\candidatos.txt", true))) {
                dos.writeUTF(DNI);
                dos.writeUTF(nombre);
                dos.writeInt(edad);
                dos.writeDouble(expectativa_salarial);

                System.out.println("Candidato añadido");
                System.out.println("¿Quieres añadir más?");
                char respuesta = sc.next().toUpperCase(Locale.ROOT).charAt(0);

                if(respuesta=='N'){
                    salir=true;
                }
            } catch (InputMismatchException | IOException e) {
                e.printStackTrace();
            }
        }while (!salir);
    }
}
