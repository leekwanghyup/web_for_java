package com.jafa.exam02;

public class Example11 {
	public static void main(String[] args) {
		// �ǿ����ڰ� char Ÿ���̸� �����ڵ� ������ �񱳿����� �����Ѵ�. 
		char ch1 = 'A'; //65
		char ch2 = 'B'; //66 
		System.out.println(ch1 > ch2);
		
		// �ǿ������� Ÿ���� ���� ������ ����Ÿ�Ժ�ȯ �Ŀ� �񱳿����� �����Ѵ�.
		int iValue = 10; // �񱳿���� double Ÿ������ ��ȯ
		double dValue = 4.0;  
		System.out.println(iValue > dValue);
		
		// floatŸ�԰� doubleŸ���� �񱳿����� 0.1�� ��Ȯ�ϰ� ���� �� ����.
		double val1 = 2.1; 
		float val2 = 2.1f; 
		System.out.println(val1 == val2); // false!!!!
		
		// String Ÿ�Կ��� ��ҿ����ڸ� ����� �� ���� ������ڸ� ����� �� �ִ�.
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		System.out.println(str1 == str2); // false 
		System.out.println(str2 == str3); // false
		
		// String Ÿ���� ���ڿ��� �񱳴� equals()�޼ҵ带 ����ؾ��Ѵ�. 
		boolean result = str2.equals(str3); 
		System.out.println(result); //true
	}
}
