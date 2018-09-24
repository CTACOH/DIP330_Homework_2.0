package imperative.test;

import imperative.logic.Super_Digit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Super_DigitTest {

	@Test
	public void test9875superDigit() {
		long n = 9875;
		assertEquals(2, Super_Digit.superDigit(n));
	}
	
	@Test
	public void test0superDigit() {
		long n = 0;
		assertEquals(0, Super_Digit.superDigit(n));
	}
	
	@Test
	public void test9superDigit() {
		long n = 9;
		assertEquals(9, Super_Digit.superDigit(n));
	}
	
	@Test
	public void test443superDigit() {
		long n = 443;
		assertEquals(2, Super_Digit.superDigit(n));
	}
	
	@Test
	public void test67543superDigit() {
		long n = 67543;
		assertEquals(7, Super_Digit.superDigit(n));
	}

}
