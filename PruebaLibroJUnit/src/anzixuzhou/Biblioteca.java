package anzixuzhou;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
 //Tendra en cuenta los numeros leidos y libros en posesion
	
	public static int numLibrosLeidos;
	
	public static int numLibros;
	
	static ArrayList <Publicacion> ListaPublicaciones= new ArrayList <>();
	
	public static void main(String[] args) {
		AsignaPublicaciones();
		InfoComics();
		InfoLibros();
		//Imprime el formulario
	}
	public static void AsignaPublicaciones()
	{
		//Creacion de objetos de Comic y Libros
		/*Publicacion lib = new Libro();
		Publicacion com = new Comic();*/
		
		int libros;
		String titulo, tematica, pregunta; //Variable vacio o nulo
		int numPaginas, ilustrator;
		long isbn;
		Publicacion_Tipo pub=null;
		
		Scanner input = new Scanner(System.in);
		
		
		//Un bucle donde pregunta las opciones
		do{	
			System.out.println("Quiere (1)libro o (2)comic?: " +"\nPara (3)salir: " );
			libros=input.nextInt();
			pub=Publicacion_Tipo.values()[libros]; //En la numeracion se introduce el numero que desea añadir y tiene la oopcion de salir
			if(pub.equals(Publicacion_Tipo.LIBRO))
			{
				System.out.println("Titulo:");
				titulo=input.next();
				System.out.println("ISBN: ");
				isbn=input.nextLong();
				System.out.println("Tematica: ");
				tematica=input.next();
				System.out.println("Nº de paginas:");
				numPaginas=input.nextInt();
				/*Biblioteca.ListaPublicaciones.add(lib);*/
				ListaPublicaciones.add(new Libro(titulo, isbn, tematica, numPaginas));
				
			}
			
			if(pub.equals(Publicacion_Tipo.COMIC))
				{
				System.out.println("Titulo: ");
				titulo=input.next();
				System.out.println("ISBN: ");
				isbn=input.nextInt();
				System.out.println("Ilustrador: ");
				ilustrator=input.nextInt();
				System.out.println("Nº de paginas:");
				numPaginas=input.nextInt();
				ListaPublicaciones.add(new Comic(titulo, isbn, ilustrator, numPaginas));
				//añade dentro de la clase comic y libro
			}
		
		}while(pub.equals(Publicacion_Tipo.NADA));
		
		System.out.println("\nOperacion finalizada");
		
	}
	//Imprime la inforacion introducido desde el formulario del arraylist, no devuelve nada.
	public static void InfoComics(){
		for(int i=0; i<Biblioteca.ListaPublicaciones.size();i++){
			if(Biblioteca.ListaPublicaciones.get(i) instanceof Comic){
				System.out.println(Biblioteca.ListaPublicaciones.get(i).toString());
			}
		}
	}
	public static void InfoLibros(){
		for(int i=0; i<Biblioteca.ListaPublicaciones.size();i++){
			if(Biblioteca.ListaPublicaciones.get(i) instanceof Libro){
				System.out.println(Biblioteca.ListaPublicaciones.get(i).toString());
				}
		}
	}	//Clase.nombreDelArrayList.metodo(indice) instanceof Clase.
		
}