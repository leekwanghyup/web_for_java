package com.jafa.exam02;

public class Example03 {
	
	// 전위 증가 
	public static void main(String[] args) {
		
		int x = 10; 
		System.out.println(++x); // x값 1 증가후 출력된다. 
		
		int y = 10; 
		int k = (++y) + 5;  // y 값 증가후 연산된다.
		System.out.println(k);
	}
}
