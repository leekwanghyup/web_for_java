package com.jafa.exam02;

public class Example01 {
	// 부호연산자 
	public static void main(String[] args) {
		/*
			+ : 피연산자의 부호 유지(사용하지 않음) 
			- : 피연산자의 부호 변경
			
			char,boolean 타입을 제외한 나머지 기본타입에 사용한다. 
			(String 타입은 기본타입이 아니다.) 
			그러나 지금은 기본타입으로 생각하고 수업을 진행하겠다.
		*/
		
		int value1 = +10;
		int value2 = -10;
		System.out.println(value1);
		System.out.println(value2);
		
		int value3 = -value2;
		System.out.println(value3);
	
		// 부호연산자의 산출타입은 int로 바뀐다. 
		byte byteValue = 10; 
//		byte byteValue2 = -byteValue; // 컴파일 오류
		int intValue = -byteValue; 
	}
}
