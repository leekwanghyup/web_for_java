package com.jafa.exam01;

public class Example05 {
	
	// ������ Ÿ�� : int
	public static void main(String[] args) {
		/*
		   ���� ������ ���� �⺻Ÿ�� 
		   byte, short Ÿ�� ������ �����ϸ� int���� ��ȯ�ȴ�.
		   ǥ������ : -2147483648 ~ 2147483647 (4byte)
		*/
		int value1 = 10; 
		int value2 = 13; 
		int value3 = -5;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// int Ÿ�� ǥ�� ���� (�ܿ��ʿ� ����)
		int min = -2147483648;
		int max = 2147483647;
		System.out.println(min);
		System.out.println(max);
		
//		int ltMin = -2147483649;
//		int gtMax = 2147483648; 
		
		// �����ڵ尪�� �ش��ϴ� ���ڸ� ������ �� �ִ�.
		int unicodeA = 'A';
		int unicodeKa = '��';
		System.out.println(unicodeA);
		System.out.println(unicodeKa);
		
	}
}
