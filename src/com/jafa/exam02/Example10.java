package com.jafa.exam02;

public class Example10 {
	// 비교연산자 기본 
	public static void main(String[] args) {
		int num1 = 15; 
		int num2 = 21;
		
		// 연산의 결과 : boolean 타입 반환 
		// 대소연산자 
		boolean result1 = num1 > num2;
		boolean result2 = num1 >= num2;
		boolean result3 = num1 < num2;
		boolean result4 = num1 <= num2;
		
		// 비교연산자
		boolean result5 = num1 == num2;
		boolean result6 = num1 != num2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
}
