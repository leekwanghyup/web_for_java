package com.jafa.exam02;

import javax.script.CompiledScript;

public class Example14 {
	
	// ���׿����� 
	public static void main(String[] args) {
		// ���ǽ� ? �� �Ǵ� �����1 : �� �Ǵ� �����1
		int num = 5; 
		int creteria = 3;
		String result = (num > creteria) ? "3���� ũ��" : "3���� �۰ų� ����"; 
		System.out.println(result);

		int score = 85; 
		char grade = (score > 90) ? 'A' : ((score>80) ? 'B':'C');
		System.out.println(grade);
		
	}
}
