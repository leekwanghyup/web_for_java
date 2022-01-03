package com.jafa.exam02;

public class Example02 {
	
	//증감 연산자 
	public static void main(String[] args) {
		
		// 후위 증가 예제1 
		int x = 10;
		System.out.println(x++); // 10 출력이 되고 11이 출력된다.  
		System.out.println(x);
		System.out.println("-------------");
		
		// 후위 증가 예제2 
		int y = 10;
		int k = (y++) + 10; // y값은 10이다. 
		
		System.out.println(k);
		System.out.println("연산후 : " + y); // y값은 11이다. 
		System.out.println("-------------");
		
	}
}
