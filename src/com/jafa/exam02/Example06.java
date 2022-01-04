package com.jafa.exam02;

public class Example06 {
	
	// 정확하게 계산할때는 부동소수점을 사용하지 않는다.
	public static void main(String[] args) {
		int apple = 1; 
		double piceUnit = 0.1; 
		int number = 7;
		
		// 결과 = 1 - 7*0.1 = 0.3
		double result = apple - number*piceUnit;
		System.out.println(result); // 0.29999999999999993
	}
}
