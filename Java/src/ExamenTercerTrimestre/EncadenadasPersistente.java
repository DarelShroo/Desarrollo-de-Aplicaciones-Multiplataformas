package ExamenTercerTrimestre;

import java.io.*;
import java.util.LinkedList;

public class EncadenadasPersistente extends PalabrasEncadenadas implements ExamenTercerTrimestre.examen.iPersistente{
    public EncadenadasPersistente(LinkedList<String> tabla) throws Exception {
        super(tabla);
    }

    public EncadenadasPersistente() {
    }

    @Override
    public boolean guardar(File f) {
        for (String palabra: tabla) {
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\ficheros\\fichero00.txt", true))){
                dos.writeUTF(palabra);
            } catch (FileNotFoundException fileNotFoundException) {
                return false;
            } catch (IOException exception) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean cargar(File f) {

        try{
            tabla = null;
            FileReader fr = new FileReader(f);
            String datos = "";
            while(datos!=null){
                BufferedReader buffer = new BufferedReader(fr);
                String palabra = buffer.readLine();
                tabla.add(palabra);
            }
            fr.read();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return false;
    }
}
