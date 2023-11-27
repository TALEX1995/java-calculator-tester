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
		
		assertEquals(9, result, "I due numeri dell'addizione non sono uguali");
	}
	
	@Test
	public void checkSubstract() {
		float result = calc.substract(10, 5);
		
		assertEquals(5, result, "I due numeri della sottrazione non sono uguali");
	}
	
	@Test
	public void checkDivide() throws Exception {
		float result = calc.divide(5, 2);
		
		assertEquals(2.5, result, "I due numeri della divisione non sono uguali");
	}
	
	@Test
	public void checkMultiply() {
		float result = calc.multiply(3, 10);
		
		assertEquals(30, result, "I due numeri della divisione non sono uguali");
	}
	
	@Test
	public void checkDivideException() {
		assertThrows(Exception.class, () -> calc.divide(5, 0), "Eccezione attesa");	
	}
}
