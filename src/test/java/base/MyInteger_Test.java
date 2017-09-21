package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyInteger_Test {

	@Test
	public void testEven() {
		MyInteger myInt = new MyInteger(10);
		assertTrue(myInt.isEven());
		MyInteger myInt_2 = new MyInteger(7);
		assertFalse(myInt_2.isEven());
	
	}
	

	@Test
	public void testOdd() {
		MyInteger myInt = new MyInteger(9);
		assertTrue(myInt.isOdd());
		MyInteger myInt_2 = new MyInteger(10);
		assertFalse(myInt_2.isOdd());
		
	}

	@Test
	public void testPrime() {
		MyInteger myInt = new MyInteger(7);
		assertEquals(myInt.isPrime(), true);
		MyInteger myInt_2 = new MyInteger(8);
		assertEquals(myInt_2.isPrime(), false);
	}

	@Test
	public void testisEquals() {
		MyInteger myInt = new MyInteger(7);
		assertEquals(myInt.equals(myInt), true);
		MyInteger myInt_2 = new MyInteger(8);
		MyInteger myInt_3 = new MyInteger(7);
		assertEquals(myInt_3.equals(myInt_2), false);

	}

}
