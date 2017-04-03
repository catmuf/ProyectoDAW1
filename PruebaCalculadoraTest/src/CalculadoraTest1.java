import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest1 {
//Hacer pruebas para que los resultados salgan lo esperado
	Calculadora calc;
	
	@Before
	public void antesDelTest(){
		calc = new Calculadora();
		System.out.println("Reniciando calculadora...");
		
	}
	@Test
	public void sumarTest() {
		float resultado = calc.sumar(2,4);
		System.out.println("2+4= " +resultado);
		assertEquals("Metodo sumarTest", 6.0, resultado, 0);
	}
	@Test
	public void restarTest(){
		float resultado = calc.restar(4,1);
		System.out.println("4-1= " +resultado);
		assertEquals("Metodo sumarTest", 3.0, resultado, 0);
	}
	
	@Test
	public void DividirTest(){
		float resultado = calc.dividir(6,3);
		System.out.println("4-1= " +resultado);
		assertEquals("Metodo sumarTest", 2.0, resultado, 0);
	}
	
	@Test
	public void MultiplicarTest(){
		float resultado = calc.multiplicar(2,4);
		System.out.println("4-1= " +resultado);
		assertEquals("Metodo sumarTest", 8.0, resultado, 0);
	}

}
