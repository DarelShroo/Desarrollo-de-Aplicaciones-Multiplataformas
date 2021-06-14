package Serializacion.Clase;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DeserializarObjetoBinarioDesdeFicheroDeTexto {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        LinkedList<Botella> l = new LinkedList<Botella>();

        byte[] datos;
        int pos = 0;
        String hexa;

        Scanner tokenizer;
        tokenizer= new Scanner(new File("./Java/src/Serializacion/Clase/objeto.dat"));
        //tokenizer= new Scanner("AC ED 00 05 73 72 00 18 66 69 63 68 65 72 6F 73 2E 6F 62 6A 65 74 6F 73 2E 42 6F 74 65 6C 6C 61 00 00 00 00 00 00 00 0C 02 00 02 5A 00 07 63 65 72 72 61 64 61 46 00 09 63 6F 6E 74 65 6E 69 64 6F 78 70 00 00 00 00 00 73 71 00 7E 00 00 01 3F 80 00 00 73 71 00 7E 00 00 01 3E 4C CC CD 73 71 00 7E 00 00 00 3F 33 33 33 ");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte b;

        while(tokenizer.hasNext()) {
            System.out.println(tokenizer);
            b=(byte)Integer.parseInt(tokenizer.next(), 16);
            baos.write(b);
        }
        baos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        int numBotellas=ois.readInt();
        for (int i = 0; i < numBotellas; i++) {
            System.out.println(ois.readObject());
        }

        ois.close();
        bais.close();
    }
}