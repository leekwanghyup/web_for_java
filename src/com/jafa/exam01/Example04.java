package com.jafa.exam01;

public class Example04 {
	
	// ������ ������ Ÿ�� char 
	public static void main(String[] args) {
		/*
		 	�����ڵ� : ���� ���� ���ڰ����� �ڵ尪���� ������ ����ǥ�رԾ�
		 	�ѱ�,���� �� �ϳ��� ���ڿ� ���� �ڵ� ���� �ο��Ѵ�.  
		 	�����ڵ� �� ����
			ǥ������ 0 ~ 65535(4byte)
		*/
		char ch1 = 'A'; // ���ڸ� ���� ���� 
		char ch2 = 65; // �ڵ尪���� ����
		char ch3 = '\u0041'; // 16������ ���� 
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// char�� ����� �����ڵ带 ��� �ʹٸ� �� ���� int Ÿ�Կ� �����ϸ�ȴ�. 
		char ch4 = '��';
		int getUnicode = ch4; 
		System.out.println(getUnicode);
		
	}
}
