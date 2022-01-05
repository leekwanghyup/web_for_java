package com.jafa.exam02;

public class Example09 {
	
	// 문자열 연결 연산
	public static void main(String[] args) {
		
		String subject = "Java";
		String framework = "Spring";
		System.out.println(subject + " JDK8 특징");
		System.out.println(subject + " " + framework);
		
		// 문자열과 숫자가 혼합된 경우 : 문자열의 연산식(+) 왼쪽에서 오른쪽으로 진행된다. 		
		System.out.println(subject + 1 + 8 ); // Java18
		System.out.println( 1 + 8 +  subject); // 9Java
	}
}
