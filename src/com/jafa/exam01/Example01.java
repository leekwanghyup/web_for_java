package com.jafa.exam01;

public class Example01 {
	
	// 변수 선언과 초기화 
	public static void main(String[] args) {
		/*
		 변수 선언 
			 String person;
			 변수타입  변수이름
		 	 변수타입은 여러종류가 있다. 예제의 변수타입은 문자열이다.
		 변수 초기화 
		 	person = "lee";
		*/
		String person; // 변수 선언 
		person = "lee"; // 변수 초기화, 직접 입력된 값을 리터럴이라고 부른다.
		System.out.println(person);
		
		// 같은 타입의 변수를 여러개러를 동시에 선언할 수 있다.
		int num1, num2, num3; 
		num1 = 1;
		num2 = 2; 
		num3 = 3;
		
		// 초기화되지 않은 변수는 읽을 수 없다. 
		int value; 
//		System.out.println(value); // 컴파일 오류
		
		// 선언과 초기화를 동시에 할 수 있다.  
		String member = "kim";
		System.out.println(member);
	}
}
