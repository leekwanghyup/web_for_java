package com.jafa.exam01;

public class Example10 {
	
	// ����Ŀ��� �ڵ�Ÿ�� ��ȯ 
	public static void main(String[] args) {
		// ��Ģ������ ������ ���� Ÿ���� �ǿ����ڱ⸮ ����ȴ�. 
		// ���� �ٸ� Ÿ���� �ǿ����ڸ� �����ϴ� ��� ũ�Ⱑ ū Ÿ������ �ڵ� ��ȯ �� ������ �����Ѵ�. 
		int value = 10; 
		double doubleValue = 5.5; 
		double result = value + doubleValue;
		System.out.println(result);
		
		// int Ÿ���� ������ �Ϸ��� ũ�Ⱑ ū Ÿ���� �۰� ������ȯ�ؾ��Ѵ�. 
		int result2 = value + (int)doubleValue; // int Ÿ�� ��ȯ�������� �Ҽ��� ���� ������ �ս� 
		System.out.println(result2);
		
		// byte, char, short Ÿ���� int ���� ��ȯ �� ������ ����ȴ�. 
		char ch1 = 'A'; // 65 
		char ch2 = 'B'; // 66
//		char result3 = ch1 + ch2; // ������ ����  
		int result3 = ch1 + ch2;
		System.out.println(result3);
				
	}
}
