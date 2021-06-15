package ficheros.DiscoDuroDeRoer;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SerializacionClientes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        boolean salir =  false;
        int opcion;
        File fichero = new File("C:\\ficheros\\clientes.dat");
        Cliente c;

        while(!salir){
            System.out.println("1. Crear Fichero");
            System.out.println("2. añadir cliente");
            System.out.println("3. Listar clientes");
            System.out.println("4. Borrar fichero");
            System.out.println("5. Salir de la aplicacion");
            String DNI, nombre, telefono;

            try{
                System.out.println("Escribe una opcion");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        if(fichero.exists()){
                            System.out.println("El fichero ya está cread");
                        }else {
                            if(fichero.createNewFile()){
                                System.out.println("Se ha creado el fichero el fichero");
                            }else{
                                System.out.println("Ha habido un error al crear el fichero");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Introduce el DNI");
                        DNI = sc.next();

                        System.out.println("nombre");
                        nombre = sc.next();

                        System.out.println("telefono");
                        telefono = sc.next();

                        c = new Cliente(DNI, nombre, telefono);
                        ObjectOutputStream oos;
                        if(fichero.length()==0){
                            oos = new ObjectOutputStream(new FileOutputStream(fichero));
                        }else{
                            oos = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                        }
                        oos.writeObject(c);
                        oos.close();
                        break;
                    case 3:
                        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));){
                                while (true) {
                                    c = (Cliente) ois.readObject();

                                    System.out.println(c.toString());
                                }
                            } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    case 4:
                        if(fichero.exists()){
                            fichero.delete();
                            System.out.println("El fichero se ha borrado");
                        }else {
                            System.out.println("No se puede borrar ya que no existe el fichero");
                        }
                        break;
                    case 5:
                        salir = true;
                }
            } catch (IOException | ClassNotFoundException | InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

}
class Cliente implements Serializable {
    private static final long serialVersionUID = -1;

    private String DNI;
    private String Nombre;
    private String telefono;

    public Cliente(String DNI, String nombre, String telefono) {
        this.DNI = DNI;
        Nombre = nombre;
        this.telefono = telefono;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
