package com.jafa.exam02;

public class Example02 {
	
	//���� ������ 
	public static void main(String[] args) {
		
		// ���� ���� ����1 
		int x = 10;
		System.out.println(x++); // 10 ����� �ǰ� 11�� ��µȴ�.  
		System.out.println(x);
		System.out.println("-------------");
		
		// ���� ���� ����2 
		int y = 10;
		int k = (y++) + 10; // y���� 10�̴�. 
		
		System.out.println(k);
		System.out.println("������ : " + y); // y���� 11�̴�. 
		System.out.println("-------------");
		
	}
}
