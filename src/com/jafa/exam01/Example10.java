package com.jafa.exam01;

public class Example10 {
	
	// 연산식에서 자동타입 변환 
	public static void main(String[] args) {
		// 원칙적으로 연산은 같은 타입의 피연산자기리 수행된다. 
		// 서로 다른 타입의 피연산자를 연산하는 경우 크기가 큰 타입으로 자동 변환 후 연산을 수행한다. 
		int value = 10; 
		double doubleValue = 5.5; 
		double result = value + doubleValue;
		System.out.println(result);
		
		// int 타입의 연산을 하려면 크기가 큰 타입을 작게 강제변환해야한다. 
		int result2 = value + (int)doubleValue; // int 타입 변환과정에서 소수점 이하 데이터 손실 
		System.out.println(result2);
		
		// byte, char, short 타입은 int 으로 변환 후 연산이 수행된다. 
		char ch1 = 'A'; // 65 
		char ch2 = 'B'; // 66
//		char result3 = ch1 + ch2; // 컴파일 오류  
		int result3 = ch1 + ch2;
		System.out.println(result3);
				
	}
}
