package com.jafa.exam01;

public class Example05 {
	
	// 정수형 타입 : int
	public static void main(String[] args) {
		/*
		   정수 연산을 위한 기본타입 
		   byte, short 타입 변수를 연산하면 int으로 변환된다.
		   표현범위 : -2147483648 ~ 2147483647 (4byte)
		*/
		int value1 = 10; 
		int value2 = 13; 
		int value3 = -5;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// int 타입 표현 범위 (외울필요 없음)
		int min = -2147483648;
		int max = 2147483647;
		System.out.println(min);
		System.out.println(max);
		
//		int ltMin = -2147483649;
//		int gtMax = 2147483648; 
		
		// 유니코드값에 해당하는 문자를 저장할 수 있다.
		int unicodeA = 'A';
		int unicodeKa = '가';
		System.out.println(unicodeA);
		System.out.println(unicodeKa);
		
	}
}
