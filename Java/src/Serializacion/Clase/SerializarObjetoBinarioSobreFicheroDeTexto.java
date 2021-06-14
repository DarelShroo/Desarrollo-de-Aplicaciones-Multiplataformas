package Serializacion.Clase;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class SerializarObjetoBinarioSobreFicheroDeTexto {

    public static void main(String[] args) throws IOException {
        LinkedList<Botella> l = new LinkedList<Botella>();
        l.add(new Botella());
        l.add(new Botella(1));
        l.add(new Botella(.2f));
        l.add(new Botella(.7f));
        l.add(new Botella());

        l.get(l.size()-2).abrir();
        l.get(l.size()-1).meter(0.2f);


        byte[] datos;
        int pos = 0;
        String hexa;

        FileWriter fw;
        fw = new FileWriter("./Java/src/Serializacion/Clase/a.dat");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        Iterator<Botella> i = l.iterator();
        l.getFirst();

        Botella bot;
        oos.writeInt(l.size());
       while (i.hasNext()) {
            bot=(Botella)i.next();
            oos.writeObject(bot);
            //TODO solo para controlar lo generado. Eliminar al terminar
            System.err.println(bot);
        }
        oos.close();
        baos.close();

        datos = baos.toByteArray();

        for (pos = 0; pos < datos.length; pos++) {
            hexa=String.format("%H", (int)datos[pos] & 0xFF);
            if(hexa.length()==1)
                hexa='0'+hexa;
            fw.write(hexa+' ');
        }
        fw.close();

    }
}