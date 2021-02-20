package libros;

import java.util.Scanner;

public class Main {
	public static int libroConMasPagina(Libro libros[]) {
		int indice = 0;
		int nPaginas;
		
		nPaginas = libros[0].getnPaginas();
		for(int i = 0; i< libros.length;i++) {
			if (libros[i].getnPaginas()>nPaginas) {
				indice = i;
			}
		}
		
		return indice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isbn;
		String titulo;
		String autor;
		int nPaginas;
		int nLibros;
		int indiceMasPaginas;
		Scanner in = new Scanner(System.in);
		
		System.out.println("¿Cuantos libros va a ingresar?");
		nLibros = in.nextInt();

		Libro libros[] = new Libro[nLibros];
		
		for(int i=0;i<libros.length;i++) {
			in.nextLine();
			System.out.println();
			System.out.println("Introduce los datos del libro " + (i+1));
			System.out.print("ISBN: ");
			isbn = in.nextInt();
			in.nextLine();
			System.out.print("\nTitulo: ");
			titulo = in.nextLine();
			System.out.print("\nAutor: ");
			autor = in.nextLine();
			System.out.print("\nPaginas: ");
			nPaginas = in.nextInt();
			
			libros[i] = new Libro(isbn, titulo, autor, nPaginas);
		}
		
		indiceMasPaginas = libroConMasPagina(libros);
		
		System.out.println("El libro con mas paginas es: ");
		System.out.println(libros[indiceMasPaginas].toString());
	}

}
