package ficheros.DiscoDuroDeRoer;

import ficheros.Ficheros_01;

import java.io.*;
import java.util.*;

public class GestorFicherosSerializado<T> {
    private File fichero;
    private ArrayList<T> objetos;

    public GestorFicherosSerializado(String fichero){
        this.fichero = new File(fichero);
        this.objetos = new ArrayList();
        obtenerDatos();
    }

    public GestorFicherosSerializado(File fichero){
        this.fichero = fichero;
        this.objetos = new ArrayList<T>();
        obtenerDatos();
    }

    public void obtenerDatos(){
        if(fichero.exists()){
            T elemento;
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));

                while(true){
                    elemento = (T) ois.readObject();
                    objetos.add(elemento);
                }
            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardarDatos(T elemento){
        if(fichero.exists()){

            try( MiObjectOutputStream oos= new MiObjectOutputStream(new FileOutputStream(fichero, true))){
                oos.writeObject(elemento);
                objetos.add(elemento);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            try( ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(fichero, true))){
                oos.writeObject(elemento);
                objetos.add(elemento);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
