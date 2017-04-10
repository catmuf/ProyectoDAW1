package anzixuzhou;
//Llamamos a la clase Publicacion (herencia)
public class Comic extends Publicacion{
	//Asginamos a Tematica como Private para pueda utilizar solo la clase Comic y los otras clase no
	private int ilustrator;
	
	public Comic(){			
		//Constructor vacío
	}
	
	public Comic(String titulo, long isbn, int ilustrator, int numPaginas){
		//Llama la clase Publicacion lo que hereda los datos
		super(titulo, isbn, numPaginas);
		this.ilustrator=ilustrator;
	}

	//Ponemos los getters poara Ilustrador (obtener el valor ya asignado del setter) y setters (asignar un valor)
	public void setIlustrator(int ilustrator)
	{
		this.ilustrator=ilustrator;		
	}
	
	public int getIlustrator()
	{
		return this.ilustrator;
	}
	@Override
	public String toString()
	{  //Muestra y devuelve la herencia de Publicacion y el atributo Ilustrador 
		return super.toString() + "\nIlustrador: " + this.ilustrator;
	}

}

