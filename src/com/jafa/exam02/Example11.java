package com.jafa.exam02;

public class Example11 {
	public static void main(String[] args) {
		// 피연산자가 char 타입이면 유니코드 값으로 비교연산을 수행한다. 
		char ch1 = 'A'; //65
		char ch2 = 'B'; //66 
		System.out.println(ch1 > ch2);
		
		// 피연산자의 타입이 같지 않으면 강제타입변환 후에 비교연산을 수행한다.
		int iValue = 10; // 비교연산시 double 타입으로 변환
		double dValue = 4.0;  
		System.out.println(iValue > dValue);
		
		// float타입과 double타입의 비교연산은 0.1을 정확하게 비교할 수 없다.
		double val1 = 2.1; 
		float val2 = 2.1f; 
		System.out.println(val1 == val2); // false!!!!
		
		// String 타입에는 대소연산자를 사용할 수 없고 동등연산자만 사용할 수 있다.
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		System.out.println(str1 == str2); // false 
		System.out.println(str2 == str3); // false
		
		// String 타입의 문자열의 비교는 equals()메소드를 사용해야한다. 
		boolean result = str2.equals(str3); 
		System.out.println(result); //true
	}
}
