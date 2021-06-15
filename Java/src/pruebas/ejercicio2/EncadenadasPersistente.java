package pruebas.ejercicio2;

import pruebas.examen.iPersistente;

import java.io.*;

public class EncadenadasPersistente extends PalabrasEncadenadas implements iPersistente {
    @Override
    public boolean guardar(File f) {
        boolean correcto = true;
        try(ObjectOutputStream escribir_fichero =  new ObjectOutputStream(new FileOutputStream(f))){
            escribir_fichero.writeObject(f);
        } catch (FileNotFoundException e) {
            correcto = false;
        } catch (IOException e) {
            correcto = false;
        }
        return correcto;
    }

    @Override
    public boolean cargar(File f) {
        FileInputStream fis;
        ObjectInputStream ois;
        boolean correcto = true;
        try{
           fis = new FileInputStream(f);
           ois = new ObjectInputStream(fis);
           ois.readObject();
        } catch (FileNotFoundException e) {
            correcto = false;
        } catch (IOException e) {
            correcto = false;
        } catch (ClassNotFoundException e) {
            correcto = false;
        }
        return correcto;
    }
}
