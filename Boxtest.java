package com.foo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Boxtest {

	@Test
	public void testBox() {
		
		Box sample = new Box(10, 15);
		int actual = sample.getArea();
		int expected = (150);
		assertEquals(150, actual);
		
}

}
