package com.jafa.exam01;

public class Example06 {
	/*
	 	수치가 큰 범위를 다룰 때 주로 사용 (ex 은행 및 우주관련 프로그램 )
		표현 범위 : - 2^63  ~ (2^63) - 1 
	*/
	public static void main(String[] args) {

		long value1 = -10;
		long value2 = 30L;
		System.out.println(value1);
		System.out.println(value2);
		
		// int 타입 범위를 넘을 경우 반드시 리터럴에 'L' 또는 'l'을 붙인다. 
//		long value2 = 2147483648; 
		long value3 = 2147483648L;
		System.out.println(value3);
	}
}
