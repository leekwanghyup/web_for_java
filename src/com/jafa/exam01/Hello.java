package com.jafa.exam01; // 이 클래스파일이 위치한 패키지 선언

// 클래스 선언
// 하나의 파일에 하나의 public 클래스만 존재해야 한다.
// 파일이름과 public 클래스명은 동일해야한다.
// 하나의 파일에 public이 아닌 클래스 파일이 둘 이상 존재 할 수있다. 
public class Hello {
	
	// 메인메서드 
	public static void main(String[] args) {
	/*
		public : 접근제어 지시자 
		static : 정적메서드
		void : 반환형 - 아무런 결과도 반환하지 않는다. 
		main : 메소드 이름,  실행 프로그램의 진입점, 메인메소드의 이름은 변경 불가  
		args : 메인메소드가 전달 받는 파라미터
		String[] : args의 데이터 타입 - 문자열 배열 
	*/	
		
		// 콘솔출력을 담당하는 메서드 
		// ';'(세미콜론) : 실행문의 끝을 알림 
		System.out.println("Hello World!");
	}
}
