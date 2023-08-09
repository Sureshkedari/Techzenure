package com.techzenure.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int x = 10;
		int y = 20;
		int expected = 30;
		int actual = calc.add(x, y);
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd1() {
		Calculator calc = new Calculator();
		int x = -10;
		int y = 20;
		int expected = 10;
		int actual = calc.add(x, y);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAdd2() {
		Calculator calc = new Calculator();
		int x = -10;
		int y = -20;
		int expected = -30;
		int actual = calc.add(x, y);
		assertEquals(expected, actual);
	}	
}
