package com;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		Assert.assertEquals(5L, Calculator.add(2, 3));
		System.out.println("Tesst pass");
	}

	
}
