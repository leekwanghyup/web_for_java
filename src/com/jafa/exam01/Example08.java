package com.jafa.exam01;

public class Example08 {
	
	// Ÿ�� ��ȯ (Type Casting) 
	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ : ���� ũ�⸦ ������ Ÿ���� ū ũ�⸦ ������ Ÿ�Կ� ���� �ɶ�
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// ���� : float Ÿ���� long Ÿ�Ժ��� ǥ�� ������ �� ū Ÿ���̴�. 
		int value1 = 10; 
		double value2 = value1; 
		System.out.println(value2);
		
		long value3 = 100; 
		float value4 = value3;
		System.out.println(value4);
	}
}
