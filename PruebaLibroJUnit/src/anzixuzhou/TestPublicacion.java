package anzixuzhou;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.ArrayList.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPublicacion {

	ArrayList <Publicacion> ListaPublicaciones;
	
	@Before //Antes de hacer las pruebas, ejecuta cada tests de los metodos
	public void antesQue(){
		//crear objeto de arraylist
		ListaPublicaciones = new ArrayList <>();
	}
	
	@Test
	public void TestLongitud()
	{ 
		//Comprobar longitud del Arraylist
	    ListaPublicaciones.add(new Libro("libro 1", 1,"tematica 1", 55));
	    assertEquals(1, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Comic("comic 1", 2, 123, 99));
	    assertEquals(2, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Comic("comic 2", 3, 123, 88));
	    assertEquals(3, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Libro("libro 2", 4,"tematica 2", 66));
	    assertEquals(4, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Libro("libro 3", 5,"tematica 3", 77));
	    assertEquals(5, ListaPublicaciones.size());
	    
	    assertEquals("Total publicaciones", 5, ListaPublicaciones.size());
	}
	
	@Test
	public void TestPosicion(){
		//determina cada posicion de los arrayLists
		ListaPublicaciones.add(new Libro("libro 1", 1,"tematica 1", 55));
	    assertEquals(1, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Comic("comic 1", 2, 123, 99));
	    assertEquals(2, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Comic("comic 2", 3, 123, 88));
	    assertEquals(3, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Libro("libro 2", 4,"tematica 2", 66));
	    assertEquals(4, ListaPublicaciones.size());
	    ListaPublicaciones.add(new Libro("libro 3", 5,"tematica 3", 77));
	    assertEquals(5, ListaPublicaciones.size());
	    
	    //determinar la posicion de los arrayLists
	    Publicacion p = ListaPublicaciones.get(0);
	    
	}
	//Pruebas de JUnit (fracasos)
	/*{
			ArrayList <Publicacion> ListaPublicaciones= new ArrayList <>();
				ListaPublicaciones.add(new Libro("fgg", 123, "ww", 123));
				ListaPublicaciones.add(new Comic("test1", 3333, 755, 2345));
				ListaPublicaciones.add(new Libro("lofdhj", 456, "lsdf", 45));
		      assertEquals(ListaPublicaciones.size(),3);
		      assertEquals(ListaPublicaciones.get(0),"fgg");
		      assertEquals(ListaPublicaciones.get(1),"test1");
		      assertEquals(ListaPublicaciones.get(2),"lofdhj");
		   }*/
		 	/*Publicacion test = new Publicacion();
		 	ArrayList <Publicacion> ListaPublicaciones= new ArrayList <>();
		 	assertEquals("Longitud: ", 3, ListaPublicaciones.size());
		 	assertArrayEquals("asd","asd", ListaPublicaciones.get(0));*/
		
		/*ArrayList <Publicacion> ListaPublicaciones= new ArrayList <>("sdf","ase");
	    assertEquals("Total", 0, ListaPublicaciones.size());*/
		
		/*ArrayList <Publicacion> ListaPublicaciones= new ArrayList <>();	
		for (int i=0;i<ListaPublicaciones.size();i++)
			System.out.println("Elemento " + i + ": " + ListaPublicaciones.size());
		assertEquals("Total ", "Viaje", ListaPublicaciones.size(), 0);*/
	}
