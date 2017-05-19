import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class FechaTest extends TestCase {
	
	/* Escribe las pruebas para comprobar:
	* - Para una fecha correcta
	* - Pon dos meses que estén mal
	* - Pon dos días que estén mal
	* - Que el més de noviembre tiene día 31
	* - Que el més de diciembre tiene día 31
	* - Que el mes de febrero tiene día 30
	* - Que el 29 de febrero existe para 2008 (que es bisiesto)
	* - Que el 29 de febrero no existe para un año que no sea
	bisiesto
	* - Comprobar que el año 1900 es bisiesto
	*/
	
	private Fecha fechaCorrecta = new Fecha(17,5,2017);
	private Fecha mesIncorrecto = new Fecha(17,50,2017);
	private Fecha mesCorrecto = new Fecha(17,4,2017);
	private Fecha cambiarDiaNoviembre= new Fecha(31, 11, 2017);
	private Fecha cambiarDiaDiciembre= new Fecha(31, 12, 2017);
	private Fecha febreroDia = new Fecha(30, 02, 2017);
	private Fecha ComprobarFecha= new Fecha(29, 02, 2008);
	private Fecha ComprobarFechaNoExiste= new Fecha(29, 02, 2008);
	private Fecha ComprobarAño= new Fecha(01, 01, 1900);
	
	@Test
	public void testValida() {
		assertTrue(fechaCorrecta.valida());
	}
	
}
