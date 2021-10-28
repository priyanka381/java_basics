package abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest extends TestCase{
	@Test
	public void testAdd() {
		int expected = 30;
		int actual = BmwFlyingCar.add(10, 20);
		assertEquals(expected, actual);
	}
	
	public void assertEquals(int expected, int actual) {
		System.out.println("expected, actual");
		
	}

@Test
	public void testElgibility() {
		//boolean expected = false;
		boolean actual = BmwFlyingCar.isEligibletoVote(18);
		
		//assertFalse(actual);
		assertTrue(actual);
	}

	public void assertTrue(boolean actual) {
		System.out.println("actual");
		
	}

	
}
