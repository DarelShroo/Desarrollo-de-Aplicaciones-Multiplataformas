package Serializacion;

import Serializacion.Clase.Botella;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.Scanner;


public class Serializacion {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //LinkedList<Gato> gatos = new LinkedList<Gato>();


        deserializar();

    }
    private static void serializar() throws IOException {
        LinkedList<Gato> gatos = new LinkedList<Gato>();
        Gato gato = new Gato("Misu", 8, 20, "Mini garras");
        Gato gato2 = new Gato("Tales", 1,5, "Super garras");

        gatos.add(gato);
        gatos.add(gato2);
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        Iterator<Gato> i = gatos.iterator();
        Gato cat;

        byte[] datos;
        int pos = 0;
        String hexa;

        FileWriter fw;
        fw = new FileWriter("./Java/src/Serializacion/a.dat");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        salida = new ObjectOutputStream(baos);
        salida.writeInt(gatos.size());
        try {
            /**
             * EJEMPLO GUARDADO BINARIO
             */
            //fos = new FileOutputStream("saveBinary.dat");

            while (i.hasNext()) {
                cat = (Gato) i.next();
                //System.out.println(cat);
                salida.writeObject(cat);
            }
            salida.close();
            baos.close();

            datos = baos.toByteArray();
            for (pos = 0; pos < datos.length; pos++) {
                hexa = String.format("%H", (int) datos[pos] & 0xFF);
                if (hexa.length() == 1)
                    hexa = '0' + hexa;
                fw.write(hexa + ' ');
            }
            fw.close();

            /**
             * EJEMPLO GUARDADO TEXTO
             */
            //BufferedWriter bw = new BufferedWriter(new FileWriter("fichero1.txt"));
            //bw.write("Esto es una prueba usando Buffered");
            //bw.flush();

        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("3" + e.getMessage());
            }
        }
    }

    private static  void deserializar() throws ClassNotFoundException {
        /*
         * EJEMPLO LECTURA BINARIA
         */

        try {
            LinkedList<Gato> l = new LinkedList<Gato>();

            byte[] datos;
            int pos = 0;
            String hexa;

            Scanner tokenizer;
            tokenizer= new Scanner(new File("./Java/src/Serializacion/a.dat"));

            //System.out.println("Lectura binaria");
            //FileInputStream fis = null;
            //ObjectInputStream entrada = null;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte b;

            while(tokenizer.hasNext()) {
                //System.out.println(tokenizer);
                b=(byte)Integer.parseInt(tokenizer.next(), 16);
                baos.write(b);
            }
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            int numGatos=ois.readInt();
            for (int i = 0; i < numGatos; i++) {
                System.out.println(ois.readObject());
            }

            ois.close();
            bais.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }/* finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}

