package com.jafa.exam02;

public class Example08 {
	
	// 0 ���� ������ ��� 
	public static void main(String[] args) {
		// ArithmeticException ���ܹ߻� 
//		double x = 5 / 0; 
//		double y = 10 % 0;
		
		// �Ǽ�Ÿ�� 0.0 �Ǵ� 0.0f�� ������ ���ܰ� �߻����� �ʴ´�. 
		double x =  5 / 0.0;
		double y = 10 % 0.0;
		System.out.println(x); // Infinity
		System.out.println(y); // NaN
		
		// Infinity �Ǵ� NaN�� ����� ������ �ϴ��� Infinity �Ǵ� NaN�̴�.  
		System.out.println(x+1); // Infinity
		System.out.println(y+1); // NaN
		
		// Infinity ����
		boolean isInfinity = Double.isInfinite(x); // true 
		System.out.println(isInfinity);
		
		// NaN ���� 
		boolean isNaN = Double.isNaN(y); // true
		System.out.println(isNaN);
	}
}
