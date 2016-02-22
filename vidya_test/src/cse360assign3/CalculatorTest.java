package cse360assign3;
// CalculatorGitHob/vidya_test/src/cse360assign3/CalculatorTest.java 

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	//checks that the constructor doesn't return null
	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		org.junit.Assert.assertNotNull(cal);
	}

	//tests if the total method returns the correct total
	@Test
	public void testGetTotal() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		org.junit.Assert.assertEquals(0, cal.getTotal());
		//tests for correct updation
		cal.add(5);
		org.junit.Assert.assertEquals(5, cal.getTotal());
	}

	//tests for Add function
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.add(10);
		org.junit.Assert.assertEquals(10, cal.getTotal());
		cal.add(5);
		org.junit.Assert.assertEquals(15, cal.getTotal());
	}

	//tests for subtract function
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.subtract(1);
		org.junit.Assert.assertEquals(-1, cal.getTotal());
		//simultaneous operations
		cal.add(3);
		cal.subtract(1);
		org.junit.Assert.assertEquals(1, cal.getTotal());	
	}

	//tests for multiplication
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		//0*5 = 0
		cal.multiply(5);
		org.junit.Assert.assertEquals(0, cal.getTotal());
		cal.add(1);
		cal.multiply(5);
		//1*5 = 5
		org.junit.Assert.assertEquals(5, cal.getTotal());	
	}

	//tests for division
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		//tests division by 0 - if parameter is 0, should return 0
		cal.divide(0);
		org.junit.Assert.assertEquals(0, cal.getTotal());
		cal.add(6);
		cal.divide(2);
		org.junit.Assert.assertEquals(3, cal.getTotal());	
	}

	//tests for gethistory
	@Test
	public void testGetHistory() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		cal.add(2);
		cal.subtract(3);
		cal.multiply(5);
		cal.add(6);
		cal.divide(1);
		cal.add(5);
		cal.add(5);
		cal.add(8);
		cal.multiply(19);
		cal.divide(5);
		org.junit.Assert.assertEquals("0 + 2 - 3 * 5 + 6 / 1 + 5 + 5 + 8 * 19 / 5", cal.getHistory());
		
	}

}
