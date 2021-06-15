package ficheros;

//importing the File class
import java.io.File;

class Prueba {
    public static void main(String[] args) {

        // create a file object for the current location
        File file = new File("./Java/src/Pruebas/archivo.txt");

        System.out.println(file.getAbsolutePath());

        System.out.println((file.exists()?"SI ":"NO ")+" existe el fichero");
        System.out.println((file.canRead()?"SI ":"NO ")+" puedo leer del fichero");
        System.out.println((file.canWrite()?"SI ":"NO ")+" puedo escribir en el fichero");
        System.out.println((file.canExecute()?"SI ":"NO ")+" puedo ejecutar el fichero");
        System.out.println((file.isDirectory()?"SI ":"NO ")+" es un directorio");


		/*
		try {
			// trying to create a file based on the object
			boolean value = file.createNewFile();
			if (value) {
				System.out.println("The new file is created.");
			} else {
				System.out.println("The file already exists.");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		*/
    }
}