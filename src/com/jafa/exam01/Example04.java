package com.jafa.exam01;

public class Example04 {
	
	// 정수형 데이터 타입 char 
	public static void main(String[] args) {
		/*
		 	유니코드 : 세계 각국 문자값들을 코드값으로 매핑한 국제표준규약
		 	한글,영문 등 하나의 문자에 대해 코드 값을 부여한다.  
		 	유니코드 값 저장
			표현범위 0 ~ 65535(4byte)
		*/
		char ch1 = 'A'; // 문자를 직접 저장 
		char ch2 = 65; // 코드값으로 저장
		char ch3 = '\u0041'; // 16진수로 저장 
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// char에 저장된 유니코드를 얻고 싶다면 그 값을 int 타입에 저장하면된다. 
		char ch4 = '가';
		int getUnicode = ch4; 
		System.out.println(getUnicode);
		
	}
}
