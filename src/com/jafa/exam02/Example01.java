package com.jafa.exam02;

public class Example01 {
	// ��ȣ������ 
	public static void main(String[] args) {
		/*
			+ : �ǿ������� ��ȣ ����(������� ����) 
			- : �ǿ������� ��ȣ ����
			
			char,boolean Ÿ���� ������ ������ �⺻Ÿ�Կ� ����Ѵ�. 
			(String Ÿ���� �⺻Ÿ���� �ƴϴ�.) 
			�׷��� ������ �⺻Ÿ������ �����ϰ� ������ �����ϰڴ�.
		*/
		
		int value1 = +10;
		int value2 = -10;
		System.out.println(value1);
		System.out.println(value2);
		
		int value3 = -value2;
		System.out.println(value3);
	
		// ��ȣ�������� ����Ÿ���� int�� �ٲ��. 
		byte byteValue = 10; 
//		byte byteValue2 = -byteValue; // ������ ����
		int intValue = -byteValue; 
	}
}
