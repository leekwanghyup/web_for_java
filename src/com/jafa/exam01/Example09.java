package com.jafa.exam01;

public class Example09 {
	
	// 강제타입 변환 
	public static void main(String[] args) {
		// double 타입의 변수값을 int 타입의 변수 값에 저장하려할 때 
		double value1 = 12.33;
		int value2= (int) value1; // 타입 변환을 명시해주어야 한다.
		
		// int 타입 변수값을 char 타입 변수에 저장할 때 
		int intValue = '가';
		char chValue = (char) intValue; // 타입변환 명시  
	}
}
