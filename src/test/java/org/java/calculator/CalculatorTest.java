package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private static Calculator calc = null;
	
	@BeforeAll
	public static void setup() {
		
		calc = new Calculator();
	}
	
	@Test
	public void checkAdd() {
		float result = calc.add(4, 5);
		float expectedResult = 4 + 5;
		assertEquals(expectedResult, result, "I due numeri dell'addizione non sono uguali");
	}
	
	@Test
	public void checkSubstract() {
		float result = calc.substract(10, 5);
		float expectedResult = 10 - 5;
		assertEquals(expectedResult, result, "I due numeri della sottrazione non sono uguali");
	}
	
	@Test
	public void checkDivide() throws Exception {
		float result = calc.divide(5, 2);
		float expectedResult = 5.0f / 2;
		assertEquals(expectedResult, result, "I due numeri della divisione non sono uguali");
	}
	
	@Test
	public void checkMultiply() {
		float result = calc.multiply(3, 10);
		float expectedResult = 3 * 10;
		assertEquals(expectedResult, result, "I due numeri della divisione non sono uguali");
	}
	
	@Test
	public void checkDivideException() {
		assertThrows(Exception.class, () -> calc.divide(5, 0), "Eccezione attesa");	
	}
}
