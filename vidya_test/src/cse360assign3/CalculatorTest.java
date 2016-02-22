package cse360assign3;
// CalculatorGitHob/vidya_test/src/cse360assign3/CalculatorTest.java 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		org.junit.Assert.assertNotNull(cal);
	}

	@Test
	public void testGetTotal() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.add(5);
		org.junit.Assert.assertEquals(5, cal.getTotal());
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.add(10);
		org.junit.Assert.assertEquals(10, cal.getTotal());
		cal.add(5);
		org.junit.Assert.assertEquals(15, cal.getTotal());
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.subtract(1);
		org.junit.Assert.assertEquals(-1, cal.getTotal());
		cal.add(3);
		cal.subtract(1);
		org.junit.Assert.assertEquals(1, cal.getTotal());	
	}


	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.multiply(5);
		org.junit.Assert.assertEquals(0, cal.getTotal());
		cal.add(1);
		cal.multiply(5);
		org.junit.Assert.assertEquals(5, cal.getTotal());	
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.divide(0);
		org.junit.Assert.assertEquals(0, cal.getTotal());
		cal.add(6);
		cal.divide(2);
		org.junit.Assert.assertEquals(3, cal.getTotal());	
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
