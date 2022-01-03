package com.jafa.exam02;

public class Example05 {
	// 오버플로우 탐지 
	public static void main(String[] args) {
		
		// int 타입의 변수로 저장할 수 있는 최솟값과 최댓값 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int x = 1000000; 
		int y = 1000000; 
		int z = x * y; // 계산결과 10^12 오버플로우 발생 
		System.out.println(z);
	}
}
