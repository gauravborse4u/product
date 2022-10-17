package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCheckPrimes {

	@Test
	public void check() {
		CheckPrimes p1 = new CheckPrimes();

		assertEquals(true, p1.checkPrime(7));

		assertEquals(true, p1.checkPrime(2));

		assertEquals(false, p1.checkPrime(44));

		assertEquals(false, p1.checkPrime(77));

	}

}
