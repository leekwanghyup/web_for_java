package com.jafa.exam02;

public class Example08 {
	
	// 0 으로 나누는 경우 
	public static void main(String[] args) {
		// ArithmeticException 예외발생 
//		double x = 5 / 0; 
//		double y = 10 % 0;
		
		// 실수타입 0.0 또는 0.0f로 나누면 예외가 발생하지 않는다. 
		double x =  5 / 0.0;
		double y = 10 % 0.0;
		System.out.println(x); // Infinity
		System.out.println(y); // NaN
		
		// Infinity 또는 NaN의 결과에 연산을 하더라도 Infinity 또는 NaN이다.  
		System.out.println(x+1); // Infinity
		System.out.println(y+1); // NaN
		
		// Infinity 여부
		boolean isInfinity = Double.isInfinite(x); // true 
		System.out.println(isInfinity);
		
		// NaN 여부 
		boolean isNaN = Double.isNaN(y); // true
		System.out.println(isNaN);
	}
}
