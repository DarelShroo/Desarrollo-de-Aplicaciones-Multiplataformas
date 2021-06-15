package pruebas.examen;

import java.io.File;

public interface iPersistente {
    boolean guardar(File f);
    boolean cargar(File f);
}
