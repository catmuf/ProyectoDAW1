package anzixuzhou;

public class Publicacion {
	//Asignamos los atributos introducidos como protected.
	protected long isbn;
	protected String titulo;
	protected int numPaginas;
	protected boolean leido= false;

	public Publicacion()
	{	//Ponemos los valores vacio y introducimos el contador de libros
		this.titulo= null;
		this.isbn= 0;
		this.numPaginas= 0;
		Biblioteca.numLibros++;
	}
	public Publicacion(String titulo, long isbn, int numPaginas)
	{
		this.titulo= titulo;
		this.isbn= isbn;
		this.numPaginas= numPaginas;
		Biblioteca.numLibros++;
	}
	//Ponemos los getters (obtener el valor ya asignado del setter) y setters (asignar un valor)
	public void setIsbn(long isbn)
	{
		this.isbn=isbn;		
	}
	
	public long getIsbn()
	{
		return this.isbn;
	}
	
	public void setTitulo(String titulo)
	{
		this.titulo=titulo;		
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	public void setNumPaginas(int numPaginas)
	{
		this.numPaginas=numPaginas;		
	}
	
	public int getNumPaginas()
	{
		return this.numPaginas;
	}
	///Un buble de boolean para sumar y restar los libros y leidos, pero por defecto se asigna como false
	public void setLeido(boolean leido)
	{
		if(leido==true && this.leido==false) 
			Biblioteca.numLibrosLeidos++;
		else if(leido==false && this.leido==true) 
			Biblioteca.numLibrosLeidos--;
			this.leido=leido;
	}
	
	public boolean getLeido(boolean leido)
	{
		return this.leido;
	}
	//Devuelve los valores introducidos
	public String toString()
	{
		return "Titulo: "+ this.titulo + "\nISBN: "+ this.isbn + "\nPaginas: "+ this.numPaginas;
	}
}
