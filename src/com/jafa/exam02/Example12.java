package com.jafa.exam02;

public class Example12 {
	// �������� AND '&&' , OR '||'
	public static void main(String[] args) {
		// AND(����) : �ǿ����ڰ� ��� true�� ��쿡�� true�� ��ȯ�Ѵ�.
		boolean result1 = (10>5) && (4==4); // true
		System.out.println(result1);
		
		// &&�����ڴ� ���� �ǿ����ڰ� false�̸� ���� �ǿ����ڸ� ������ �ʴ´�. 
		boolean result2 = (10<5) && (4==4); // false
		System.out.println(result2);
		
		// OR(����) : ��� �ϳ��� �ǿ����ڰ� true�̸� true�� ��ȯ�Ѵ�.
		boolean result3 = (10<5) || (4 == 4); // true
		System.out.println(result3);
		
		// ||�����ڴ� ���� �ǿ����ڰ� true�̸� ���� �ǿ����ڸ� ������ �ʴ´�.
		boolean result4 = (10>5) || (4 != 4); //true
		System.out.println(result4);
	}
}
