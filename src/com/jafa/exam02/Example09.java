package com.jafa.exam02;

public class Example09 {
	
	// ���ڿ� ���� ����
	public static void main(String[] args) {
		
		String subject = "Java";
		String framework = "Spring";
		System.out.println(subject + " JDK8 Ư¡");
		System.out.println(subject + " " + framework);
		
		// ���ڿ��� ���ڰ� ȥ�յ� ��� : ���ڿ��� �����(+) ���ʿ��� ���������� ����ȴ�. 		
		System.out.println(subject + 1 + 8 ); // Java18
		System.out.println( 1 + 8 +  subject); // 9Java
	}
}
