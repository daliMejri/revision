package Fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class Testfibo {
	private Fibonacci fibonacci;

	@Before
	public void setUp() throws Exception {
		
		
		fibonacci = new Fibonacci();
	}

	@Test
	public void itShouldReturn1when2entred() {
		assertEquals(1, fibonacci.process(2));
	}
	
	
	@Test
	public void itShouldReturn2when3entred() {
		assertEquals(2, fibonacci.process(3));
	}

}
