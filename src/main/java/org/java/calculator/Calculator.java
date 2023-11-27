package org.java.calculator;

public class Calculator {
//	private int num1;
//	private int num2;
//	
//	Calculator(int num1, int num2){
//		setNum1(num1);
//		setNum2(num2);
//	}
//
//	public int getNum1() {
//		return num1;
//	}
//
//	public void setNum1(int num1) {
//		this.num1 = num1;
//	}
//
//	public int getNum2() {
//		return num2;
//	}
//
//	public void setNum2(int num2) {
//		this.num2 = num2;
//	}
	
	
	public float add(float num1, float num2) {
		return num1 + num2;
	}
	
	public float substract(float num1, float num2) {
		return num1 - num2;
	}
	
	public float divide(float num1, float num2) throws Exception {
		if(num2 == 0) {
			throw new Exception("Errore: Il secondo numero non può essere 0");
		}
		
		return num1 / num2;
	}
	
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
