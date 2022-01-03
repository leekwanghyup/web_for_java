package com.jafa.exam01;

public class Example02 {
	
	// 변수 선언 규칙 
	public static void main(String[] args) {
		// 대소문자를 구분한다. 
		String member = "lee"; 
		String Member = "kim"; // 관례적으로 변수명의 첫글자는 대문자로 하지 않는다.
		System.out.println(member);
		System.out.println(Member);
		
		// 첫 글자는 문자 또는 '$','_', 숫자를 사용할 수 없다.
		String $member; 
		String _member; 
//		String 1member; // 변수명 첫글자 숫자사용 - 컴파일 오류
	}
}
