package com.jafa.exam02;

public class Example04 {
	
	// 산술연산자 
	public static void main(String[] args) {
		// 사칙연산과 나머지를 구하는 연산자 '%'를 포함하여 모두 5개이다. 
		
		// % 연산자 : a % b - a를 b로 나누었을 때의 나머지 
		int result1 = 10 % 4 ;  // 2
		System.out.println(result1);
		
		int num1 = 10; 
		int num2 = 4; 
		int result2 = num1 / num2; // 소수점 이하를 버리고 2만 산출된다.  
		System.out.println(result2);
		
		// 주의 : 다음의 연산결과도 마찬가지로 소수점 이하를 버리고 산출된다. 
		double result3 = num1 / num2; 
		System.out.println(result3);
		
		// 산출결과를 실수타입으로 받으려면 피연산자 중 최소 하나는 실수 타입어야 한다. 
		double result4 = (double)num1 / num2; // 둘 중 하나를 double 타입으로 변환한다. 
		System.out.println(result4);
		
		
	 
	}
}
