package week_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest_Week2 {

	@Test
	public void stackOfStrings() {
		StackOfStrings s = new StackOfStrings();
		s.push("1");
		s.push("2");
		assertEquals("2", s.pop());
		s.push("3");
		s.push("4");
		s.push("5");
		assertEquals("5", s.pop());
		s.push("6");
		assertEquals("6 4 3 1", s.toString());
		assertTrue(s.size() == 4);
	}

	@Test
	public void fixedCapacitStackOfStrings() {
		FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(10);
		s.push("1");
		s.push("2");		
		assertEquals("2", s.pop());
		s.push("3");
		s.push("4");
		s.push("5");
		assertEquals("5", s.pop());
		s.push("6");
		assertEquals("1346", s.toString());
		assertTrue(s.size() == 4);
	}
	
	
	
	
	
}
