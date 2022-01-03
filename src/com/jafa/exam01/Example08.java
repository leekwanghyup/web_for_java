package com.jafa.exam01;

public class Example08 {
	
	// 타입 변환 (Type Casting) 
	public static void main(String[] args) {
		// 자동 타입 변환 : 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장 될때
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// 주의 : float 타입은 long 타입보다 표현 범위가 더 큰 타입이다. 
		int value1 = 10; 
		double value2 = value1; 
		System.out.println(value2);
		
		long value3 = 100; 
		float value4 = value3;
		System.out.println(value4);
	}
}
