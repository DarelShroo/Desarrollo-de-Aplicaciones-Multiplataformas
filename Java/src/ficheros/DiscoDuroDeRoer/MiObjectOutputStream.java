package ficheros.DiscoDuroDeRoer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {
    protected void writeStreamHeader() throws IOException {
        //No hacer nada
    }

    //Constructores
    public MiObjectOutputStream() throws IOException{
        super();
    }

    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
}
