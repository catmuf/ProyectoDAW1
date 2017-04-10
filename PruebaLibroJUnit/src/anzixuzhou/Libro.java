package anzixuzhou;
//Llamamos a la clase Publicacion (herencia)
public class Libro extends Publicacion{	
		//Asginamos a Tematica como Private para pueda utilizar solo la clase Libro y los otras clase no
		private String tematica;
		
		public Libro(){
			//Constructor vacío
		}
		
		public Libro(String titulo, long isbn, String tematica, int numPaginas){
			
			super(titulo, isbn, numPaginas);
			this.tematica=tematica;
		}
		//Ponemos los getters para Temática (obtener el valor ya asignado del setter) y setters (asignar un valor)
		public void setTematica(String tematica)
		{
			this.tematica=tematica;		
		}
		
		public String getTematica()
		{
			return this.tematica;
		}
		@Override
		public String toString()
		{	//Muestra y devuelve la herencia de Publicacion y el atributo Temática 
			return super.toString() + "\nTematica: " + this.tematica;
		}
	
}
