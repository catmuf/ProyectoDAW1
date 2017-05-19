import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class FechaTest extends TestCase {
	
	/* Escribe las pruebas para comprobar:
	* - Para una fecha correcta
	* - Pon dos meses que est�n mal
	* - Pon dos d�as que est�n mal
	* - Que el m�s de noviembre tiene d�a 31
	* - Que el m�s de diciembre tiene d�a 31
	* - Que el mes de febrero tiene d�a 30
	* - Que el 29 de febrero existe para 2008 (que es bisiesto)
	* - Que el 29 de febrero no existe para un a�o que no sea
	bisiesto
	* - Comprobar que el a�o 1900 es bisiesto
	*/
	
	private Fecha fechaCorrecta = new Fecha(17,5,2017);
	private Fecha mesIncorrecto = new Fecha(17,50,2017);
	private Fecha mesCorrecto = new Fecha(17,4,2017);
	private Fecha cambiarDiaNoviembre= new Fecha(31, 11, 2017);
	private Fecha cambiarDiaDiciembre= new Fecha(31, 12, 2017);
	private Fecha febreroDia = new Fecha(30, 02, 2017);
	private Fecha ComprobarFecha= new Fecha(29, 02, 2008);
	private Fecha ComprobarFechaNoExiste= new Fecha(29, 02, 2008);
	private Fecha ComprobarA�o= new Fecha(01, 01, 1900);
	
	@Test
	public void testValida() {
		assertTrue(fechaCorrecta.valida());
	
		assertFalse(mesIncorrecto.valida());

		assertTrue(mesCorrecto.valida());

		assertFalse(cambiarDiaNoviembre.valida());

		assertTrue(cambiarDiaDiciembre.valida());

		assertFalse(febreroDia.valida());

		assertTrue(ComprobarFecha.valida());

		assertTrue(ComprobarFechaNoExiste.valida());

		assertTrue(ComprobarA�o.valida());
	}
	//prueba
	/*
	@Test
	public void testIncorrecto() {
		assertFalse(mesIncorrecto.valida());
	}
	
	@Test
	public void testMesCorrecto() {
		assertTrue(mesCorrecto.valida());
	}
	
	@Test
	public void testDiaNoviembre() {
		assertFalse(cambiarDiaNoviembre.valida());
	}
	
	@Test
	public void testDiaDiciembre() {
		assertTrue(cambiarDiaDiciembre.valida());
	}
	
	@Test
	public void testDiaFebrero() {
		assertFalse(febreroDia.valida());
	}
	
	@Test
	public void testFechaExiste() {
		assertTrue(ComprobarFecha.valida());
	}
	@Test
	public void testFechaNoExiste() {
		assertTrue(ComprobarFechaNoExiste.valida());
	}
	@Test
	public void testAnyo() {
		assertTrue(ComprobarA�o.valida());
	}*/
	
}
