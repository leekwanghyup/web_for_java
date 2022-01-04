package com.jafa.exam02;

public class Example07 {

	// 정확한 계산을 위해 정수 연산으로 변경해서 다음과 같이 계산한다.
	public static void main(String[] args) {
		int apple = 10; 
		int piceUnit = 1; 
		int number = 7;
		
		int temp= apple - number*piceUnit;
		double result = (double) temp / 10; 
		System.out.println(result);
	}
}
