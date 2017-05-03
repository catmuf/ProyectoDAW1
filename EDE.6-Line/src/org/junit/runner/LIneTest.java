package org.junit.runner;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Line;

import anzixuzhou.Libro;

public class LineTest {
	Line TestLine;
	
	@Before
	public void setUp()
	{
		TestLine = new Line();
	}

	@Test
	public double slopeTest()
	{
		LineTest.getSlope(3.3);
		assertEquals(3.3, LineTest.getSlope(), 0.0000001);
	}

	@Test
	public double TestgetDistance() {
		
	}
	@Test
	public double parallelTo() {
		
	}
			
}
