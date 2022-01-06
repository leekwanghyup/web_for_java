package com.jafa.exam02;

import javax.script.CompiledScript;

public class Example14 {
	
	// 삼항연산자 
	public static void main(String[] args) {
		// 조건식 ? 값 또는 연산식1 : 값 또는 연산식1
		int num = 5; 
		int creteria = 3;
		String result = (num > creteria) ? "3보다 크다" : "3보다 작거나 같다"; 
		System.out.println(result);

		int score = 85; 
		char grade = (score > 90) ? 'A' : ((score>80) ? 'B':'C');
		System.out.println(grade);
		
	}
}
