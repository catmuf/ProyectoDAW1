package org.junit.runner;
 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Line;

public class LineTest {
	Line TestLine;
	double delta= 0.001;
	double x0=1, y0=2, x1=3, y1=4;
	
	@Before
	public void Iniciar()
	{
		TestLine= new Line(1, 2, 3, 4);
	}

	@Test
	public void slopeTest()
	{
		double valorreal= TestLine.getSlope();
		double valoresperado= (4 - 2) / (3 - 1);
		assertEquals(valoresperado, valorreal, delta);
	}

	@Test
	public void TestgetDistance() {
		double valorreal= TestLine.getDistance();
		double valoresperado= Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
		assertEquals(valoresperado, valorreal, delta);
	}
	
	@Test
	public void parallelTo() {
		Line l = new Line(5, 2, 3, 4);
		boolean valorreal= TestLine.parallelTo(l);
		//double valoresperado = (Math.abs(TestLine.getSlope()- l.getSlope());
		assertTrue(!valorreal);
		assertFalse(valorreal);
	}
			
}
