package principal;
import java.util.Scanner;

import anzixuzhou.Biblioteca;
import anzixuzhou.Comic;
import anzixuzhou.Libro;
//importa las clases del campus.biblio (comic, libro y biblioteca)
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//Objeto de Libro
		Libro lL=new Libro();
		
		//Se dara un formulario que debe rellenar el cliente para especificar el libro que tiene
		System.out.println("ISBN: ");
		lL.setIsbn(input.nextLong());
		System.out.println("Título: ");
		lL.setTitulo(input.next());
		System.out.println("Temática: ");
		lL.setTematica(input.next());
		System.out.println("Paginas:");
		lL.setNumPaginas(input.nextInt());
		
		//Imprime el formulario
		System.out.println(lL);
		
		//Objeto de Comic
		Comic cC=new Comic();
		
		//Se daara un formulario que debe rellenar el cliente para especificar el comic que tiene
		System.out.println("ISBN: ");
		cC.setIsbn(input.nextLong());
		System.out.println("Título: ");
		cC.setTitulo(input.next());
		System.out.println("Ilustrador: ");
		cC.setIlustrator(input.nextInt());
		System.out.println("Paginas:");
		cC.setNumPaginas(input.nextInt());
		
		//Se pone un true en el setLeido del comic para representar que ha leido el comic y se sumara uno como leido, si no es así, false, se resta
		cC.setLeido(true);
		
		//Imprime el formulario
		System.out.println(cC);
		
		//Como resultado final, muestra dos system.out de numLibros (la cantidad) y numLibrosLeidos (la cantidad de libros leidos)
		System.out.println("Libros introducidos: " + Biblioteca.numLibros);
		System.out.println("Libros leídos: " + Biblioteca.numLibrosLeidos);
		
		input.close();
		//Termina el proceso (para)
	}

}
