package com.jafa.exam02;

public class Example06 {
	
	// ��Ȯ�ϰ� ����Ҷ��� �ε��Ҽ����� ������� �ʴ´�.
	public static void main(String[] args) {
		int apple = 1; 
		double piceUnit = 0.1; 
		int number = 7;
		
		// ��� = 1 - 7*0.1 = 0.3
		double result = apple - number*piceUnit;
		System.out.println(result); // 0.29999999999999993
	}
}
