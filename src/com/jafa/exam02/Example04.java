package com.jafa.exam02;

public class Example04 {
	
	// ��������� 
	public static void main(String[] args) {
		// ��Ģ����� �������� ���ϴ� ������ '%'�� �����Ͽ� ��� 5���̴�. 
		
		// % ������ : a % b - a�� b�� �������� ���� ������ 
		int result1 = 10 % 4 ;  // 2
		System.out.println(result1);
		
		int num1 = 10; 
		int num2 = 4; 
		int result2 = num1 / num2; // �Ҽ��� ���ϸ� ������ 2�� ����ȴ�.  
		System.out.println(result2);
		
		// ���� : ������ �������� ���������� �Ҽ��� ���ϸ� ������ ����ȴ�. 
		double result3 = num1 / num2; 
		System.out.println(result3);
		
		// �������� �Ǽ�Ÿ������ �������� �ǿ����� �� �ּ� �ϳ��� �Ǽ� Ÿ�Ծ�� �Ѵ�. 
		double result4 = (double)num1 / num2; // �� �� �ϳ��� double Ÿ������ ��ȯ�Ѵ�. 
		System.out.println(result4);
		
		
	 
	}
}
